package hw1;

//• 請設計一隻Java程式,計算12,6這兩個數值的和與積
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

public class Hw1 {
	public static void main(String[] args) {
		System.out.println("第一題");
		System.out.println(12 + 6);
		System.out.println(12 * 6 + "\n");
		
		System.out.println("第二題");
		System.out.println("200顆雞蛋有"+(200/12)+"打又"+(200%12)+"顆\n");
		
		System.out.println("第三題");
		
		int TotalSec = 256559;
		int day = TotalSec / 86400;
		int RemainingSec = TotalSec % 86400;
			
		int hour = RemainingSec/60/60;
		RemainingSec = RemainingSec % 3600;
		
		int min = RemainingSec/60;
		RemainingSec = RemainingSec % 60;
		
		System.out.println("256559秒為" + day + "天"+ hour + "小時" + min + "分鐘" + RemainingSec + "秒\n" );
		
		
		System.out.println("第四題");
		
		float pi = 3.1415f;
		System.out.println("圓面積 = " + 5 * 5 * pi);
		System.out.println("圓周長 = " + 10 * pi + "\n");
		
		System.out.println("第五題");
		double a = 1500000 * Math.pow(1.02, 10);
//		System.out.println(a);
		System.out.println("本金加利息共" + (int)Math.floor(a) + "元\n");
		
		System.out.println("第六題");
		System.out.println(5 + 5); // 數字5相加
		System.out.println(5 + '5'); // 數字5加char5，char5的unicode是53
		System.out.println(5 + "5"); // 數字5加字串5
		
	}
}

