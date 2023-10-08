package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B009_Webtable {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://chercher.tech/practice/table");
		
		
		
//		String data =  driver.findElement(By.xpath("//table[@id='webtable']/tbody/tr[3]/td[2]")).getText();
//		System.out.println(data);
		
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='webtable']/tbody/tr"));
		
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='webtable']/tbody/tr[1]/th"));
		for(WebElement h : head)
		{
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		for(int i=2;i<=row.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='webtable']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols)
			{
				System.out.print(col.getText()+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
