package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {

		// setup up
		final String siteURL = "https://www.amazon.in/";
		final String driverPath = "driver/geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.get(siteURL);

		// 6. perform test evaluation.
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Actual :: " + driver.getTitle());
		System.out.println("Expected :: " + expectedTitle);
		
		// 7 .close driver
		driver.close();

	}

}
