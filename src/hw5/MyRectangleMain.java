package hw5;

// 4. 請建立一個 MyRectangleMain 類別，此類別只有 main 方法:
public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		// (1) 使用 public MyRectangle() 建構子建立物件,設定 width, depth 為 10, 20,透過 getArea() 印出結果
		MyRectangle rec1 = new MyRectangle();
		rec1.setWidth(10);
		rec1.setDepth(20);
		System.out.println("長方形面積為：" + rec1.getArea());
		
		System.out.println("============");
		
		// (2) 使用 public MyRectangle(double width, double depth) 建構子建立物件,設定 width, depth 為 10, 20,透過 getArea() 印出結果
		MyRectangle rec2 = new MyRectangle(10, 20);
		System.out.println("長方形面積為：" + rec2.getArea());
	}
}
