package impclasses;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		
		String str = "Sun rises in East";
		
//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.charAt(5));
//		System.out.println(str.indexOf('s'));
//		System.out.println(str.lastIndexOf('s'));
//		System.out.println(str.substring(4));
//		System.out.println(str.substring(4,11));
//		System.out.println(str.replace('s', 'X'));
		
		
//		String ar[]=str.split(" ");
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		
//		char ch[] =  str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.println(ch[i]);
//		}
//		
		
		
		byte b[] =  str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
