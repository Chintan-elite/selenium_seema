package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B008_XpathDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		String dt = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a/span")).getText();
		System.out.println(dt);
	}
}
