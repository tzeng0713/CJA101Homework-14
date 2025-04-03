package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入x的值:");
//		if(sc.hasNextInt()) {
//			a = sc.nextInt();
//		}
//		System.out.println("請輸入y的值:");
//		if(sc.hasNextInt()) {
//			b = sc.nextInt();
//		}
		while (true) {
			try {
				System.out.println("請輸入x的值:");
				int x = getIntInput(sc);
				System.out.println("請輸入y的值:");
				int y = getIntInput(sc);
				
				Calculator power = new Calculator(x, y);
				System.out.println(power.powerXY());
			} catch (CalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("請輸入有效的整數!");
			}
		}
		
		
	}
	public static int getIntInput(Scanner sc) throws NumberFormatException{
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
}
