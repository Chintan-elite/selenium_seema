package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTest {
	
	@Test
	public void test1()
	{
		System.out.println("Runinng test1");
	}
	
	//@Ignore
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Runing test3");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Running before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Running after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Running before all test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Running after all test");
	}
	
	
	
	
	
	
}
