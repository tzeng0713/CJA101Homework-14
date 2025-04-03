package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hw7_2 {
	public static void main(String[] args) throws IOException  {
		
		FileWriter fw = new FileWriter("Data.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		
		for (int i = 0; i < 10; i++) {
			int n = (int)(Math.random() * 1000) + 1;
			pw.println(n);
		}
		
		pw.close();
	}

}
