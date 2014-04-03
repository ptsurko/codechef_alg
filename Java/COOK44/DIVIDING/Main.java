package DIVIDING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//Solution: http://www.9math.com/book/sum-first-n-natural-numbers
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long memberCount = Integer.parseInt(br.readLine());
		String[] stamps = br.readLine().split(" ");
		long stampCount = 0;
		for(int i = 0; i < memberCount; i++) {
			stampCount += Integer.parseInt(stamps[i]);
		}
		
		System.out.println(stampCount == (memberCount * (memberCount + 1) / 2) ? "YES" : "NO");
	}

}
