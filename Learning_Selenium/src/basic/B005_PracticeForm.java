package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B005_PracticeForm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		
		List<WebElement> exp = driver.findElements(By.name("exp"));
		exp.get(0).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("28/19/2023");
		
		
		driver.findElement(By.id("profession-0")).click();
		
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("tool-2")).click();
		
		WebElement cont = driver.findElement(By.id("continents"));
		Select conts = new Select(cont);
		conts.selectByVisibleText("Africa");
		
		WebElement command = driver.findElement(By.id("selenium_commands"));
		Select commands = new Select(command);
		commands.selectByVisibleText("Browser Commands");
		commands.selectByVisibleText("Navigation Commands");
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\channels4_profile.jpg");
		
	}
}
