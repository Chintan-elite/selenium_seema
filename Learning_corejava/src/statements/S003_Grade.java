package statements;

import java.util.Scanner;

public class S003_Grade {
	public static void main(String[] args) {
		
		
		int marks = 0;
		
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks : ");
		marks = sc.nextInt();
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>34 && marks<=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>=1 && marks<=34)
		{
			System.out.println("Fail");
		}
		else if(marks==0)
		{
			System.out.println("Exit !!!!");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		
		
		}while(marks !=0);
		
	}
}
