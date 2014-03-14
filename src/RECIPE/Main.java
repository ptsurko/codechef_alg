package RECIPE;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int testCaseCount = Integer.parseInt(br.readLine());
		int[][] testCases = new int[testCaseCount][];
		int[] testCasesMin = new int[testCaseCount];
		int index = 0, maxIngredient = 0;
		while(index < testCaseCount) {
			String[] strings = br.readLine().split(" ");
			testCases[index] = new int[strings.length - 1];
			int min = Integer.MAX_VALUE;
			
			for(int i = 1; i < strings.length; i++) {
				int ingredient = Integer.parseInt(strings[i]);
				testCases[index][i - 1] = ingredient;
				if (ingredient > maxIngredient) {
					maxIngredient = ingredient;
				}
				if (ingredient < min) {
					min = ingredient;
				}
			}
			
			testCasesMin[index++] = min;
		}
		
		BitSet bs = getPrimeNumbers(maxIngredient);
		
		for(int i = 0; i < testCases.length; i++) {
			int[] result = reduceRecipe(testCases[i], testCasesMin[i], bs);
			for(int j = 0; j < result.length; j++) {
				out.print(result[j]);
				out.print(" ");
			}
			out.println();
		}
		out.flush();
		out.close();
	}
	
	public static int[] reduceRecipe(int[] recipes, int min, BitSet bitset) {
		if (min == 1 || recipes.length == 1) {
			return recipes;
		}
		
		int commonDivider = 1;
		int divider = bitset.nextClearBit(commonDivider + 1);
		int currentMin = min;
		while(divider <= currentMin) {
			if (currentMin % (commonDivider * divider) == 0) {
				
				boolean isDividerForAll = true;
				for(int i = 0; i < recipes.length; i++) {
					if (recipes[i] % (commonDivider * divider) != 0) {
						isDividerForAll = false;
						break;
					}
				}
				if (isDividerForAll) {
					commonDivider *= divider;
				} else {
					divider = bitset.nextClearBit(divider + 1);
				}
			} else {
				divider = bitset.nextClearBit(divider + 1);
			}
		}
		
		if (commonDivider == 1) {
			return recipes;
		}
		
		int[] result = new int[recipes.length];
		for(int i = 0; i < result.length; i++) {
			result[i] = recipes[i] / commonDivider;
		}
		
		return result;
	}

	public static BitSet getPrimeNumbers(int maxNumber) {
		BitSet bitset = new BitSet(maxNumber);
		int index = 2;
		while(index <= maxNumber) {
			for(int j = index * index; j < maxNumber; j += index) {
				bitset.set(j);
			}
			
			index = bitset.nextClearBit(index + 1);
		}
		
		return bitset;
	}
}
