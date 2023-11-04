package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class D001_datePicker {
	public static void main(String[] args) {
		
		WebDriver driver =DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		String myDate = "12";
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				date.click();
			}
		}
		
		
		
		
		
		
	}
}
