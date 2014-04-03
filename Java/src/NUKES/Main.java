package NUKES;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		String[] input = br.readLine().split(" ");
		long particleCount = Long.parseLong(input[0]);
		byte chamberSize  = Byte.parseByte(input[1]);
		byte chamberCount = Byte.parseByte(input[2]);
		
		int[] chambers = getFilledChambers(particleCount, chamberSize, chamberCount);
		
		for(int i = 0; i < chambers.length; i++) {
			out.print(chambers[i]);
			if (i < chambers.length - 1) {
				out.print(" ");
			}
		}
		
		out.flush();
		out.close();
	}
	
	public static int[] getFilledChambers(long particleCount, int chamberSize, int chamberCount) {
		int[] chambers = new int[chamberCount];
		
		int chamberIndex = 0;
		while(chamberIndex < chamberCount) {
			chambers[chamberIndex++] = (int) (particleCount % (chamberSize + 1));
			particleCount /= chamberSize + 1;
		}
		
		return chambers;
	}

}
