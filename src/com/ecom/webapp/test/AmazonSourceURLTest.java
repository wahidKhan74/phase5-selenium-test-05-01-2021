package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSourceURLTest {

	public static void main(String[] args) {

		// setup up
		final String siteURL = "https://www.amazon.in";
		final String driverPath = "driver/geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.get(siteURL);

		// 6. perform test evaluation.
		if (siteURL.equals(driver.getCurrentUrl())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Actual :: " + driver.getCurrentUrl());
		System.out.println("Expected :: " + siteURL);

		// 7 .close driver
		driver.close();

	}

}
