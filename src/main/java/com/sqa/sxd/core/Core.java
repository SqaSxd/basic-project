package com.sqa.sxd.core;

import java.util.*;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.sxd.helpers.*;

public class Core {

	private static int count = 1;

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	private String baseUrl;

	protected WebDriver driver;

	private Logger log = Logger.getLogger(this.getClass());

	public Core(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Core(String baseUrl, WebDriver driver) {
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	/**
	 * @return the baseUrl
	 */
	public String getBaseUrl() {
		return this.baseUrl;
	}

	public List<WebElement> getCSSPropBasedElements(By locator, String prop, String value) {
		return AutoBasics.getCSSPropBasedElements(this.getDriver(), locator, prop, value);
	}

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return this.driver;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return this.log;
	}

	public String getProp(String propName, String fileLocation, String fileName) {
		return AutoBasics.getProp(propName, fileLocation, fileName, this.getLog());
	}

	// Method that checks if an element is present on the page.
	public boolean isElementPresent(String xpathString) {
		return AutoBasics.isElementPresent(this.getDriver(), By.xpath(xpathString), this.getLog());
	}

	public void logImportantImages() {
		AutoBasics.logImportantImages(this.getDriver(), this.getLog());
	}

	// Example of a non static implementation of the static helper method
	public void takeScreenshot() {
		AutoBasics.takeScreenshot("screenshots", "Craigslist Test", this.getDriver(), this.getLog());
		count++;
	}

	// Example of a non static implementation of the static helper method
	public void takeScreenshot(String name) {
		AutoBasics.takeScreenshot("screenshots", name, this.getDriver(), this.getLog());
		count++;
	}

	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
