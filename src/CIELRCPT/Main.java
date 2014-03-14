package CIELRCPT;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int testCases = Integer.parseInt(br.readLine());
		
		while(testCases-- > 0) {
			int amount = Integer.parseInt(br.readLine());
			
			int[] menus = getMenuCounts(amount);
			int result = 0;
			for(int i = 0; i < menus.length; i++) {
				result += menus[i];
			}
			
			out.println(result);
		}
		out.flush();
		out.close();
	}
	
	
	public static int[] getMenuCounts(int moneyAmount) {
		int maxMenuIndex = 0;
		while(Math.pow(2, maxMenuIndex + 1) <= moneyAmount && maxMenuIndex + 1 < 12) {
			maxMenuIndex++;
		}
		
		int[] result = new int[maxMenuIndex + 1];
		
		int currentAmount = moneyAmount;
		while(currentAmount > 0) {
			if(currentAmount - Math.pow(2, maxMenuIndex) >= 0) { 
				currentAmount -= Math.pow(2, maxMenuIndex);
				result[maxMenuIndex]++;
			} else {
				maxMenuIndex--;
			}
		}
		
		return result;
	}

}
