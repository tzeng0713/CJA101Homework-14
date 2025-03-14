package hw2;

import java.util.ArrayList;
import java.util.List;

public class Hw_2 {
	public static void main(String[] args) {
		System.out.println("\n第四題");

		int count = 0;
		for (int x = 1; x <= 49; x++) {
//			String.valueOf(x).contains("4"); // x = 5 , return false
//				if (String.valueOf(x).contains("4")) {
//					continue;
//				} else {
//					System.out.println(x);
//					count++;
//				}
//				上面的寫法等同於下面的寫法，只是下面的更簡潔
				if (!String.valueOf(x).contains("4")) {
					System.out.println(x);
					count++;
				}
		}
		System.out.println("總共有" + count + "個數字");
		// 4、14、24、34、40~49 49-14 = 35
//		String.valueOf(X)把 X 轉成字串"X"
		
		
//		String x = "28";
//		boolean test = x.contains("4");
//		if (test) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}

//		boolean test_wei = hasFour(35);
//		if (test_wei) {
//			System.out.println("幹");
//		} else {
//			System.out.println("x");
//		}

		List<Integer> array_list = new ArrayList<>();
		for (int j = 1; j < 50; j++) {
			if (!hasFour(j)) {
				System.out.println(j);
				array_list.add(j);
			}
		}
		System.out.println(array_list);

//		char test2 = 'B';
//		int uni = (int) test2; 把字串B強轉成int
//		System.out.println(uni); 印出66
//		System.out.println((char) 65); 
		int count_char = 0;
		for (int k = 65; k <= 70; k++) {
			count_char++;
			for (int y = 1; y <= count_char; y++) {
				System.out.print((char) k);
				// k=65 印出一個A k=66 印出2個B k=67 印出三個C ... k=70 印出五個E
			}
			System.out.println();
		}
		int count_1 = 10;
		for (int k = 1; k <= 10; k++) {
			for (int y = 1; y <= count_1; y++) {
				System.out.print(y + " ");
				// System.out.print(y);
			}
			count_1--;
			System.out.println();
		}

	}

	public static boolean hasFour(int num) {
		// 如果只有一個位數(個位數的時候) ，我去給他%10，即可判斷有沒有4了
		while (num > 0) { //
			if (num % 10 == 4) {
				return true; //
			} else {
				num = num / 10; //
			}
		}

		return false;
	}
}
