package exception;

class InsufficinetFundException extends Exception
{
	
}

class Bank
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdrow(double amt) throws InsufficinetFundException
	{
		if(amt>balance)
		{
			throw new InsufficinetFundException();
		}
		else
		{
			balance = balance-amt;
		}
	}
}


public class Customeexception {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.getBalance();
		b.deposite(5000);
		b.deposite(4000);
		b.getBalance();
		try {
			b.withdrow(55000);
		} catch (InsufficinetFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.getBalance();
	}
}
