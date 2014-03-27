package TMSLT;

import org.junit.*;

public class TeamTest {
	@Test
	public void testTeam() {
		Assert.assertEquals(Main.FindStrengthDifference(1, 1, 1, 1, 1), 1);
		
		Assert.assertEquals(Main.FindStrengthDifference(2, 1, 1, 1, 1), 2);
		
		Assert.assertEquals(Main.FindStrengthDifference(3, 1, 1, 1, 1), 11);
		
		Assert.assertEquals(Main.FindStrengthDifference(3, 1, 2, 3, 4), 763);
		
		Assert.assertEquals(Main.FindStrengthDifference(4, 2, 3, 4, 1), 74896);
		
		Assert.assertEquals(Main.FindStrengthDifference(4, 0, 0, 0, 0), 0);
	}
}
