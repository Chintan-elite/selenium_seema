package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.LoginPageFactory;
import util.DriverConnection;

public class LoginTest extends DriverConnection{
	
	@Test
	public void test()
	{
		 driver = connect();
		
		//LoginPage login = new LoginPage(driver);
		
		LoginPageFactory login = new LoginPageFactory(driver);
		
		login.enterEmail("test@gmail.com");
		login.enterPass("test");
		login.clickLogin();
		
	}
}
