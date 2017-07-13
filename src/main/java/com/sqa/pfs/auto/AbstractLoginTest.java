/**
 * File Name: AbstractLoginTest.java<br>
 * Ferreira Silvestrin, Priscila<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.pfs.auto;

import org.testng.annotations.*;

import com.sqa.pfs.auto.*;

/**
 * AbstractLoginTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Ferreira Silvestrin, Priscila
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractLoginTest extends BasicTest {

	/**
	 * @param baseUrl
	 */
	public AbstractLoginTest(String baseUrl) {
		super(baseUrl);
	}

	abstract public void login(String username, String password);

	abstract public void logout();

	@BeforeClass
	public void setupLogin() {
		login(getProp("username"), getProp("password"));
	}

	@AfterClass
	public void setupLogout() {
		logout();
	}
}
