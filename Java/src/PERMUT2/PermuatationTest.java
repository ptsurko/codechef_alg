package PERMUT2;

import org.junit.Assert;

import org.junit.Test;

public class PermuatationTest {
	@Test
	public void testPermuatation1() {
		int[] permutation = new int[] {1, 4, 3, 2};
		Assert.assertTrue(Main.isAmbiguous(permutation));
	}
	
	@Test
	public void testPermuatation2() {
		int[] permutation = new int[] {5};
		Assert.assertTrue(Main.isAmbiguous(permutation));
	}
	
	@Test
	public void testPermuatation3() {
		int[] permutation = new int[] {2, 3, 4, 5, 1};
		Assert.assertFalse(Main.isAmbiguous(permutation));
	}
}
