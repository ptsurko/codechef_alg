package NUMGAME;


import java.util.BitSet;

import org.junit.*;

public class NumgameTest {
	@Test
	public void MaxDivisorTest() {
		BitSet bitset = Main.generatePrimeNumbers(100);
		
		Assert.assertEquals(Main.getMaxDivisor(1, bitset), 1);
		
		Assert.assertEquals(Main.getMaxDivisor(2, bitset), 1);
		
		Assert.assertEquals(Main.getMaxDivisor(3, bitset), 1);
		
		Assert.assertEquals(Main.getMaxDivisor(4, bitset), 2);
		
		Assert.assertEquals(Main.getMaxDivisor(10, bitset), 5);
		
		Assert.assertEquals(Main.getMaxDivisor(21, bitset), 7);
		
		Assert.assertEquals(Main.getMaxDivisor(27, bitset), 9);
		
		Assert.assertEquals(Main.getMaxDivisor(100, bitset), 50);
	}
	
	@Test
	public void PlayTest() {
		BitSet bitset = Main.generatePrimeNumbers(1000000000);
		byte[] cache = new byte[1000000000 / 2];
		
		Assert.assertEquals(Main.Play(1, bitset, cache), "ALICE");

		Assert.assertEquals(Main.Play(2, bitset, cache), "BOB");

		Assert.assertEquals(Main.Play(10, bitset, cache), "ALICE");

		Assert.assertEquals(Main.Play(20, bitset, cache), "BOB");
		
		Assert.assertEquals(Main.Play(100, bitset, cache), "ALICE");
		
		Assert.assertEquals(Main.Play(1000000000, bitset, cache), "ALICE");
		
		Assert.assertEquals(Main.Play(500000000, bitset, cache), "BOB");
		
	}
	
	@Test
	public void GeneratePrimeNumbersTest() {
		int index = 2;
		BitSet bitset = Main.generatePrimeNumbers(1000000000);
		
		Assert.assertFalse(bitset.get(index));
		
		Assert.assertEquals(bitset.nextClearBit(3), 3);
		
		Assert.assertEquals(bitset.nextClearBit(4), 5);
		
		Assert.assertEquals(bitset.nextClearBit(6), 7);
		
		Assert.assertEquals(bitset.nextClearBit(8), 11);
		
		Assert.assertEquals(bitset.nextClearBit(12), 13);
	}
}
