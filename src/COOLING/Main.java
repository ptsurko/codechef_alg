package COOLING;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-- > 0) {
			int pieCount = Integer.parseInt(br.readLine());
			
			int[] pieWeights = new int[pieCount];
			int[] rackWeights = new int[pieCount];
			int index = 0;
			for(String pieWeight : br.readLine().split(" ")) {
				pieWeights[index++] = Integer.parseInt(pieWeight);
			}
			
			index = 0;
			for(String rackWeight : br.readLine().split(" ")) {
				rackWeights[index++] = Integer.parseInt(rackWeight);
			}
			
			out.println(CalculateMaxPieCount(pieWeights, rackWeights));
		}
		
		out.close();
	}

	public static int CalculateMaxPieCount(int[] pieWeights, int[] rackWeights) {
		Arrays.sort(pieWeights);
		Arrays.sort(rackWeights);
		int rackIndex, pieIndex;
		int pieCount = 0;
		
		rackIndex = pieIndex = pieWeights.length - 1;
		
		while(rackIndex >= 0 && pieIndex >= 0) {
			if (pieWeights[pieIndex] <= rackWeights[rackIndex]) {
				pieCount++;
				pieIndex--;
				rackIndex--;
			} else {
				pieIndex--;
			}
		}
		
		return pieCount;
	}
}
