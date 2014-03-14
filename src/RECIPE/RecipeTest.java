package RECIPE;

import java.util.BitSet;

import org.junit.*;

public class RecipeTest {
	@Test
	public void primeGeneratorTest() {
		
		BitSet bs = Main.getPrimeNumbers(10);
		Assert.assertEquals(bs.nextClearBit(3), 3);
		Assert.assertEquals(bs.nextClearBit(4), 5);
		Assert.assertEquals(bs.nextClearBit(6), 7);
		
		Assert.assertEquals(bs.nextClearBit(8), bs.length());
	}
	
	@Test
	public void primeGeneratorTest2() {
		
		BitSet bs = Main.getPrimeNumbers(21);
		Assert.assertEquals(bs.nextClearBit(3), 3);
		Assert.assertEquals(bs.nextClearBit(4), 5);
		Assert.assertEquals(bs.nextClearBit(6), 7);
		Assert.assertEquals(bs.nextClearBit(8), 11);
		Assert.assertEquals(bs.nextClearBit(12), 13);
		Assert.assertEquals(bs.nextClearBit(14), 17);
		Assert.assertEquals(bs.nextClearBit(18), 19);
		
		Assert.assertEquals(bs.nextClearBit(20), bs.length());
	}
	
	@Test
	public void primeGeneratorTest3() {
		
		BitSet bs = Main.getPrimeNumbers(3);
		Assert.assertEquals(bs.nextClearBit(1), 1);
		Assert.assertEquals(bs.nextClearBit(2), 2);
		Assert.assertEquals(bs.nextClearBit(3), 3);
		
	}
	
	@Test
	public void recipeTest1() {
		BitSet bs = Main.getPrimeNumbers(132);
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {3, 6, 9}, 3, bs), new int[] {1, 2, 3});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {1}, 1, bs), new int[] {1});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {1, 2, 3}, 1, bs), new int[] {1, 2, 3});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {3, 15, 9, 6}, 3, bs), new int[] {1, 5, 3, 2});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {3, 2, 4}, 2, bs), new int[] {3, 2, 4});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {4, 4}, 4, bs), new int[] {1, 1});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {4, 64}, 4, bs), new int[] {1, 16});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {1, 1}, 1, bs), new int[] {1, 1});
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {11, 121, 132}, 11, bs), new int[] {1, 11, 12});
		
		
		Assert.assertArrayEquals(Main.reduceRecipe(new int[] {4, 6}, 4, bs), new int[] {2, 3});
	}
}
