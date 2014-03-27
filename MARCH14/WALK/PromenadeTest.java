package WALK;

import org.junit.*;

public class PromenadeTest {
	@Test
	public void testVelocity() {
		Assert.assertEquals(Main.FindMaxVelocity(new int[] {5, 4, 3, 2, 1}, 5), 5);
		
		Assert.assertEquals(Main.FindMaxVelocity(new int[] {3, 4, 3, 1, 1}, 5), 5);
		
		Assert.assertEquals(Main.FindMaxVelocity(new int[] {3, 4, 3, 1, 1, 3}, 6), 8);
		
		Assert.assertEquals(Main.FindMaxVelocity(new int[] {1, 1, 1, 1, 1, 1}, 6), 6);
	}
}
