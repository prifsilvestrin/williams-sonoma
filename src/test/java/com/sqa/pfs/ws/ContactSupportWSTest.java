package com.sqa.pfs.ws;

import org.testng.annotations.*;

public class ContactSupportWSTest extends WilliamsSonomaTest {

	@Test(dataProvider = "dp")
	public void addItemToCartTest(int id, String itemName, int quantity, double expectedPrice) {
		getLog().info("Test " + id + "\n\tSearching for " + quantity + " " + itemName + "(s) for an expected total of $"
				+ expectedPrice);
	}
	// DataHelper.displayData(dp());
	//// WebElement searchField =
	// getDriver().findElement(By.id("search-field"));
	//// searchField.sendKeys("Chef'sChoice 1520 Angle Select Electric Knife
	// Sharpener");
	//// searchField.submit();
	//// WebElement results =
	// getDriver().findElement(By.className("product-name"));
	//// results.click();
	//// WebElement quantityField =
	// getDriver().findElement(By.className("qty"));
	//// quantityField.sendKeys("3");
	// }

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "All-Clad NS1 Nonstick Induction Covered Fry Pan 12", 4, 319.80 },
				new Object[] { 2, "Walnut Knifedock In-Drawer Deluxe Tray", 3, 239.85 },
				new Object[] { 3, "Google Home", 2, 198.00 },
				new Object[] { 4, "Cuisinart Tri-ply Stainless-Steel 10-Piece Cookware Set", 2, 799.90 },
				new Object[] { 5, "Chef'sChoice 1520 Angle Select Electric Knife Sharpener", 3, 599.85 },
				new Object[] { 6, "Rustic Melamine Chip Dip Platter Ivory", 4, 83.88 },
				new Object[] { 7, "Backyard Beehive & Starter Kit", 3, 1, 619.85 },
				new Object[] { 8, "Wusthof Classic Ikon Paring Knife 3 1 2", 6, 359.70 }, };
	}
}
