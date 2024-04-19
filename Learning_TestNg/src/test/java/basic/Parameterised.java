package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Parameterised {
	
	@Parameters({"email","pass"})
	@Test
	public void login(String email, String pass)
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
}
