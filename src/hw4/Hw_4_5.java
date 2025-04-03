package hw4;

import java.util.Scanner;

public class Hw_4_5 {
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		
		int[] arr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int date = 0;
		Scanner sc = new Scanner(System.in);
		
		int year = 0, month = 0, day = 0;
		if (sc.hasNextInt()) {
			year = sc.nextInt();		
		}
		
		if (sc.hasNextInt()) {
			month = sc.nextInt();		
		}
		
		if (sc.hasNextInt()) {
			day = sc.nextInt();		
		}		
		
		 if (year % 1000 == 0) {  
             System.out.println(year + " 是閏年");
         } else if (year % 400 == 0) {
             System.out.println(year + " 是閏年");
         } else if (year % 4 == 0 && year % 100 != 0) {
             System.out.println(year + " 是閏年");
         } else {
             arr[2] -= 1;
             System.out.println(year + " 是平年");
         }
		
		 for(int i = 0; i < month; i++) {
			 date += arr[i];
		 }
		 System.out.println(date + day);
	}
}
