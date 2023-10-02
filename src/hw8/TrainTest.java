package hw8;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TrainTest {

	public static void main(String[] args) {

		Train[] train = new Train[7];
		train[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Train(1254, "區間", "屏東", "基隆", 700);

		// (1)請寫一隻程式,能印出不重複的 Train 物件
		Set<Train> set1 = new HashSet<Train>();
		for (int i = 0; i < train.length; i++) {
			set1.add(train[i]);
		}

		// 迭代器方式印出
		System.out.println("(1)以迭代器印出：");
		Iterator<Train> itr = set1.iterator();
		while (itr.hasNext()) {
			Train temp = (Train) itr.next();
			System.out.print(temp.getAll());
			System.out.println();
		}
		System.out.println("========================");

		// foreach 方式印出
		System.out.println("(1)以 foreach 印出：");
		for (Train temp : set1) {
			System.out.print(temp.getAll());
			System.out.println();
		}
		System.out.println("========================");

		// (2)請寫一隻程式,讓 Train 物件印出時,能以班次編號由大到小印出
		List<Train> list1 = new ArrayList<Train>();
		for (int i = 0; i < train.length; i++) {
			list1.add(train[i]);
		}

		Collections.sort(list1);

		// 迭代器方式印出
		System.out.println("(2)以迭代器印出：");
		Iterator<Train> itr2 = list1.iterator();
		while (itr2.hasNext()) {
			Train temp = (Train) itr2.next();
			System.out.print(temp.getAll());
			System.out.println();

		}
		System.out.println("========================");

		// foreach 方式印出
		System.out.println("(2)以 foreach 印出：");
		for (Train temp : list1) {
			System.out.print(temp.getAll());
			System.out.println();
		}
		System.out.println("========================");

		// for 方式印出
		System.out.println("(2)以 for 印出：");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i).getAll());
			System.out.println();
		}
		System.out.println("========================");

		// (3)請寫一隻程式,讓 Train 物件印出時,能以班次編號由大到小印出
		Set<Train> set2 = new TreeSet<Train>();
		for (int i = 0; i < train.length; i++) {
			set2.add(train[i]);
		}

		// 迭代器方式印出
		System.out.println("(3)以迭代器印出：");
		Iterator<Train> itr3 = set2.iterator();
		while (itr3.hasNext()) {
			Train temp = (Train) itr3.next();
			System.out.print(temp.getAll());
			System.out.println();
		}
		System.out.println("========================");

		// foreach 方式印出
		System.out.println("(3)以 foreach 印出：");
		for (Train temp : set2) {
			System.out.print(temp.getAll());
			System.out.println();
		}

	}
}
