package ABCSTR;

import org.junit.*;

public class AbcTest {
	@Test
	public void TestAbc() {
		Assert.assertEquals(Main.getABCCount("ABC"), 1);
		
		Assert.assertEquals(Main.getABCCount("ABACABA"), 2);
		
		Assert.assertEquals(Main.getABCCount("ABACABACABACABA"), 6);
		
		Assert.assertEquals(Main.getABCCount("AAAAAA"), 0);
		
		Assert.assertEquals(Main.getABCCount("AAAAAABC"), 1);
		
		
		Assert.assertEquals(Main.getABCCount(""), 0);
		
		Assert.assertEquals(Main.getABCCount("A"), 0);
		
		Assert.assertEquals(Main.getABCCount("AB"), 0);
		
		
		Assert.assertEquals(Main.getABCCount("BBB"), 0);
	}
	
}
