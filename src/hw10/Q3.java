package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) throws ParseException {

		String tempDates = getDates();
		System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		Scanner sc1 = new Scanner(System.in);
		int nexInt = sc1.nextInt();
		Date date1 = new SimpleDateFormat("yyyyMMdd").parse(tempDates);

		if (nexInt == 1) {
			System.out.println("年/月/日：" + new SimpleDateFormat("yyyy/MM/dd").format(date1));
		} else if (nexInt == 2) {
			System.out.println("月/日/年：" + new SimpleDateFormat("MM/dd/yyyy").format(date1));
		} else if (nexInt == 3) {
			System.out.println("日/月/年：" + new SimpleDateFormat("dd/MM/yyyy").format(date1));
		} else {
			System.out.println("格式輸入不正確，請再輸入一次!");
			getDates();
		}

	}

	public static String getDates() {
		System.out.print("請輸入日期（年月日，例如：20110131）: ");
		Scanner sc = new Scanner(System.in);
		String strDate = sc.next();

		while (!strDate.matches("^[0-9]+$")) {
			System.out.println("格式輸入不正確，請再輸入一次!");
			getDates();
		}

		return strDate;
	}
}
