package hw3;

import java.util.Scanner;

public class Hw_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("阿文，這次又看哪個數字不爽啊?");
		while(true) {	
			if(sc.hasNextInt()) {
				i = sc.nextInt();
				int count = 0;
				
				if(i > 0 && i < 10) {
					for(int k = 1; k < 50; k++) {
						if(!hasNumber(k, i)) {
							System.out.print(k + " ");
							count++;
						}
					}
					System.out.println("\n一共有" + count + "個樂透數字");
					break;
				}else {
					System.out.println("超出範圍!請輸入1~9的數字好嗎?");
				}
			}else {
				System.out.println("請輸入1~9的數字好嗎?");
				sc.next();
			}
		}
	}

	public static boolean hasNumber(int num, int i) {
		
			while (num > 0) {
				if (num % 10 == i) {
					return true;
				} else {
					num = num / 10;
				}
			}
			return false;
	}
}
