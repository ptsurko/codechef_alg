package PROSUM;

import org.junit.*;

public class SumTest {
	@Test
	public void testSum() {
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 3, 4}), 3);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 1, 1, 1}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 2, 3, 4}), 3);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 2, 3, 4, 1, 5}), 6);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 2, 3, 4, 2, 5}), 9);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 2, 3, 4, 0, 5}), 6);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {0, 0, 0, 0, 0}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 2, 3, 2}), 3);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 2, 2, 2, 2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 2, 1, 2, 1}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 0, 1, 2, 1, 2, 0, 2, 1, 0}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 3, 2, 3, 2}), 7);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 3, 2}), 2);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 4, 2}), 2);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 1, 2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {2, 3, 0}), 1);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 1, 1, 1, 1, 2, 2, 2, 2}), 0);
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1, 1, 1, 1, 1, 2, 1000000, 2, 2, 1000000}), 7);
		
		
		Assert.assertEquals(Main.FindPairCount(new int[] {1000000, 1000000}), 1);
	}
}
