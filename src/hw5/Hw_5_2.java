package hw5;

public class Hw_5_2 {
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void main(String[] args) {
		System.out.println("本次亂數結果:");
		randAvg();
		
	}
	public static void randAvg() {
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
				
			arr[i] = ((int)(Math.random() * 100) + 1);
			total += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(total/10);
	}
}
