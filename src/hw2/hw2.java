package hw2;

public class Hw2 {

	public static void main(String[] args) {

		// 1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1. " + sum1);
		System.out.println();

		
		// 2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println("2. " + sum2);
		System.out.println();

		
		// 3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum3 = 1;
		int count1 = 1;
		while (count1 <= 10) {
			sum3 *= count1;
			count1 += 1;
		}
		System.out.println("3. " + sum3);
		System.out.println();

		
		// 4.請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		System.out.print("4. ");
		for (int i = 1; i <= 10; i++) {
			System.out.print((i * i) + " ");
		}
		System.out.println();
		System.out.println();

		
		// 5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.print("5. ");
		int countNum = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i % 10) == 4 || (i / 10) == 4) {
				continue;
			} else {
				countNum += 1;
				System.out.print(i + " ");
			}
		}
		System.out.println("總共有" + countNum + "個");
		System.out.println();

		
		// 6.
		System.out.println("6. ");
		int count2 = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= count2; j++) {
				System.out.print(j + " ");
			}
			count2 -= 1;
			System.out.println();
		}
		System.out.println();

		
		// 7.
		System.out.println("7. ");
		int asciiValue = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) asciiValue);
			}
			asciiValue += 1;
			System.out.println();
		}
		System.out.println();

		
		// 8. 99乘法表的組合（課堂練習）
		// 1.使用 for 迴圈 + while 迴圈
		System.out.println("8. ");
		System.out.println("使用 for 迴圈 + while 迴圈：");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t"); // "\t" 就是 tab 鍵對齊
				j += 1;
			}
			System.out.println();
		}
		System.out.println();

		
		// 2.使用 for 迴圈 + do while 迴圈
		System.out.println("使用 for 迴圈 + do while 迴圈：");
		for (int i = 1; i <= 9; i++) {
			int q = 1;
			do {
				System.out.print(i + "*" + q + "=" + (i * q) + "\t");
				q += 1;
			} while (q <= 9);
			System.out.println();
		}
		System.out.println();

		
		// 3.使用 while 迴圈 + do while 迴圈
		System.out.println("使用 while 迴圈 + do while 迴圈：");
		int k = 1;
		while (k <= 9) {
			int s = 1;
			do {
				System.out.print(k + "*" + s + "=" + (k * s) + "\t");
				s += 1;
			} while (s <= 9);
			System.out.println();
			k += 1;
		}
	}

}
