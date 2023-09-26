package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class CopyHomework {
	
	public static void copyFile(File f1, File f2) {
		int i;
		try {	
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while((i = br.read()) != -1) {
				bw.write(i);;
			}
			
			bw.close();
			br.close();
			fw.close();
			fr.close();
			
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("file/copy1.txt");
		File f2 = new File("file/copy2.txt");
		copyFile(f1, f2);
	}

}
