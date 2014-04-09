package GCD2

import org.junit;
import org.junit.Test;
import org.junit.Assert;

class GcdTest {
	@Test
	def testGcd() = {
	  Assert.assertEquals(Main.mod("1247", 3), 2);
	  
	  Assert.assertEquals(Main.mod("4", 3), 1);
	  
	  Assert.assertEquals(Main.mod("140", 9), 5);
	  
	  Assert.assertEquals(Main.mod("0", 9), 0);
	  
	  Assert.assertEquals(Main.mod("10000000000000000000000", 9), 1);
	  
	  Assert.assertEquals(Main.mod("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 9), 2);
	  
	  Assert.assertEquals(Main.mod("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 9), 2);
	  
	  Assert.assertEquals(Main.mod("40000", 40000), 0);
	  
	  Assert.assertEquals(Main.mod("40000", 40001), 40000);
	  
	  Assert.assertEquals(Main.mod("40001", 40000), 1);
	  
	  Assert.assertEquals(Main.mod("", 40000), 0);
	  
	  Assert.assertEquals(Main.mod("40000", 0), 0);
	  
	  Assert.assertEquals(Main.mod("1", 1), 0);
	  
	  
	}
	
	def gcd2Test() = {
	  Assert.assertEquals(Main.gcd2("1", 1), 1);
	  
	  Assert.assertEquals(Main.gcd2("4", 2), 2);
	  
	  Assert.assertEquals(Main.gcd2("2", 6), 2);
	  
	  Assert.assertEquals(Main.gcd2("11", 10), 1);
	  
	  Assert.assertEquals(Main.gcd2("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 9), 1);
	  
	  Assert.assertEquals(Main.gcd2("0", 0), 0);
	  
	}
}