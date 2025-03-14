package hw2;


public class Hw_1 {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100

	public static void main(String[] args) {

		System.out.println("第一題");
		int sum1 = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum1 += i;
		}
		System.out.println(sum1);

		System.out.println("\n第二題");
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);

		System.out.println("\n第三題");
		int sum3 = 1, i = 1;
		while (i <= 10) {
			sum3 *= i;
			i++;
		}
		System.out.println(sum3);

		System.out.println("\n第四題");
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (x == y) {
					System.out.println(x * y);
				}
			}
		}
		
		System.out.println("\n第五題");
		int count = 0;
		for(int k = 1; k < 50; k++) {
			if(!hasFour(k)) {
				System.out.print(k + " ");
				count++;
			}
		}
		System.out.println("\n一共有" + count + "個樂透數字");
		
		System.out.println("\n第六題");
		int count1 = 10;
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= count1; y++) {
				System.out.print(y + " ");
			}
			count1--;
			System.out.println();
		}
		
		System.out.println("\n第七題");
//		char A = 'A';
//		System.out.println((int)A); 印出65
		int count2 = 0;
		for(i = 65; i <= 70; i++) {
			count2++;
			for(int k = 1; k <=count2; k++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
		
	}
	
	
	
	public static boolean hasFour(int num) {
		
		while(num > 0) { 
			if(num % 10 == 4) {
				return true;
			}else {
				num = num / 10;
			}
		}
		return false;
	}
	
}
