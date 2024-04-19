package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1()
	{
		System.out.println("running test1");
		assertTrue(false);
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("Runinng test2");
	}
}
