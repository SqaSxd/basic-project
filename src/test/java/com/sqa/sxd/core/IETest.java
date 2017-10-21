package com.sqa.sxd.core;

import java.util.concurrent.*;

import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

public class IETest extends Core {

	public IETest(String baseURL) {
		super(baseURL);
	}

	@BeforeMethod
	public void setIEDriver() {
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		setDriver(new InternetExplorerDriver());
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Set up other window options such as fullscreen
		// getDriver().manage().window().fullscreen();
		getDriver().get(getBaseUrl());
	}

	@AfterMethod
	public void tearDown() {
		this.driver.quit();
	}
}
