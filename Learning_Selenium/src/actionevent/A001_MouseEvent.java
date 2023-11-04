package actionevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class A001_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement f = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div/p/iframe"));
		driver.switchTo().frame(f);
				
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		WebElement img3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		WebElement img4 = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
		
		WebElement trash =  driver.findElement(By.id("trash"));
		
		Actions builder = new Actions(driver);
		
		//builder.dragAndDrop(img1, trash).build().perform();
		
		
		Action i1 =  builder.clickAndHold(img1).moveToElement(trash).build();
		Action i2 =  builder.clickAndHold(img2).moveToElement(trash).build();
		Action i3 =  builder.clickAndHold(img3).moveToElement(trash).build();
		Action i4 =  builder.clickAndHold(img4).moveToElement(trash).build();
		
		i1.perform();
		Thread.sleep(2000);
		i2.perform();
		Thread.sleep(2000);
		i3.perform();
		Thread.sleep(2000);
		i4.perform();
	}
}
