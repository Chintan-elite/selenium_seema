package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test(priority = 1)
	public void test()
	{
		System.out.println("Running test1");
	}
	
	@Test(priority = 2)
	public void beta()
	{
		System.out.println("Runing beta test");
	}
	
	@Test(priority = 3)
	public void alpha()
	{
		System.out.println("runinng alpha test");
	}
	
	@BeforeMethod
	public void beforeMethd()
	{
		System.out.println("runing before method...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("running after method...");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("runing before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("running after class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("runing before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("running after test");
	}
	
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("After suite");
	}
}
