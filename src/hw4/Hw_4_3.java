package hw4;

import java.util.Scanner;

public class Hw_4_3 {
	
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
//	18
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		System.out.println(hasVowel(planet));
	}

	public static int hasVowel(String[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length(); j++) {
				if ((a[i].charAt(j)) == 'a') {
					count++;
				}
				if ((a[i].charAt(j)) == 'e') {
					count++;
				}
				if ((a[i].charAt(j)) == 'i') {
					count++;
				}
				if ((a[i].charAt(j)) == 'o') {
					count++;
				}
				if ((a[i].charAt(j)) == 'u') {
					count++;
				}
			}
		}
		return count;
	}
}
