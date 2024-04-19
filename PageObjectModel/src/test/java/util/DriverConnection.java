package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
		
	public WebDriver driver;
	public static WebDriver connect()
	{
	
		Properties prop =null;
		try {
			FileInputStream fis = new FileInputStream("D:\\workspace\\Java\\Selenium_sima\\PageObjectModel\\src\\test\\resources\\data.properties");
			prop = new Properties();
			
			prop.load(fis);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
}
