package hw3;

import java.util.Scanner;

public class Hw_2 {

public static void main(String[] args) {
		
//		基礎題
//		Scanner sc = new Scanner(System.in);
//		System.out.println("0~9 請猜一個數字！");
//		int i = (int)(Math.random() * 10);
//		
//				while(i >= 0) {
//					if(sc.hasNextInt()) {
//						int  a = sc.nextInt();
//						if(i == a) {
//							System.out.println("答對囉！");
//							break;
//						}else {
//							System.out.println("答錯囉！");
//						}
//					}else {
//						System.out.println("請輸入0~9的數字好嗎?");
//					}
//			}
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 請猜一個數字！");
		int i = (int)(Math.random() * 101);
		
				while(i >= 0) {
					if(sc.hasNextInt()) {
						int  a = sc.nextInt();
						if(i == a) {
							System.out.println("答對囉！");
							break;
						}else if(i > a) {
							System.out.println("再大一點點~~");
						}else{
							System.out.println("再小一點點~~");
						}
						
					}else {
						System.out.println("請輸入0~100的數字好嗎?");
					}
			}
	
	}
}