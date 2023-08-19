package impclasses;

public class S004_StringB {

	public static void main(String[] args) {
		
		//syncronised - slow
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("Hello");
		for(int i=1;i<=100000;i++)
		{
			sb1.append("Java");
		}
		double endTime = System.currentTimeMillis();
		
		
		//asychronised -fast
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Hello");
		for(int i=1;i<=100000;i++)
		{
			sb2.append("Java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
		
		
		
	}
	
	
	
}
