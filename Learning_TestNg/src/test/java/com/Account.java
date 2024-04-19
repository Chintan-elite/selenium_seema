package com;

import org.testng.annotations.Test;

public class Account {
	
	@Test(groups = "reg")
	public void savingAccount()
	{
		System.out.println("Runing saving acc..");
	}
	
	@Test(groups = "smoke")
	public void currentAccount()
	{
		System.out.println("Running current acc..");
	}
	
	@Test
	public void loanAccount()
	{
		System.out.println("Runinng loan acc..");
	}
}
