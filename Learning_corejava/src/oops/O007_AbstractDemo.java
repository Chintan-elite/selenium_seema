package oops;

abstract class Abs
{
	public abstract void display();
	public void print()
	{
		System.out.println("Running print");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		
		System.out.println("running display");
	}
	
}

public class O007_AbstractDemo {
	public static void main(String[] args) {
		
		//Abs ab  = new Abs();
		
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.print();
		
	}
}
