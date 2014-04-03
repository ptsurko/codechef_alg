package MTRICK;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	
	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-- > 0) {
			int listSize = Integer.parseInt(br.readLine());
			long[] numbers = new long[listSize];
			String[] strs = br.readLine().split(" ");
			for (int i = 0; i < listSize; i++) {
				numbers[i] = Long.parseLong(strs[i]);
			}
			
			strs = br.readLine().split(" ");
			long a = Long.parseLong(strs[0]);
			long b = Long.parseLong(strs[1]);
			long c = Long.parseLong(strs[2]);
			
			char[] str = br.readLine().toCharArray();
			
			execute(numbers, a, b, c, str);
			
			out.println();
		}
		out.flush();
		out.close();
	}
	
	public static long[] execute(long[] numbers, long a, long b, long c, char[] chars) {
		int dir = 1, left = 0, right = numbers.length;
		long[] res = new long[numbers.length];
		long add = 0, mult = 1;
		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (ch == 'R') {
				dir *= -1;
			} else if (ch == 'A') {
				add = (add + a) % c;
			} else if (ch == 'M') {
				mult = multiply(mult, b, c);
				add = multiply(add, b, c);
			}
			
			long currentNum = 0;
			if (dir > 0) {
				currentNum = numbers[left];
				left++;
			} else {
				currentNum = numbers[right - 1];
				right--;
			}
			
			res[i] = ((multiply(currentNum, mult, c) + add) % c);
			out.print(res[i] + " ");
		}
		
		return res;
	}

	public static long multiplyRec(long a, long b, long c) {
		if (b == 0) {
			return 0;
		}
		
		long ret = multiplyRec(a, b >> 1, c);
		ret = (ret + ret) % c;
		if (b % 2 == 1) {
			ret = (ret + a) % c;
		}
		
		return ret;
	}
	
	
	public static long multiply(long a, long b, long c) {
		if (b == 0 || a == 0) {
			return 0;
		}
		
		long tempA = a, ret = 0;
		while(b > 1) {
			if (b % 2 == 1) {
				ret = (ret + tempA) % c;
			}

			tempA = (tempA << 1) % c;
			b = b >> 1;
		}
		
		return (ret + tempA) % c;
	}
}
