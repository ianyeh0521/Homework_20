package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.math.BigInteger;

public class Q1 {

	public static void main(String[] args) {

		ArrayList obj1 = new ArrayList();
		obj1.add(new Integer(100));
		obj1.add(new Double(3.14));
		obj1.add(new Long(21L));
		obj1.add(new Short("100"));
		obj1.add(new Double(5.1));
		obj1.add("Kitty");
		obj1.add(new Integer(100));
		obj1.add(new Object());
		obj1.add("Snoopy");
		obj1.add(new BigInteger("1000"));

		// 印出這個物件裡的所有元素(使用 Iterator, 傳統 for 與 foreach)
		// 使用Iterator
		System.out.println("以迭代器印出：");
		for (Iterator itr = obj1.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// 使用傳統 for 迴圈
		System.out.println("以 for 印出：");
		for (int i = 0; i < obj1.size(); i++) {
			System.out.print(obj1.get(i) + " ");
		}
		System.out.println();

		// 使用 foreach
		System.out.println("以 foreach 印出：");
		for (Object obj : obj1) {
			System.out.print(String.valueOf(obj) + " ");
		}
		System.out.println();

		// 移除不是 java.lang.Number 相關的物件
		for (int i = 0, len = obj1.size(); i < len; i++) {
			if (obj1.get(i).getClass().getName().equals("java.lang.Integer")
					|| obj1.get(i).getClass().getName().equals("java.lang.Double")
					|| obj1.get(i).getClass().getName().equals("java.lang.Float")
					|| obj1.get(i).getClass().getName().equals("java.lang.Short")
					|| obj1.get(i).getClass().getName().equals("java.lang.Byte")
					|| obj1.get(i).getClass().getName().equals("java.lang.Long")) {
			} else {
				obj1.remove(i);
				len--;
				i--;
			}
		}

		// 再次印出這個集合物件的所有元素, 觀察是否已將非 Number 相關的物件移除成功
		for (Object obj : obj1) {
			System.out.print(String.valueOf(obj) + " ");
		}

		System.out.println();

	}
}
