package hw7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
public class ReadSample {

	public static void main(String[] args){
	
		int countStr = 0;
		int countLine = 0;
		try {
			File file = new File("file/Sample.txt");
			
			// 一個一個讀
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			int i;
			while ((i = br.read()) != -1) {
				countStr += 1;
			}
			br.close();
			fr.close();
			
			// 一行一行讀
			FileReader fr1 = new FileReader(file);
			BufferedReader br1 = new BufferedReader(fr1);
			
			String str;
			while((str = br1.readLine()) != null) {
				countLine += 1;
			}
			br1.close();
			fr1.close();
			
			
			System.out.print("Sample.txt檔案共有" + file.length() + "個位元組," + countStr + "個字元," + countLine + "列資料");
					
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
