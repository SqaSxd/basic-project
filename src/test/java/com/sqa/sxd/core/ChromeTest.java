package com.sqa.sxd.core;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class ChromeTest extends Core {

	/**
	 * @param baseURL
	 */
	public ChromeTest(String baseURL) {
		super(baseURL);
	}

	@BeforeClass
	public void setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		setDriver(new ChromeDriver());
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
