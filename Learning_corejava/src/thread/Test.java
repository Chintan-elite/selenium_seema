package thread;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("java");
		
	}
}
