package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
		
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int result =  c.add(10, 20);
		int exp = 30;
		
		assertEquals(exp, result);
		
//		if(result==exp)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		
		
	}
}
