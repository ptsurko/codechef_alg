package MARCHA1;

import org.junit.*;

public class BanknoteTest {
	@Test
	public void amountTest() {
		Assert.assertTrue(Main.checkWithSet(0b111, 3, new int[] {1,1,1}, 3));
		
		Assert.assertTrue(Main.checkWithSet(0b001, 3, new int[] {1,1,1}, 1));
		Assert.assertTrue(Main.checkWithSet(0b111, 3, new int[] {1,1,1}, 1));
		
		Assert.assertTrue(Main.checkWithSet(0b000, 3, new int[] {1,1,1}, 0));
	
		Assert.assertFalse(Main.checkWithSet(0b111, 3, new int[] {2,2,2}, 1));
		Assert.assertFalse(Main.checkWithSet(0b111, 3, new int[] {2,2,2}, 3));
	}
}
