package oops;

//parent - super - base
class A
{
	int id = 10;
	
	public void display()
	{
		System.out.println("Running display method");
	}
}

//child - sub - derived
class B extends A
{
	int id = 20;
	
	
	public void sample()
	{
		System.out.println("Id : "+id);
		System.out.println("Id : "+super.id);
		System.out.println("Running sample method...");
	}
	
	@Override
	public void display() {
		System.out.println("Display form B");
		super.display();
	}
}

class C extends B
{
	
}

public class O004_InheritanceDemo {
	public static void main(String[] args) {
		
		B b = new B();
		b.sample();
		b.display();
		
		
		
	}
}
