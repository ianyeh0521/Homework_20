package hw5;

public class TestPen {

	public static void main(String[] args) {
		Pen[] objs = new Pen[2];
		objs[0] = new Pencil("aaa", 100);
		objs[1] = new InkBrush("bbb", 200);
		
		for(int i = 0; i < objs.length; i++) {
			objs[i].write();
			System.out.println("售價為：" + objs[i].getPrice());
		}
		
	}
}
