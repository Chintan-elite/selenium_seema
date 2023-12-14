package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import util.DriverConnection;
import util.ScreenShotTaker;

public class ScreenShotDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		
		ScreenShotTaker.getScreenShot(driver, "D:\\test\\login.png");
		
		driver.findElement(By.linkText("Create new account")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ScreenShotTaker.getScreenShot(driver, "D:\\test\\reg.png");
		
		
	}
}
