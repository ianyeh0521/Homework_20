package hw5;

public abstract class Pen {
	
	protected String brand;
	protected double price;
	
	public Pen() {
	
	}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
	
	public abstract void write();
	
	
}


class Pencil extends Pen{
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	
	
}


class InkBrush extends Pen{
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public double getPrice() {
		return super.getPrice()*0.9;
	}
}

