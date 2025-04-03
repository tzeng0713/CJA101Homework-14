package hw7;

import java.io.Serializable;

public class Dog implements Serializable {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
	
	@Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}
