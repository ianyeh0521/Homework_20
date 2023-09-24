package hw6;

public class Calculator {
	
	int x;
	int y;

	
	public Calculator(){
		
	}
	
	public Calculator(int x, int y) throws CalException{
		this.x = x;
		this.y = y;
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}else {
			
		}
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public String powerXY() {
		return x + "的" + y + "次方等於" + (int)Math.pow(x, y);
		
	}
	
	
}
