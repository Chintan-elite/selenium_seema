package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Parameterised_Multi {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = DriverConnection.connect("https://www.fb.com");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String email, String pass)
	{
		WebElement e =  driver.findElement(By.id("email"));
		e.clear();
		e.sendKeys(email);
		WebElement p =  driver.findElement(By.id("pass"));
		p.clear();
		p.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public Object[][] getdata()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech123";
		
		obj[2][0] = "demo@gmail.com";
		obj[2][1] = "demo123";
		
		obj[3][0] = "abc@gmail.com";
		obj[3][1] = "abc123";
		
		
		return obj;
		
	}
}
