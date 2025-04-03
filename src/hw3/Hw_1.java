package hw3;

import java.util.Scanner;

public class Hw_1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入 3 個數字（用空格分開）：");
		
		while(true) {
			
//			sc.nextLine();
			if (sc.hasNextDouble()) {
				double a = sc.nextDouble();
				if (sc.hasNextDouble()) {
					double b = sc.nextDouble();
					if (sc.hasNextDouble()) {
						double c = sc.nextDouble();
						
						if (!isValidTriangle(a, b, c)) {
	                        System.out.println("這殺毀? 根本不是三角形！請重新輸入！");
	                        continue; 
	                    }else {
							TriangleType(a, b, c);
		                    break;
	                    }
					}
				}
			}
			System.out.println("輸入錯誤！請重新輸入 3 個數字：");
	        sc.nextLine();
		}
	}
	
	
	
	public static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (a + c > b);
    }
	
	
	public static void TriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("正三角形");
        } else if (a == b || b == c || a == c) {
            if (isRightTriangle(a, b, c)) {
                System.out.println("直角三角形");
            } else {
                System.out.println("等腰三角形");
            }
        } else {
            if (isRightTriangle(a, b, c)) {
                System.out.println("直角三角形");
            } else {
                System.out.println("普通三角形");
            }
        }
    }
	
	public static boolean isRightTriangle(double a, double b, double c) {
		if (a * a + b * b == c * c ||
			b * b + c * c == a * a ||
			a * a + c * c == b * b) {
			return true;
		}else {
			return false;
		}
	}	
}

