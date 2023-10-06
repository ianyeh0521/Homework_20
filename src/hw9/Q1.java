package hw9;

public class Q1 implements Runnable {

	private int counter = 1;
	private String name;

	public Q1(String name) {
		this.name = name;
	}

	public void run() {
		while (counter < 11) {
			System.out.println(name + "吃第" + counter + "碗飯");
			if (counter == 10) {
				System.out.println(name + "吃完了！");
			}
			try {
				Thread.sleep((int) (Math.random() * 2501 + 500)); // 暫停一秒
			} catch (Exception e) {
			}
			counter++;
		}
	}

	public static void main(String[] args) {
		Q1 n1 = new Q1("饅頭人");
		Thread p1 = new Thread(n1);
		Q1 n2 = new Q1("詹姆士");
		Thread p2 = new Thread(n2);
		System.out.println("-----大胃王快食比賽開始！-----");
		p1.start();
		p2.start();

		try {
			p1.join();
			p2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");

	}
}
