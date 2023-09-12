package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3 {

	public static void main(String[] args) {
		// 1. 三角形 + 直角三角形
		yourNum numTri = new yourNum();
		int[] numIn = numTri.getYourNum();
		numTri.decTri(numIn);
		System.out.println("==================");

		// 2. 猜數字 0~100
		guessNum numGue = new guessNum();
		int randomNumber = numGue.randomNum();
		numGue.testNum(randomNumber);
		System.out.println("=========================");

		// 3. 大樂透 + 進階挑戰
		lottery tryLottery = new lottery();
		String hatedNum = tryLottery.getHatedNum();

		// 原題
		tryLottery.printNum(hatedNum);

		// 印 6 個不重複亂數
		tryLottery.getRandomNumArray(hatedNum);

	}

	// 第一題
	public static class yourNum {
		public int[] getYourNum() {
			int[] numList = new int[3];
			System.out.println("請輸入三個整數");
			for (int i = 0; i < numList.length; i++) {
				Scanner sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					numList[i] = sc.nextInt();
				}
			}
			for (int i = 0; i < numList.length; i++) {
				System.out.print(numList[i] + " ");
			}
			System.out.println();
			return numList;
		}

		public void decTri(int[] numIn) {
			Arrays.sort(numIn);
			// 判斷是否為三角形
			if ((numIn[0] + numIn[1] > numIn[2]) && (numIn[2] - numIn[1] < numIn[0])) {
				if (numIn[0] == numIn[1] && numIn[0] == numIn[2]) {
					System.out.println("正三角形");
				} else if (numIn[0] == numIn[1] || numIn[0] == numIn[2] || numIn[1] == numIn[2]) {
					System.out.println("等腰三角形");
				} else if (Math.pow(numIn[0], 2) == Math.pow(numIn[1], 2) + Math.pow(numIn[2], 2)
						|| Math.pow(numIn[1], 2) == Math.pow(numIn[0], 2) + Math.pow(numIn[2], 2)
						|| Math.pow(numIn[2], 2) == Math.pow(numIn[0], 2) + Math.pow(numIn[1], 2)) {
					System.out.println("直角三角形");
				} else {
					System.out.println("其他三角形");
				}
			} else {
				System.out.println("不是三角形");
			}
		}

	}

	// 第二題
	public static class guessNum {

		// 產生隨機數
		public int randomNum() {
			int ranNum = (int) (Math.random() * 101);
			return ranNum;
		}

		// 輸入並比對
		public void testNum(int randnum) {
			System.out.println("開始猜 0~100 的數字吧！");
			while (true) {
				Scanner sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					int guNum = sc.nextInt();
					if (guNum == randnum) {
						System.out.println("答對了！答案就是 " + guNum);
						break;
					} else if (guNum > randnum) {
						System.out.println("猜錯囉！你猜的大於正確答案");
					} else {
						System.out.println("猜錯囉！你猜的小於正確答案");
					}
				} else {
					System.out.println("請輸入 0~100 的數字喔");
				}
			}

		}
	}

	// 第三題
	public static class lottery {

		public String getHatedNum() {
			System.out.println("阿文...請輸入 1~9 中你討厭哪個數字？");
			Scanner sc = new Scanner(System.in);
			String hatedNum = sc.next();
			return hatedNum;

		}

		public void printNum(String hatedNum) {
			// 印 1~49
			int count = 0;
			for (int i = 1; i <= 49; i++) {
				// 判斷是否有選定數字在其中
				if (String.valueOf(i).contains(hatedNum)) {
					continue;
				} else {
					// 整理成 6 個一行
					if (count % 6 == 0 && count != 0) {
						System.out.println();
						System.out.print(String.valueOf(i) + " " + "\t");
						count += 1;
					} else {
						System.out.print(String.valueOf(i) + " " + "\t");
						count += 1;
					}
				}
			}
			System.out.println();
			System.out.println("總共有 " + count + " 個數字可選");

		}

		// 第三題進階挑戰功能

		public void getRandomNumArray(String hatedNum) {
			int[] numArray = new int[6];

			int arrayCount = 0;

			while (arrayCount < 6) {
				int ranNum = (int) (Math.random() * 49) + 1;

				if (String.valueOf(ranNum).contains(hatedNum)) {
					continue;
				} else {
					int diffCount = 0;
					for (int i = 0; i <= arrayCount; i++) {
						if (numArray[i] != ranNum) {
							diffCount += 1;
						}
					}

					if (diffCount == arrayCount + 1) {
						numArray[arrayCount] = ranNum;
						arrayCount += 1;
					}
				}
			}

			System.out.println();
			System.out.print("幫你隨機選好 6 個不重複的數字囉： ");
			for (int i = 0; i < numArray.length; i++) {
				System.out.print(numArray[i] + " ");
			}
		}

	}

}
