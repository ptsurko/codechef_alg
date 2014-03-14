package CIELRCPT;

import org.junit.*;

public class MenuTest {
	@Test
	public void testMenus() {
		Assert.assertArrayEquals(Main.getMenuCounts(1), new int [] {1});
		
		Assert.assertArrayEquals(Main.getMenuCounts(10), new int [] {0, 1, 0, 1});
		
		Assert.assertArrayEquals(Main.getMenuCounts(256), new int [] {0, 0, 0, 0, 0, 0, 0, 0, 1});
		
		Assert.assertArrayEquals(Main.getMenuCounts(255), new int [] {1, 1, 1, 1, 1, 1, 1, 1});
		
		Assert.assertArrayEquals(Main.getMenuCounts(4096), new int [] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2});
	}
}
