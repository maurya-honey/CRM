package com.orange.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.google.inject.Key;
import com.orange.generic.baseLibrary;

public class loginPage {
	
//	@FindBy (xpath="//input[@name='username']")
//	private WebElement userName;
//	
//	@FindBy(xpath = "//input[@name='password']")
//	private WebElement password;
//	
//	@FindBy(xpath = "//button[@type='submit']")
//	private WebElement loginButton;
	
	private final static By userName=By.xpath("//input[@name='username']");
	private final static By password=By.xpath("//input[@name='password']");
	private final static By loginButton=By.xpath("//button[@type='submit']");
	
	public void validLogin(String username,String pass)
	{
		baseLibrary.getDriver().findElement(userName).sendKeys(username);
		baseLibrary.getDriver().findElement(password).sendKeys(pass);
		baseLibrary.getDriver().findElement(loginButton).click();
		List<WebElement> AllLinks = baseLibrary.getDriver().findElements(By.tagName("a"));
	}
	
	
	
}
