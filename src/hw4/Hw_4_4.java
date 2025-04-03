package hw4;

import java.util.Scanner;

public class Hw_4_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = {
			    {25, 2500},
			    {32, 800},
			    {8, 500},
			    {19, 1000},
			    {27, 1200}
		};
		
		while(!sc.hasNextInt()) {
			System.out.println("輸入錯誤，請輸入金額!");
			sc.next();
		}
		
		if(sc.hasNextInt()) {
			int money = sc.nextInt();
			System.out.print("有錢可借的員工編號：");
			richPeople(arr, money);
		}
			
}
	
	public static int richPeople(int[][] arr, int money) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][1] >= money) {
				System.out.print(arr[i][0] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人!");
		return count;
	}
}
