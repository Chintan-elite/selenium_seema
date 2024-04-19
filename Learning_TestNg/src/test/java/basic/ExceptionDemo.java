package basic;

import org.testng.annotations.Test;

public class ExceptionDemo {

		@Test(expectedExceptions = ArithmeticException.class)
		public void test()
		{
			int i=0;
			int j = 10/i;
			System.out.println(j);
		}
		
		@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
		public void run()
		{
			int a[] = new int[5];
			a[6] = 50;
		}
}
