package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hw_3_advanced {
	
public static void main(String[] args) {
	
	
		// 輸入阿文討厭的數字 0~9
		// 篩選掉1~49裡那些阿文討厭的數字
		// 隨機篩選出6個不重複的數字並印出
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] finalNumers = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文，這次又看哪個數字不爽啊?");
		
		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			int count = 0;
			
			while(i <= 0 || i > 9) {
				System.out.println("請輸入1~9的數字好嗎?");
				i = sc.nextInt();
				
				}
				for(int k = 1; k < 50; k++) {
					if(!hasNumber(k, i)) {
						System.out.print(k + " ");
						numbers.add(k);
						count++;
					}
				}
				System.out.println("\n一共有" + count + "個樂透數字");
				
				
				int n = 0;
				while(n <finalNumers.length) {
					int randomNumber = numbers.get((int)(Math.random() * count));
					
					if(finalNumers[n] != randomNumber) {
						finalNumers[n] = randomNumber;
						n++;
					}
				}
				System.out.println(Arrays.toString(finalNumers));
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
