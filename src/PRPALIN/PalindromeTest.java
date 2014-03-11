package PRPALIN;

import org.junit.*;

public class PalindromeTest {
	@Test
	public void palindromeTest() {
		Assert.assertTrue(Main.isPalindrome(11));
		
		Assert.assertTrue(Main.isPalindrome(1));
		
		Assert.assertTrue(Main.isPalindrome(111));
		
		Assert.assertTrue(Main.isPalindrome(212));
		
		Assert.assertTrue(Main.isPalindrome(100030001));
		
		Assert.assertFalse(Main.isPalindrome(221));
		Assert.assertFalse(Main.isPalindrome(123));
		
		Assert.assertFalse(Main.isPalindrome(1234));
	}
	
	@Test
	public void isPrimeTest() {
		Assert.assertTrue(Main.isPrime(13));
		Assert.assertTrue(Main.isPrime(31));
		Assert.assertTrue(Main.isPrime(29));
		Assert.assertTrue(Main.isPrime(100030001));
		
		Assert.assertFalse(Main.isPrime(29 * 29));
		Assert.assertFalse(Main.isPrime(10000000));
	}
}
