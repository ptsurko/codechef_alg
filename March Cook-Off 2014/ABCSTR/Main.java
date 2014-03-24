package ABCSTR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String abcString = br.readLine();
		
		System.out.println(getABCCount(abcString));
	}
	
	public static long getABCCount(String abcString) {
		if (abcString.length() < 3) {
			return 0;
		}
		
		int firstIndexCode = Character.getNumericValue('A');
		int index = 0;
		int requiredSum = 3;
		int result = 0;
		
		int firstIndex = getCode(abcString.charAt(index), firstIndexCode);
		int secondIndex = getCode(abcString.charAt(index + 1), firstIndexCode);
		int thirdIndex;
		
		
		while(index <= abcString.length() - 3) {
			thirdIndex = getCode(abcString.charAt(index + 2), firstIndexCode);
			
			int sum = firstIndex + secondIndex + thirdIndex;
			if (sum == requiredSum && firstIndex != secondIndex) {
				result++;
			}
			
			firstIndex = secondIndex;
			secondIndex = thirdIndex;
			
			index++;
		}
		
		return result;
	}
	
	public static int getCode(char c, int firstIndex) {
		return Character.getNumericValue(c) - firstIndex;
	}

}
