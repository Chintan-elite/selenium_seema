import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A : ");
		int a =sc.nextInt();
		System.out.println("Enter value for B : ");
		int b = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();	
		
		System.out.println(a+" "+b+" "+name);
		
		
		
	}
}
