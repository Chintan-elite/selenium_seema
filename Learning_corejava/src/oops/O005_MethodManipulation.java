package oops;


class Calc
{
	public void print()
	{
		System.out.println("running print...");
	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition is : "+c);
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public String getName()
	{
		return "sima";
	}
	
	public void ArrayAdd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum : "+sum);
	}
	
	
}

public class O005_MethodManipulation {
	public static void main(String[] args) {
		
		
		Calc c = new Calc();
		c.print();
		c.add(10, 20);
		c.add(30, 60);
		int s = c.square(10);
		System.out.println(s);
		String name = c.getName();
		System.out.println(name);
		
		System.out.println(c.square(50));
		System.out.println(c.getName());
		
		int a[] = {10,20,30,40,50,60};
		c.ArrayAdd(a);
		int b[] = {100,20,20,30,60,40};
		c.ArrayAdd(b);
	}
}
