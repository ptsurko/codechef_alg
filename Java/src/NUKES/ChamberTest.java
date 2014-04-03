package NUKES;

import org.junit.Assert;
import org.junit.Test;

public class ChamberTest {
	@Test
	public void testChambers() {
		Assert.assertArrayEquals(Main.getFilledChambers(3,  1,  3), new int [] {1, 1, 0});
		
		Assert.assertArrayEquals(Main.getFilledChambers(8,  1,  3), new int [] {0, 0, 0});
		
		Assert.assertArrayEquals(Main.getFilledChambers(15,  1,  3), new int [] {1, 1, 1});
		
		Assert.assertArrayEquals(Main.getFilledChambers(10, 10,  10), new int [] {10, 0, 0, 0, 0, 0, 0, 0, 0, 0});
		
		Assert.assertArrayEquals(Main.getFilledChambers(1, 0, 1), new int [] {0});
		
		Assert.assertArrayEquals(Main.getFilledChambers(8, 0, 0), new int [] {});
		
		Main.getFilledChambers(1000000000,  100, 100);
	}
}
