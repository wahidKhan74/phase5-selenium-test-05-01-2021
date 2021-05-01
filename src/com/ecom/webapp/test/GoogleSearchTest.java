package com.ecom.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		final String siteURL = "https://www.google.com/";
		final String driverPath = "driver/geckodriver";

		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();

		driver.get(siteURL);

		// find element
		WebElement searchBox = driver.findElement(By.name("q"));

		// add text to search box
		searchBox.sendKeys("selenium documentation");

		// submit text
		searchBox.submit();

//		// open link 
//		WebElement refLink = driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/a"));
//		refLink.click();
//		
		// 6. perform test evaluation.
		String expectedTitle = "Google";
		if (expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		driver.close();
	}

}
