package MTRICK;

import org.junit.*;

public class MagicTest {
	@Test
	public void testMagic() {
		Assert.assertArrayEquals(Main.execute(new long[] {1, 2, 3}, 1, 1, 10000, new char[] {'R', 'R', 'R'}), new long[] {3, 1, 2});
		
		Assert.assertArrayEquals(Main.execute(new long[] {1}, 1, 1, 10000, new char[] {'A'}), new long[] {2});
		
		Assert.assertArrayEquals(Main.execute(new long[0], 1, 1, 10000, new char[0]), new long[0]);
		
		Assert.assertArrayEquals(Main.execute(new long[] {10}, 1, 2, 10000, new char[] {'M'}), new long[] {20});
		
		Assert.assertArrayEquals(Main.execute(new long[] {1, 1, 1}, 2, 3, 1000, new char[] {'A', 'R', 'M'}), new long[] {3, 3, 9});
		
		Assert.assertArrayEquals(Main.execute(new long[] {1, 2, 3, 4}, 0, 1, 1000, new char[] {'A', 'M', 'A', 'M'}), new long[] {1, 2, 3, 4});
	}
	
	
	@Test
	public void multiplyRecTest() {
		Assert.assertEquals(Main.multiplyRec(2, 2, 1000), 4);
		
		Assert.assertEquals(Main.multiplyRec(2, 2, 2), 0);
	}
	
	@Test
	public void multiplyTest() {
		Assert.assertEquals(Main.multiply(2, 2, 1000), 4);
		
		Assert.assertEquals(Main.multiply(2, 3, 1000), 6);
		
		Assert.assertEquals(Main.multiply(2, 2, 2), 0);
		
		
		Assert.assertEquals(Main.multiply(2, 1, 1000), 2);
		
		Assert.assertEquals(Main.multiply(2, 0, 1000), 0);
		
		
		Assert.assertEquals(Main.multiply(3, 7, 1000), 21);
	}
}
