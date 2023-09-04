package hw1;

import java.security.DomainCombiner;
import java.util.Iterator;

public class hw1 {
	
	public static void main(String[] args) {
		// 1.請設計一支 Java 程式，計算 12, 6 這兩個數值的和與積
		System.out.println("12*6="+12*6+"，"+"12+6="+(12+6));
		
		// 2.請設計一支 Java 程式，計算 200 顆蛋共是幾打幾顆?
		System.out.printf("200 顆蛋共是%d打%d顆%n", 200/12, 200%12);
		
		// 3.請由程式算出 256559 秒為多少天、多少小時、多少分與多少秒
		System.out.printf("256559秒為%d天%d小時%d分與%d秒%n", 256559/86400, (256559%86400)/3600, ((256559%86400)%3600)/60, ((256559%86400)%3600)%60);
	
		// 4.請定義一個常數為 3.1415(圓周率),並計算半徑為 5 的圓面積與圓周長
		final double pi = 3.1415;
		System.out.printf("半徑為 5 的圓面積為%f，圓周長為%f%n", 5*5*pi, 5*2*pi);
		
		// 5.某人在銀行存入 150 萬,銀行利率為 2%,如果每年利息都繼續存入銀行,請用程式計算 10 年後,本金加利息共有多少錢
		int m = 150;
		double r = 0.02;
		System.out.println("10年後，本金加利息共有"+(m*Math.pow((1+r), 10))+"萬元");
		
		/* 6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
				5 + 5
				5 + ‘5’
				5 + “5”
				並請用註解各別說明答案的產生原因*/
		
		System.out.println(5 + 5);      // 為整數 5+5=10
		System.out.println(5 +'5');		// 為 字元 5 的十進位制為 53，故為 5+53=58
		System.out.println(5 + "5");	// String 和 int 做相加，Java 會將其轉換為字串相加，故結果為"5"+"5"
	}
}
