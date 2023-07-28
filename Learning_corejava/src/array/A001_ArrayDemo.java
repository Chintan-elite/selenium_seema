package array;

import java.util.Iterator;

public class A001_ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[7];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("****************************");
		
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("************************");
		
		String str[] = {"java","selenium","php","python"};
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("***************************");
		
		char ch[] = {'A','B','C','D','E'};
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
	}

}
