package oops;

class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Constructor calling..");
	}
	
	Student(int a)
	{
		System.out.println("Const calling : "+a);
	}
	
	Student(String name)
	{
		System.out.println("const calling : "+name);
	}
	
	Student(int a, String b)
	{
		System.out.println(a+" "+b);
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class O002_Constructor {
	public static void main(String[] args) {
		
		//constructor overloading
		Student s = new Student();
		Student s1 = new Student(10);
		Student s2 = new Student("sima");
		Student s3 = new Student("Test");
		Student s4 = new Student(20,"tech");
	}
}
