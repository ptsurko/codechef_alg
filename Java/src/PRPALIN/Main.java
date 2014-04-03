package PRPALIN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		while(true) {
			if (isPalindrome(number) && isPrime(number)) {
				System.out.println(number);
				break;
			}
			
			number += number % 2 == 0 ? 1 : 2;
		}
	}
	
	public static boolean isPrime(int number) {
		for(int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPalindrome(int number) {
		
		int num = number;
		int reverse = 0;
		while(num > 0) {
			int digit = num % 10;
			num = num / 10;
			reverse = reverse * 10 + digit;
		}
		
		return number == reverse;
	}

}
