package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw7_4 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cat cat = new Cat("Kitty");
		Dog dog = new Dog("Lucky");
		
		File f2 = new File("C:/data");
		f2.mkdir();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/data/Object.ser"));
		oos.writeObject(cat);
		oos.writeObject(dog);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
			    new FileInputStream("C:/data/Object.ser")
			);

			Cat readCat = (Cat) ois.readObject();
			Dog readDog = (Dog) ois.readObject();
			
			readCat.speak();
			readDog.speak();

			System.out.println("讀回的貓：" + readCat);
			System.out.println("讀回的狗：" + readDog);

			ois.close();
	}
}
