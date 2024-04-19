package listener;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class FBTEst extends Base{
		
		
		@Test
		public void titleCheck()
		{
			driver = connect("https://www.fb.com");
			String actualTitle = driver.getTitle();
			String expectedTitle = "FB-Home";
			assertEquals(expectedTitle, actualTitle);
		}
		
		@Test
		public void login()
		{
			driver = connect("https://www.fb.com");
			driver.findElement(By.id("email")).sendKeys("test@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("test");
			driver.findElement(By.name("login")).click();
			String actualTitle = driver.getTitle();
			String expectedTitle = "FB-error";
			assertEquals(expectedTitle, actualTitle);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
