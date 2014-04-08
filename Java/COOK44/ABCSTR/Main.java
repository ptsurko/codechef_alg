package ABCSTR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int firstCodeIndex = Character.getNumericValue('A');
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String abcString = br.readLine();
		
		System.out.println(getABCCount(abcString));
	}
	
	public static long getABCCount(String abcString) {
		if (abcString.length() < 3) {
			return 0;
		}
		
		int[] counters = new int[3];
		long result = 0;
		for(int i = 0; i < abcString.length() - 2; i++) {
			counters[0] = counters[1] = counters[2] = 0;
			
			for(int j = i; j < abcString.length() - 2; j += 3) {
				counters[getCode(abcString.charAt(j)) - firstCodeIndex]++;
				counters[getCode(abcString.charAt(j + 1)) - firstCodeIndex]++;
				counters[getCode(abcString.charAt(j + 2)) - firstCodeIndex]++;
				
				if (counters[0] == counters[1] && counters[0] == counters[2]) { 
					result += 1;
				}
			}
		}
		
		return result;
	}
	
	public static boolean isTrueAbc(int[] counters) {
		return counters[0] == counters[1] && counters[0] == counters[2];
	}
	
	public static int getCode(char c) {
		return Character.getNumericValue(c);
	}

}
