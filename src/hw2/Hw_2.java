package hw2;

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
	}
}
