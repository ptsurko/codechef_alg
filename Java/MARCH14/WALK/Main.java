package WALK;

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
			int segmentCount = Integer.parseInt(br.readLine());
			String[] strs = br.readLine().split(" ");
			
			int[] shopAttractiveness = new int[segmentCount];
			for(int i = 0; i < strs.length; i++) {
				shopAttractiveness[i] = Integer.parseInt(strs[i]);
			}
			
			out.println(FindMaxVelocity(shopAttractiveness, segmentCount));
		}
		
		out.flush();
		out.close();
	}
	
	public static int FindMaxVelocity(int[] shopAttractiveness, int segmentCount) {
		int max = 0;
		for(int i = 0; i < segmentCount; i++) {
			if (max < shopAttractiveness[i] + i) {
				max = shopAttractiveness[i] + i;
			}
		}
		
		return max;
	}

}
