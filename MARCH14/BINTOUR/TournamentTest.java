package BINTOUR;

import org.junit.*;

public class TournamentTest {
	@Test
	public void testConfiguration() {
		Main.prepareFactorials();
		
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
		
		Assert.assertEquals(Main.getConfiurationCount(7, 16), 251404773);

		Assert.assertEquals(Main.getConfiurationCount(9, 16), 50571747);
		
		Assert.assertEquals(Main.getConfiurationCount(10, 16), 168572490);
	}
	
	@Test
	public void multiplyTest() {
		Assert.assertEquals(Main.multiply(2, 2, 1000), 4);
		
		Assert.assertEquals(Main.multiply(2, 3, 1000), 6);
		
		Assert.assertEquals(Main.multiply(2, 2, 2), 0);
		
		
		Assert.assertEquals(Main.multiply(2, 1, 1000), 2);
		
		Assert.assertEquals(Main.multiply(2, 0, 1000), 0);
		
		
		Assert.assertEquals(Main.multiply(3, 7, 1000), 21);
	}
}
