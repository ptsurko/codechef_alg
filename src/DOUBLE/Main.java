package DOUBLE;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-- > 0) {
			int palLength = Integer.parseInt(br.readLine());
			out.println(palLength % 2 == 0 ? palLength : palLength - 1);
		}
		out.close();
	}

}
