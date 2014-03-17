package PROSUM;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int testCases = Integer.parseInt(br.readLine().trim());
		while(testCases-- > 0) {
			int numCount = Integer.parseInt(br.readLine().trim());
			int[] numbers = new int[numCount];
			String[] strs = br.readLine().trim().split(" ");
			for(int i = 0; i < numCount; i++) {
				numbers[i] = Integer.parseInt(strs[i]);
			}
			
			out.println(FindPairCount(numbers));
		}
		out.flush();
		out.close();
	}
	
	public static int FindPairCount(int[] numbers) {
		int result = 0;
		int nonOneLength = 0, twoCount = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 1 && numbers[i] != 0) {
				if (numbers[i] == 2) {
					result += nonOneLength - twoCount;
					
					twoCount++;
				} else {
					result += nonOneLength;
				}
				
				nonOneLength++;
			}
		}
		
		return result;
	}
}
