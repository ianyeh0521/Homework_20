package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInOutHomework {

	public static void main(String[] args) throws Exception {
		Pets[] pets = new Pets[4];
		pets[0] = new Cat("Loki");
		pets[1] = new Cat("Milo");
		pets[2] = new Dog("Stella");
		pets[3] = new Dog("Buddy");

		// 建立新資料夾和.ser 檔
		File file = new File("C:/data/Object.ser");
		file.getParentFile().mkdirs();

		// 輸出
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < pets.length; i++) {
			oos.writeObject(pets[i]);
		}
		oos.close();
		fos.close();

		// 讀取檢查內容是否正確
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Pets) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("======== 資料讀取完畢！========");
		}
		ois.close();
		fis.close();
	}
}
