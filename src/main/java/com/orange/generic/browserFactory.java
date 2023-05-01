package com.orange.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {
	
		
		static WebDriver driver=null;
		
		public static WebDriver launchBrowser(String browserName)
		{
			if (browserName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "C:/Users/Honey/OneDrive/Desktop/chrome/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
			}
			
			else if (browserName.equalsIgnoreCase("edge")) 
			{
				System.setProperty("webdriver.edge.driver", "C:/Users/Honey/OneDrive/Desktop/chrome/chromedriver.exe");
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				
				
			}
			
			else if (browserName.equalsIgnoreCase("firefox")) 
			
			{
				
				System.setProperty("webdriver.gecko.driver", "C:/Users/Honey/OneDrive/Desktop/chrome/chromedriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
			}
			return driver;
		}
		
		public static WebDriver getDriver()
		{
			return driver;
		}

	}



