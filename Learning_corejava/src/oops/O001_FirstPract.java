package oops;

class Pen
{
	//variables -data memeber
	int price = 20;
	String color = "red";
	static String company = "cello";
	
	//method - function member
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("Runniing display..");
	}
	
}

public class O001_FirstPract {
	public static void main(String[] args) {
		
		Pen.company = "SS";
		Pen.display();
		
		Pen p = new Pen();
		p.color="black";
		//p.company="SS";
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.color="blue";
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		
		
	}
}
