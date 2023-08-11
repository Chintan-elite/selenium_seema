package oops;


class A1
{
	public void add(int a, int b)
	{
		int c  =a+b;
		System.out.println("Additoin is : "+c);
	}
	
	public void add(int a, int b, int c)
	{
		int r  =a+b+c;
		System.out.println("Additoin is : "+r);
	}
	
	public void add(int a, double b)
	{
		double c  =a+b;
		System.out.println("Additoin is : "+c);
	}
}
public class O009_Overloading {
	public static void main(String[] args) {
		
		
		A1 a = new A1();
		a.add(10, 20);
		a.add(10, 20,30);
		
		
		
	}
}
