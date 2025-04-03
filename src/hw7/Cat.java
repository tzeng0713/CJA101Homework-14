package hw7;

import java.io.Serializable;

public class Cat implements Serializable {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
	@Override
    public String toString() {
        return "Cat{name='" + name + "'}";
    }
}
