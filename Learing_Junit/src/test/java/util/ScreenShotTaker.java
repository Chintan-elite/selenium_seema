package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShotTaker {
	
		public static void getScreenShot(WebDriver driver, String path)
		{
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source =   screenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			
			try {
				Files.copy(source, dest);
				System.out.println("Screenshot taken");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
