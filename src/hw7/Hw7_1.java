package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Sample.txt");       // 低階：開檔案
		BufferedInputStream bis = new BufferedInputStream(fis);       // 高階：加緩衝區
		
		int data = bis.read();  // 讀出一個 byte（或用迴圈一個一個讀完）
//		System.out.println(data);
		
		int lineCount = 0;
		int charCount = 0;
		String line;
		
		FileReader fr = new FileReader("Sample.txt");         // 低階：開啟文字檔
		BufferedReader br = new BufferedReader(fr);          // 高階：加緩衝區，提高效率
		
		while((line = br.readLine()) != null) {
			charCount += line.length();
			lineCount ++;
		}
		
		System.out.println("Sample.txt檔案共有" + data + "個位元組,"
							+ charCount + "個字元," + lineCount + "列資料");
		
	}
}
