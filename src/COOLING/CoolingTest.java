package COOLING;

import org.junit.*;

public class CoolingTest {
	@Test
	public void PieCountTest() {
		Assert.assertEquals(Main.CalculateMaxPieCount(new int[] {10, 30, 20}, new int[] {30, 10, 20}), 3);
		
		Assert.assertEquals(Main.CalculateMaxPieCount(new int[] {9, 7, 16, 4, 8}, new int[] {8, 3, 14, 10, 10}), 4);
	
		Assert.assertEquals(Main.CalculateMaxPieCount(new int[] {1,1,1,1}, new int[] {1,1,1,1}),4);
		
		Assert.assertEquals(Main.CalculateMaxPieCount(new int[] {}, new int[] {}),0);
		
		Assert.assertEquals(Main.CalculateMaxPieCount(new int[] {10, 10, 10}, new int[] {1, 2, 40}),1);
	}
}
