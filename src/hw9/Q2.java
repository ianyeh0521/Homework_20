package hw9;

class Acct {

	private int acctBalance = 0;
	private int brownCount = 0;
	private int momCount = 0;
	private Boolean momWhileCount = false;
	private Boolean brownWhileCount = false;

	synchronized public void transfer(int money) {

		while (acctBalance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				momWhileCount = true;
				momCount += 1;
				if (brownCount == 10) {
					break;
				}
				System.out.println("熊大被老媽告知帳戶已經有錢！");
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (brownCount < 10 && momWhileCount != true) {
			acctBalance += money;
			momCount += 1;
			System.out.println("媽媽存了：" + money + "，帳戶共有：" + acctBalance);
		} else if (brownCount < 10 && momWhileCount == true) {
			acctBalance += money;
			System.out.println("媽媽存了：" + money + "，帳戶共有：" + acctBalance);
			momWhileCount = false;
		}
	}

	synchronized public void withdraw(int money) {

		if (acctBalance < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			if (momCount < 10) {
				System.out.println("媽媽被熊大要求匯款");
				notify();
			}
		}

		while (acctBalance < money) {
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				brownWhileCount = true;
				brownCount += 1;
				if (momCount == 10) {
					break;
				}
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (brownWhileCount == false) {
			acctBalance -= money;
			brownCount += 1;
			System.out.println("熊大領了：" + money + "，帳戶共有：" + acctBalance);

		} else {
			acctBalance -= money;
			System.out.println("熊大領了：" + money + "，帳戶共有：" + acctBalance);
			brownWhileCount = false;
		}
		notify();

	}
}

class Brown extends Thread {
	Acct dollar;

	public Brown(Acct dollar) {
		this.dollar = dollar;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			dollar.withdraw(1000);
	}
}

class Mom extends Thread {
	Acct dollar;

	public Mom(Acct dollar) {
		this.dollar = dollar;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			dollar.transfer(2000);
		}

	}
}

public class Q2 {
	public static void main(String[] args) {
		Acct dollar = new Acct();
		Mom mom = new Mom(dollar);
		Brown brown = new Brown(dollar);

		mom.start();
		brown.start();

	}

}
