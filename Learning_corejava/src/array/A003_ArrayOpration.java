package array;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
//		int a[] = {10,20,30,40,50,60,70};
		
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			
//			sum = sum + a[i];
//		}
//		
//		System.out.println("Sum is : "+sum);
//		System.out.println("Avg is : "+(sum/a.length));
		
		
		int b[] = {10,20,5,2,450,1,89,100};
		
		int max = b[0];
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			
			if(b[i]>max)
			{
				max = b[i]; 
			}
			
			if(b[i]<min)
			{
				min = b[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
		
		
		
		
	}
	
}
