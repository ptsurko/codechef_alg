package CIELAB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strings = br.readLine().split(" ");
		int a = Integer.parseInt(strings[0]);
		int b = Integer.parseInt(strings[1]);
		
		int res = a - b;
		if ((a - b) % 10 == 9) {
			res -= 1;
		} else {
			res += 1;
		}
		
		System.out.println(res);
	}

}
