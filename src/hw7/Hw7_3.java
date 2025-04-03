package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw7_3 {
	
	public static void main(String[] args) throws IOException {
		
		copyFile("Sample.txt","Copy.txt");
	
	}
	
	
	public static void copyFile(String inputFile, String outputFile) throws IOException {
		
		FileReader fr = new FileReader(inputFile);        // 開啟來源檔案
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter(outputFile);       // 開啟目的檔案
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
