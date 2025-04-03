package hw4;

public class Hw_4_6 {
	public static void main(String[] args) {
		int[] highestScore = new int[9];
		
		int[][] scores = {
			    {0, 10, 35, 40, 100, 90, 85, 75, 70},
			    {0, 37, 75, 77, 89, 64, 75, 70, 95},
			    {0, 100, 70, 79, 90, 75, 70, 79, 90},
			    {0, 77, 95, 70, 75, 85, 90, 85, 89},
			    {0, 98, 70, 89, 90, 90, 89, 90, 90},
			    {0, 90, 80, 100, 75, 50, 20, 99, 75}
			};
		int [] count = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < scores.length; i++) {
			//處理一列資料
			for(int j = 0; j < scores[i].length; j++) {
				
				if (highestScore[i] < scores[i][j]) {
					highestScore[i] = scores[i][j];
				}
				
			}

			//從處理後一列資料中，取得最大值放入count陣列
			for(int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] == highestScore[i]) {
					count[j]++;
				}
			}		
//			System.out.println(highestScore[i]);
		}
		
//			System.out.println(highestScore[i]);
		
		//垃圾code 垃圾code
		//垃圾code 垃圾code
		//垃圾code 垃圾code
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				if (scores[i][j] == highestScore[i]) {
//					count[j]++;
//				}
//			}
////			System.out.println(count[i]);
//
//		}
//		System.out.println(Arrays.toString(count));
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "號:" + count[i+1] + "次最高分");
		}
	}
}
