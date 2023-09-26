package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteRandomNumbers {

	public static void main(String[] args) {
		List<Integer> listRan = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			listRan.add((int) (Math.random() * 1000) + 1);
		}

		try {
			FileWriter fw = new FileWriter("file/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 0; i < listRan.size(); i++) {
				pw.println(listRan.get(i));
			}

			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
