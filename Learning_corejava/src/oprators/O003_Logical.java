package oprators;

public class O003_Logical {
	public static void main(String[] args) {
		
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println(true && true);
		
		System.out.println("**********************");
		
		System.out.println(true || false);
		System.out.println(false ||true);
		System.out.println(false || false);
		System.out.println(true || true);
	
		System.out.println("**************");
		
		System.out.println(!false);
		
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println((a>b) && (c>b));
		
		System.out.println((a>b) || (c>b));
		
		
		
		
		
	}
}
