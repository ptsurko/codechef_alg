package PERMUT2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (Integer.parseInt(br.readLine()) != 0) {
			String[] stringNumbers = br.readLine().split(" ");
			int[] numbers = new int[stringNumbers.length];
			for (int j = 0; j < stringNumbers.length; j++) {
				numbers[j] = Integer.parseInt(stringNumbers[j]);
			}

			System.out.println(isAmbiguous(numbers) ? "ambiguous"
					: "not ambiguous");
		}

	}

	public static boolean isAmbiguous(int[] permutation) {
		for (int i = 0; i < permutation.length; i++) {
			if (permutation[permutation[i] - 1] != i + 1) {
				return false;
			}
		}

		return true;
	}

}
