package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;
import util.ScreenShotTaker;

public class PRacticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9099616352");
		
		String myYear = "2000";
		String myMonth = "March";
		String myDay = "27";
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);		
		years.selectByVisibleText(myYear);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		for(WebElement day : days)
		{
			if(day.getText().equals(myDay))
			{
				if(day.getAttribute("aria-label").contains(myMonth))
				{
					day.click();
					break;
				}
				
			}
		}
		
		
		WebElement subject =driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//*[@for='hobbies-checkbox-2']")).click();
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\chintan.docx");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");
		ScreenShotTaker.getScreenShot(driver, "D:\\test\\reg.png");
		
		
	}
}
