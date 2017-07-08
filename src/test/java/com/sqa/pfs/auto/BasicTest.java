package com.sqa.pfs.auto;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

public class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl);
	}

	@BeforeClass(enabled = false)
	public void setUpChrome() throws Exception {
		// Set system property to use Chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// Setup the driver to use Chrome
		setDriver(new ChromeDriver());
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeClass(enabled = true)
	public void setUpFirefox() throws Exception {
		// Setup the driver to use Firefox
		setDriver(new FirefoxDriver());
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeClass(enabled = false)
	public void setUpIE() throws Exception {
		// Set system property to use IE driver
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		// Setup the driver to use IE
		setDriver(new InternetExplorerDriver());
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeMethod
	public void setupTest() {
		// Goto Base URL
		getDriver().get(getBaseURL());
	}

	@AfterClass(alwaysRun = false)
	public void tearDown() throws Exception {
		// quit closes all instances of the browser.
		getDriver().quit();
		// close method would close current instance only.
		// ex: driver.close();
	}
	// @Test
	// public void test1() {
	// getDriver().get(getBaseURL());
	// this.takeScreenshot(); // Auto Test 1
	// this.takeScreenshot("Test Case 01"); // Test Case 1
	// this.takeScreenshot(); // Auto Test 2
	// this.takeScreenshot();// Auto Test 3
	// this.testingName = "Adactin";
	// this.takeScreenshot("Adactin Test"); // Adactin Test
	// this.takeScreenshot(); // Adactin Test
	// AutoBasics.takeScreenshot("screenshots/", "Adactin Test 5", getDriver(),
	// getLog());
	// }
}
