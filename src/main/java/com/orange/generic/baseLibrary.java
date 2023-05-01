package com.orange.generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseLibrary {
	
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		 driver = browserFactory.launchBrowser("chrome");
		 System.out.println("Browser Launched");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		getDriver().close();
		System.out.println("Browser Closed");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
