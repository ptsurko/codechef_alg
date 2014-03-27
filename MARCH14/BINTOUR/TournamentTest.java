package BINTOUR;

import org.junit.*;

public class TournamentTest {
	@Test
	public void testConfiguration() {
		Assert.assertEquals(Main.getConfiurationCount(0, 4), 0);
		
		Assert.assertEquals(Main.getConfiurationCount(0, 2), 2);
		
		Assert.assertEquals(Main.getConfiurationCount(1, 4), 8);
		
		Assert.assertEquals(Main.getConfiurationCount(2, 4), 16);
		
		Assert.assertEquals(Main.getConfiurationCount(3, 4), 24);
		
		
		
		Assert.assertEquals(Main.getConfiurationCount(3, 8), 1152);
		
		Assert.assertEquals(Main.getConfiurationCount(4, 8), 4608);
		
		Assert.assertEquals(Main.getConfiurationCount(5, 8), 11520);
		
		Assert.assertEquals(Main.getConfiurationCount(6, 8), 23040);
		
		Assert.assertEquals(Main.getConfiurationCount(7, 8), 40320);
	}
}
