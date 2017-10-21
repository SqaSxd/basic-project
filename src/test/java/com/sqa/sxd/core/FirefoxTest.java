/**
 * File Name: FirefoxTest.java<br>
 * Deng, Stephanie(Xiaofan)<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 21, 2017
 */
package com.sqa.sxd.core;

import java.util.concurrent.*;

import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

/**
 * FirefoxTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Deng, Stephanie(Xiaofan)
 * @version 1.0.0
 * @since 1.0
 */
public class FirefoxTest extends Core {

	public FirefoxTest(String baseURL) {
		super(baseURL);
	}

	@BeforeClass
	public void setFirefoxDriver() {
		// System.setProperty("webdriver.chrome.driver",
		// "drivers/chromedriver.exe");
		setDriver(new FirefoxDriver());
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Set up other window options such as fullscreen
		// getDriver().manage().window().fullscreen();
		getDriver().get(getBaseUrl());
	}

	@AfterClass
	public void tearDown() {
		this.driver.quit();
	}
}
