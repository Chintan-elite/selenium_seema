package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B010_DynamicWebtable {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
//		int size = rows.size();
//		
//		if(size==4)
//		{
//			System.out.println("Passed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
		
//		List<WebElement> th = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
//		List<WebElement> td = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
//		
//		int total = th.size()+td.size();
//		if(total==2)
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
//		
		
		int max = 0;
		List<WebElement> heights = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		for(WebElement height : heights)
		{
			String h = height.getText();
			int i = Integer.parseInt(h.substring(0,3));
			
			if(i>0)
			{
				max = i;
			}
			
		}
		
		System.out.println("Max height : "+max);
		
	}
}
