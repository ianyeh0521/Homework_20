package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
	
		int[] calcs = new int[2];
		
		try {
			System.out.println("請輸入x的值：");
			Scanner sc1 = new Scanner(System.in);
			
			if (sc1.hasNextInt()) {
				System.out.println("請輸入y的值：");
				for(int i = 0; i < calcs.length; i++) {
					calcs[i] = sc1.nextInt();
				}
			}
			else {
				throw new CalException("輸入格式不正確");
			}
			
			Calculator c = new Calculator(calcs[0], calcs[1]);
			System.out.println(c.powerXY());
			
		}catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}
}
