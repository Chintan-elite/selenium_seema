package oops;


class Super
{
	public void run()
	{
		System.out.println("Running super class run method");
	}
}

class Sub extends Super
{
	@Override
	public void run() {
		System.out.println("running sub class method");
	}
}

public class O010_Overriding {
	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.run();
		
	}
}
