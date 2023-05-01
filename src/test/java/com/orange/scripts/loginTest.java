package com.orange.scripts;

import org.testng.annotations.Test;

import com.orange.generic.baseLibrary;
import com.orange.generic.excelUtilities;
import com.orange.pageObject.loginPage;

public class loginTest extends baseLibrary

{
	loginPage lp;
	excelUtilities eu;
	
	public loginTest()
	{
		lp=new loginPage();
		 eu=new excelUtilities();
		
	}
	

	@Test
	public void validLogin()
	{
		String userName = eu.readData("login Credentials", 0, 0);
		String password = eu.readData("login Credentials", 0, 1);
		System.out.println(userName);
		System.out.println(password);
		lp.validLogin(userName,password);
	}
	
	@Test
	public void inValidLogin()
	{
		String userName = eu.readData("login Credentials", 1, 0);
		String password = eu.readData("login Credentials", 1, 1);
		System.out.println(userName);
		System.out.println(password);
		lp.validLogin(userName,password);
	}
	
	
}
