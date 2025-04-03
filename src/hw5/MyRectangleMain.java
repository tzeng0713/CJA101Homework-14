package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		
		MyRectangle Area1 = new MyRectangle();
		Area1.setWidth(10);
		Area1.setDepth(20);
		System.out.println(Area1.getArea());
		
		
		MyRectangle Area2 = new MyRectangle(10, 20);
		System.out.println(Area2.getArea());
		
		
		
	}
}
