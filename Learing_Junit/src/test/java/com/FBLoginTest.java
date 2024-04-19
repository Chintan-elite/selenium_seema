package com;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

@RunWith(Parameterized.class)
public class FBLoginTest {
	
	String uname,pass;
	
	public FBLoginTest(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
		 driver = DriverConnection.connect("https://www.fb.com");
		
	}
	
	@Test
	public void login()
	{
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
	}
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][2];
		
		
		obj[0][0] = "abc@gmail.com";
		obj[0][1] = "abc123";
		
		obj[1][0] = "xyz@gmail.com";
		obj[1][1] = "xyz123";
		
		obj[2][0] = "test@gmail.com";
		obj[2][1] = "test123";
		
		obj[3][0] = "tech@gmail.com";
		obj[3][1] = "tech123";
		
		return Arrays.asList(obj);
	}
	
}
