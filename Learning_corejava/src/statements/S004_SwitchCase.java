package statements;

public class S004_SwitchCase {
	
	
	public static void main(String[] args) 
	{
		
		String grade = "A";
		
		switch(grade)
		{
		case "A" :
			System.out.println("Very good !!!");
			break;
		case "B" :
			System.out.println("Good !!!");
			break;
		case "C" :
			System.out.println("Need improvement");
			break;
		default : 
			System.out.println("Invalid choice");
			
		}
		
		
		
		
	}
}
