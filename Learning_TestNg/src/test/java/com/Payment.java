package com;

import org.testng.annotations.Test;

public class Payment {
		
	@Test(groups = "smoke")
	public void creditCard()
	{
		System.out.println("Running crerditcard");
	}
	@Test
	public void debitCard()
	{
		System.out.println("Runinng debitcard poayment");
	}
	@Test(groups = {"reg","smoke"})
	public void cod()
	{
		System.out.println("Runing cod payment");
	}
}
