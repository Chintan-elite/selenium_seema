
public class Datatypes {
	public static void main(String[] args) {
		
//		 byte b = -128;
//		 short s = 32767;
//		 int i = 2656;
//		 long l = 565656565;
//		 
//		float f = 45.56568989891f;
//		System.out.println(f);
//		double d = 4646.5656565656565;
//		System.out.println(d);
//		
//		char ch = 'A';
//		System.out.println(ch);
//		
//		boolean bool = true;
//		System.out.println(bool);
		
		//String name = "Seema";
		
		//widning - implicite
		int k = 10;  //4 byte
		long l = k;  //8 byte
		
		//nerrowing - explicite
		long x = 56565;       //8 byte
		int y = (int) x;      //4 byte
		
		char ch = 109;
		System.out.println(ch);
		
		int i = 'X';
		System.out.println(i);
		
	}
	
	
	
}
