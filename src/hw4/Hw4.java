package hw4;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Hw4 {

	public static void main(String[] args) {

		// 1. 一維陣列，大於平均的元素
		int[] arrayA = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0;

		for (int i = 0; i < arrayA.length; i++) {
			sum += arrayA[i];
		}
		double avg = sum / arrayA.length;
		System.out.println("平均 = " + avg);
		System.out.print("大於平均值的元素為： ");

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] > avg) {
				System.out.print(arrayA[i] + " ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("==================");
		System.out.println();

		// 2. 請建立一個字串,經過程式執行後,輸入結果是反過來的
		System.out.println("請輸入一個字串，幫你反轉:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int strLength = s.length();
		char[] arrReverse = new char[strLength];

		for (int i = 0; i < s.length(); i++) {
			arrReverse[i] = s.charAt(strLength - 1);
			strLength -= 1;
		}

		for (int i = 0; i < arrReverse.length; i++) {
			System.out.print(String.valueOf(arrReverse[i]));
		}

		System.out.println();
		System.out.println();
		System.out.println("==================");

		// 3. 有個字串陣列如下 (八大行星):
		// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”,
		// “neptune”}
		// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] arrayB = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowCount = 0;
		for (int i = 0; i < arrayB.length; i++) {
			for (int j = 0; j < arrayB[i].length(); j++) {
				switch (arrayB[i].charAt(j)) {
				case 'a', 'e', 'i', 'o', 'u' -> vowCount += 1;
				default -> vowCount += 0;
				}
			}
		}
		System.out.println();
		System.out.println("總共有 " + vowCount + " 個母音");
		System.out.println();
		System.out.println("==================");
		System.out.println();

		// 4. 阿文忘了帶錢包
		int[][] emp = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.print("請輸入預借金額: ");
		Scanner sc2 = new Scanner(System.in);
		int cashNeeded = sc2.nextInt();
		int countGoodPpl = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int j = 0; j < emp[0].length; j++) {
			if (emp[1][j] >= cashNeeded) {
				countGoodPpl += 1;
				System.out.print(emp[0][j] + " ");
			}
		}
		System.out.print("共 " + countGoodPpl + " 人!");
		System.out.println();
		System.out.println();
		System.out.println("==================");
		System.out.println();

		// 5. 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
		System.out.println("請輸入三個整數，分別代表分別代表西元yyyy年, mm月, dd日");
		doAll();
		System.out.println();
		System.out.println("==================");
		System.out.println();

		// 6. 班上有8位同學,他們進行了6次考試結果如下，請算出每位同學考最高分的次數
		int[][] sixTests = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }

		};

		int[][] sortedSixTest = new int[6][];

		// 複製原二維陣列並排序
		for (int i = 0; i < sixTests.length; i++) {
			sortedSixTest[i] = Arrays.copyOf(sixTests[i], 8);
			Arrays.sort(sortedSixTest[i]);
		}

		int[] arraySaveWins = new int[8];

		// 比對原陣列與排序完的陣列，尋找每個人最高分次數
		for (int i = 0; i < sixTests.length; i++) {
			for (int j = 0; j < sixTests[i].length; j++) {
				if (sixTests[i][j] == sortedSixTest[i][sortedSixTest[i].length - 1]) {
					arraySaveWins[j] += 1;
				}
			}
		}

		System.out.println("每位同學考最高分的次數如下:");
		for (int i = 0; i < arraySaveWins.length - 1; i++) {
			System.out.print((i + 1) + "號" + arraySaveWins[i] + "次" + ", ");
		}
		System.out.print((arraySaveWins.length - 1) + "號" + arraySaveWins[arraySaveWins.length - 1] + "次");
	}

	// 5.
	public static void doAll() {
		decYear(getYear());
	}

	public static int[] getYear() {

		Scanner sc3 = new Scanner(System.in);
		int[] arrayYear = new int[3];

		// 判斷是否輸入整數
		for (int i = 0; i < arrayYear.length; i++) {
			if (sc3.hasNextInt()) {
				arrayYear[i] = sc3.nextInt();
			} else {
				System.out.println("請重新輸入三個整數");
				doAll();
			}
		}

		return arrayYear;

	}

	public static void decYear(int[] arrayYear) {
		int daysCount = 0;
		int[] nonLeapYearDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapYearDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 判斷是否為閏年
		int deterLeapYear = 0;
		if (arrayYear[0] % 4 == 0) {
			if (arrayYear[0] % 100 == 0) {
				if (arrayYear[0] % 400 == 0) { // 為閏年
					deterLeapYear = 1;
				} else { // 非閏年
					deterLeapYear = 0;
				}
			} else { // 為閏年
				deterLeapYear = 1;
			}
		} else { // 非閏年
			deterLeapYear = 0;
		}

		// 判斷月份及日期是否正常，並執行
		// 年月日輸入錯誤的		
		if ((arrayYear[0] < 0 || arrayYear[1] < 0 || arrayYear[2] < 0)
				|| arrayYear[1] > 12 
				|| (arrayYear[2] > 31) || ((arrayYear[1] == 4 || arrayYear[1] == 6 || arrayYear[1] == 9 || arrayYear[1] == 11) && arrayYear[2] > 30) 
				|| ((arrayYear[1] == 2 && arrayYear[2] > 29) || (arrayYear[1] == 2 && deterLeapYear == 0 && arrayYear[2] == 29))) {
			System.out.println("日期輸入錯誤，請重新輸入正確年月日");
			doAll();
		// 輸入正確的
		} else {
			// 非閏年
			if(deterLeapYear == 0) {
				for(int i = 0; i < arrayYear[1] - 1; i++) {
					daysCount += nonLeapYearDay[i];
				}
				daysCount += arrayYear[2];
			// 閏年
			}else {
				for(int i = 0; i < arrayYear[1] - 1; i++) {
					daysCount += leapYearDay[i];
				}
				daysCount += arrayYear[2];
			}
			
			
			// 原本 switch...case fall through 作法，但好長看了不太舒服
//			switch (arrayYear[1]) {
//			case 12:
//					daysCount += arrayYear[2];
//			case 11:
//				if (arrayYear[1] == 11) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 30;
//				}
//			case 10:
//				if (arrayYear[1] == 10) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}
//			case 9:
//				if (arrayYear[1] == 9) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 30;
//				}
//			case 8:
//				if (arrayYear[1] == 8) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}
//			case 7:
//				if (arrayYear[1] == 7) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}
//			case 6:
//				if (arrayYear[1] == 6) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 30;
//				}
//			case 5:
//				if (arrayYear[1] == 5) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}
//			case 4:
//				if (arrayYear[1] == 4) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 30;
//				}
//			case 3:
//				if (arrayYear[1] == 3) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}
//			case 2:
//				// 非閏年
//				if (deterLeapYear == 0) {
//					daysCount += 28;
//					// 閏年
//				} else {
//					daysCount += 29;
//				}
//			case 1:
//				if (arrayYear[1] == 1) {
//					daysCount += arrayYear[2];
//				} else {
//					daysCount += 31;
//				}

			System.out.println("輸入日期為該年第" + daysCount + "天");
		}

	}

}