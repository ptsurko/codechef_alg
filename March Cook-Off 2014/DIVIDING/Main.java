package DIVIDING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int memberCount = Integer.parseInt(br.readLine());
		String[] stamps = br.readLine().split(" ");
		long stampCount = 0;
		long stampCountRequired = 0;
		for(int i = 0; i < memberCount; i++) {
			stampCount += Integer.parseInt(stamps[i]);
			
			stampCountRequired += (i + 1);
		}
		
		System.out.println(stampCount == stampCountRequired ? "YES" : "NO");
	}

}
