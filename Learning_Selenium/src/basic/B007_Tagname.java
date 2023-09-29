package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B007_Tagname {
	public static void main(String[] args) {
		
		
		WebDriver driver= DriverConnection.connect("https://www.fb.com");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		//System.out.println(tags.size());
		for(WebElement tag : tags)
		{
			System.out.println(tag.getText());
		}
		
		
		
		
		
	}
}
