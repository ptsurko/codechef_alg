package TMSLT;

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
			String[] strs = br.readLine().split(" ");
			int playerCount = Integer.parseInt(strs[0]);
			int a = Integer.parseInt(strs[1]);
			int b = Integer.parseInt(strs[2]);
			int c = Integer.parseInt(strs[3]);
			int d = Integer.parseInt(strs[4]);
			
			out.println(FindStrengthDifference(playerCount, a, b, c, d));
		}
		
		out.flush();
		out.close();
	}
 
	public static int FindStrengthDifference(int playerCount, int a, int b, int c, int d) {
		int[] strengths = new int[1000000];
		
		int prevStrength = d;
		strengths[prevStrength] += prevStrength > 0 ? 1 : 0;
		
		for(int i = 1; i < playerCount; i++) {
			prevStrength = CalculateNextStrength(prevStrength, a, b, c);
			strengths[prevStrength] += prevStrength > 0 ? 1 : 0;
		}
		
		for(int i = 0; i < strengths.length; i++) {
			if (strengths[i] != 0) {
				strengths[i] = strengths[i] % 2 == 0 ? 0 : 1;
			}
		}
		
		int result = 0;
		int player = 1;
		for(int i = strengths.length - 1; i >= 0; i--) {
			if (strengths[i] != 0) {
				result += i * player;
				
				player *= -1;
			}
		}
		
		return (int)Math.abs(result);
	}
	
	public static int CalculateNextStrength(int sprev, int a, int b, int c) {
		return (int)(((long)a * sprev * sprev + b * sprev + c) % 1000000);
	}
}