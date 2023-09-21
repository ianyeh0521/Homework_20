package hw5;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {

		// 1.
		System.out.println("請輸入長方形寬與高：");
		starSquare(getWandH(), getWandH());
		System.out.print("\n==============\n");

		// 2.
		randAvg();
		System.out.print("\n==============\n");

		// 3.
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Hw5 w = new Hw5();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		System.out.print("\n==============\n");

		// 5.
		System.out.print("本次隨機產生的驗證碼為：" + "\n" + genAuthCode());

	}

	// 1. 請設計一個方法為 starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
	// 輸入長寬並回傳長寬的陣列
	public static int getWandH() {
		Scanner sc1 = new Scanner(System.in);
		return sc1.nextInt();
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 2. 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void randAvg() {
		System.out.println("本次亂數結果：");
		int sumRanNum = 0;
		int[] ranNum = new int[10];
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] = (int) (Math.random() * 101);
			sumRanNum += ranNum[i];
			System.out.print(ranNum[i] + " ");
		}
		System.out.println();
		System.out.println("平均值為：" + sumRanNum / ranNum.length);
	}

	// 3.利用 Overloading,設計兩個方法 int maxElement(int x[][]) 與 double maxElement(double
	// x[][]),可以找出二維陣列的最大值並回傳
	int maxElement(int x[][]) {
		int maxNum = x[0][0];
		for (int i = 1; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				if (x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}

	double maxElement(double x[][]) {
		double maxNum = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[1].length; j++) {
				if (x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}

	// 5. 請設計一個方法 genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合
	public static String genAuthCode() {
		char[] authCode = new char[8];
		for (int i = 0; i < authCode.length; i++) {

			do {
				authCode[i] = (char) (Math.random() * 74 + 48);
			} while ((58 <= authCode[i] && authCode[i] <= 64) || (91 <= authCode[i] && authCode[i] <= 96));

		}

		String authCodeStr = String.valueOf(authCode);

		return authCodeStr;
	}

}
