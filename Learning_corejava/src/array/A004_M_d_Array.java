package array;

public class A004_M_d_Array {
	public static void main(String[] args) {
		
		
		//int a[] = {30,33,32,29,30,31,32};
		
		int a[][] = new int[3][5];
		
		a[0][0] = 29;
		a[0][1] = 30;
		a[0][2] = 33;
		a[0][3] = 32;
		a[0][4] = 30;
		
		a[1][0] = 29;
		a[1][1] = 30;
		a[1][2] = 33;
		a[1][3] = 32;
		a[1][4] = 30;
		
		a[2][0] = 29;
		a[2][1] = 30;
		a[2][2] = 33;
		a[2][3] = 32;
		a[2][4] = 30;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
