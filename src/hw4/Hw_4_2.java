package hw4;

import java.util.Scanner;

public class Hw_4_2 {
	
	public static void main(String[] args) {
		
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("請輸入一串文字：");
			
			String input = sc.nextLine();
			String[] words = input.split("");
			
			for(int i = (words.length - 1); i >= 0; i--) { 
				System.out.print(words[i]);
			}
			System.out.println();
		}
	}

}
