package exception;

public class E002_compileTime {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("exception1.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
