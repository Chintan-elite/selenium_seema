package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class FbTest {
	
	@Test
	public void titleCheck()
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		assertEquals(expectedTitle, actualTitle);
	}
}
