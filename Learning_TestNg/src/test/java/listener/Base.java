package listener;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	WebDriver driver;
	public  WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}
	
	
//	public void getScreenShot(String img)
//	{
//		System.out.println(driver);
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File source =   screenshot.getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\test\\"+img+".png");
//		
//		try {
//			Files.copy(source, dest);
//			System.out.println("Screenshot taken");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	
}
