package hw5;

import java.util.Scanner;

public class Hw_5_1 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int width = 0, height = 0;
		
		if (sc.hasNextInt()) {
			width = sc.nextInt();		
		}
		
		if (sc.hasNextInt()) {
			height = sc.nextInt();		
		}
		
		starSquare(width, height);
		
	}
	public static void starSquare(int width, int height) {
		
		for(int i = 1; i <= width; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
}

