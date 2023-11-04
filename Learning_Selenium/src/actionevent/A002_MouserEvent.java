package actionevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class A002_MouserEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		WebElement a = driver.findElement(By.linkText("Sell"));
		WebElement b = driver.findElement(By.linkText("Best Sellers"));
		WebElement c = driver.findElement(By.linkText("Today's Deals"));
		WebElement d = driver.findElement(By.linkText("Gift Ideas"));
		
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(a).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(b).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(c).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(d).build().perform();
		
		
		
	}
}
