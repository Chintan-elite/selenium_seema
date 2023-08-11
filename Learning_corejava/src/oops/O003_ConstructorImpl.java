package oops;

class Emp
{
	int id;
	String name;
	String email;
	
	Emp(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}

public class O003_ConstructorImpl {
	public static void main(String[] args) {
		
		Emp e = new Emp(001,"Parth","parth@gmail.com");
		e.display();
		
		Emp e1 = new Emp(002, "Sanket", "Sanket@gmial.com");
		e1.display();
		
		
	}
}
