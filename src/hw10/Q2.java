package hw10;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Q2 {

	public static void main(String[] args) {

		String tempStr = getWords();
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號：");
		Scanner sc1 = new Scanner(System.in);
		int nexInt = sc1.nextInt();
		
		if (nexInt == 1) {
			thousand(tempStr);
		} else if (nexInt == 2) {
			percentage(tempStr);
		} else if (nexInt == 3) {
			scientificNota(tempStr);
		}
		


	}

	public static String getWords() {
		System.out.print("請輸入數字: ");
		Scanner sc = new Scanner(System.in);
		String strNum = sc.next();
		
		while (!strNum.matches("^[0-9.]+$")) {
			System.out.println("格式輸入不正確，請再輸入一次!");
			getWords();
		}
		

		return strNum;
	}

	// (1) 千分位
	public static void thousand(String tempStr) {
		System.out.print("千分位數字：");
		BigDecimal bigDecNum1 = BigDecimal.valueOf(Double.parseDouble(tempStr)).stripTrailingZeros();
		System.out.println(String.format("%,." + bigDecNum1.scale() + "f", bigDecNum1));
	}

	// (2) 百分比
	public static void percentage(String tempStr) {
		System.out.print("百分比：");
		BigDecimal bigDecNum2 = BigDecimal.valueOf(Double.parseDouble(tempStr));
		System.out.println((bigDecNum2.multiply(BigDecimal.valueOf(100)).stripTrailingZeros()).toPlainString() + "%");

	}

	// (3) 科學記號
	public static void scientificNota(String tempStr) {
		System.out.print("科學記號：");
		BigDecimal bigDecNum3 = BigDecimal.valueOf(Double.parseDouble(tempStr));
		DecimalFormat format = new DecimalFormat("0.#E00");
		System.out.println(format.format(bigDecNum3));
	}

}
