package com.sqa.pfs.ws;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;

import com.sqa.pfs.auto.*;

public class WilliamsSonomaTest extends AbstractLoginTest {

	/**
	 * @param baseUrl
	 */
	public WilliamsSonomaTest() {
		super("http://williams-sonoma.com");
	}

	public void checkForPopup() {
		if (isPresent(By.cssSelector("a.stickyOverlayMinimizeButton"))) {
			WebElement popupCloseIcon = getDriver().findElement(By.cssSelector("a.stickyOverlayMinimizeButton"));
			popupCloseIcon.click();
		}
	}

	/**
	 * @see com.sqa.pfs.auto.AbstractLoginTest#login(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void login(String username, String password) {
		getLog().info("Logging into " + this.getBaseURL() + " with username:password =" + username + ":" + password);
		getDriver().get(getBaseURL());
		getDriver().get(getBaseURL());
		checkForPopup();
		Actions accountHover = new Actions(getDriver());
		WebElement myAccountButton = getDriver().findElement(By.cssSelector(".my-account a"));
		accountHover.moveToElement(myAccountButton);
		WebElement signInButton = getDriver().findElement(By.cssSelector("li.sign-in a"));
		accountHover.click(signInButton).build().perform();
		WebElement usernameField = getDriver().findElement(By.id("login-email"));
		WebElement passwordField = getDriver().findElement(By.id("login-password"));
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		usernameField.submit();
	}

	/**
	 * @see com.sqa.pfs.auto.AbstractLoginTest#logout()
	 */
	@Override
	public void logout() {
		getLog().info("Logging out of " + this.getBaseURL());
		// TODO Auto-generated method stub
	}
}
