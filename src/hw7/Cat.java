package hw7;

import java.io.Serializable;

public class Cat extends Pets implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public Cat(String name) {
		super(name);
	}

	
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
