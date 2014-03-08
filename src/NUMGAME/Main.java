package NUMGAME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(br.readLine());
		BitSet primeBitSet = generatePrimeNumbers(1000000000);
		byte[] cache = new byte[1000000000 / 2];
		
		for(int i = 0; i < testCount; i++) {
			int startNumber = Integer.parseInt(br.readLine());
			System.out.println(Play(startNumber, primeBitSet, cache));
		}
	}
	
	public static BitSet generatePrimeNumbers(int maxNumber) {
		BitSet bitset = new BitSet();
		int endBit = (int) Math.ceil(Math.sqrt(maxNumber));
		
		for(int i = 2; i < endBit; i++) {
			if(!bitset.get(i)) {
				for(int j = i * i; j < endBit; j += i) {
					bitset.set(j);
				}
			}
		}
		
		return bitset;
	}
	
	public static int getMaxDivisor(int number, BitSet bitset) {
		int maxDivisorToCheck = (int)Math.floor(Math.sqrt(number));
		int index = 2;
		while(index <= maxDivisorToCheck) {
			index = bitset.nextClearBit(index);
			if (number % index == 0) {
				return number / index;
			}
			index++;
		}
		
		return 1;
	}

	public static String Play(int number, BitSet bitset, byte[] cache) {
		return PlayRecursive(number, bitset, true, cache) ? "ALICE" : "BOB";
	}
	
	private static boolean PlayRecursive(int number, BitSet bitset, boolean isAlice, byte[] cache) {
		if (number == 1) {
			return isAlice;
		} else if (cache[number] != 0) {
			return cache[number] == 1;
		} else {
			boolean result = PlayRecursive(number - getMaxDivisor(number, bitset), bitset, !isAlice, cache);
			cache[number] = (byte)(result ? 1 : 2);
			return result;
		}
	}
}
