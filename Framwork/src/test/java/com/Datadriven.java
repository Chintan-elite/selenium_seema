package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Datadriven {
	
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
		
		ExcellReader rd = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\Test_sima\\test.xlsx","login");
		int row = rd.rowCount();
		int col = rd.colCount();
		Object obj[][] = new Object[row][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
			
		}
		
		return obj;
		
	}
}
