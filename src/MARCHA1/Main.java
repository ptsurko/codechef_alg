package MARCHA1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		int testCases = Integer.parseInt(br.readLine());
		
		while (testCases-- > 0) {
			String[] str = br.readLine().split(" ");
			int banknoteCount = Integer.parseInt(str[0]);
			int amountToPayUp = Integer.parseInt(str[1]);
			
			int[] banknotes = new int[banknoteCount];
			banknoteCount = 0;
			boolean wasFound = false;
			for(int i = 0; i < banknotes.length; i++) {
				int banknote = Integer.parseInt(br.readLine());
				banknotes[i] = banknote;
				if (banknote < amountToPayUp) {
					banknoteCount++;
				} else if (banknote == amountToPayUp) {
					wasFound = true;
				}
			}
			
			
			if (!wasFound) {
				Arrays.sort(banknotes);
				for(int i = 0; i < (int)Math.pow(2, banknoteCount); i++) {
					if (checkWithSet(i, banknoteCount, banknotes, amountToPayUp)) {
						wasFound = true;
						break;
					}
				}
			}
			out.println(wasFound ? "Yes" : "No");
		}
		
		out.flush();
		out.close();
	}
	
	public static boolean checkWithSet(int set, int bitCount, int[] banknotes, int amountToPayUp) {
		int amount = 0;
		for(int i = 0; i < bitCount; i++) {
			int bit = (int)Math.pow(2,  i);
			amount += (set & bit) == bit ? banknotes[i] : 0;
			if (amount == amountToPayUp) {
				return true;
			} else if (amount > amountToPayUp) {
				return false;
			}
		}
		
		return amount == amountToPayUp;
	}
}
