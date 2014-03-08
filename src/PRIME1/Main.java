package PRIME1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

public class Main {
	private static BitSet bitset = new BitSet();
	
	private static void filterOutPrimeNumbers(int maxEndInterval) {
		if (maxEndInterval > 1) {
			int max = (int) Math.sqrt(Integer.MAX_VALUE);
			for(int i = 2; i < maxEndInterval; i++) {
				if (!bitset.get(i)) {
					for(int j = i * i; i < max && j < maxEndInterval; j = j + i) {
						bitset.set(j);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount = Integer.parseInt(bufferRead.readLine());
		int maxEndInterval = 0;
		
		int[][] testCases = new int[testCaseCount][];
		
		for (int i = 0; i < testCaseCount; i++) {
			String[] input = bufferRead.readLine().split(" ");
			int startInterval = Integer.parseInt(input[0]);
			int endInterval = Integer.parseInt(input[1]);
			
			if (endInterval > maxEndInterval) {
				maxEndInterval = endInterval;
			}
			
			testCases[i] = new int[] { startInterval, endInterval};
		}
		
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		filterOutPrimeNumbers(maxEndInterval / 2 + 1);
		
//		for(int i = 0; i < testCaseCount; i++) {
//			int j = bitset.get(bitIndex)
//			for(int j = testCases[i][0]; j <= testCases[i][1]; j++) {
//				if (!bitset.get(j) && j != 1) {
//					out.println(j);
//				}
//			}
//			
//			out.println();
//		}
		
		out.close();
	}
}
