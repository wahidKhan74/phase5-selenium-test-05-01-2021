package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePageTest {

	public static void main(String[] args) {
		
		// 1. formulate a base test url.
		final String siteURL = "https://www.google.com/";
		
		// 2. locate web deriver
		final String driverPath = "/home/wahidkhan74gmai/PG-Workspace/phase5-selenium-test-05-01-2021/driver/geckodriver";
		
		// 3. set selenium system properties
		System.setProperty("webdriver.gecko.driver",driverPath);
		
		// 4. Instantiate selenium web driver.
		WebDriver driver = new FirefoxDriver();
		
		// 5. launch browser.
		driver.get(siteURL);
		
		// 6. perform test evaluation.
		String expectedTitle = "Googleeeeeee";
		if(expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Actual :: "+driver.getTitle());
		System.out.println("Expected :: "+expectedTitle);
		// 7 .close driver
		driver.close();
	}

}
