package collection;

import java.util.ArrayList;

public class C001_ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("php");
		al.add("pythone");
		al.add("android");
			
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		
//		for(Integer i : al1)
//		{
//			System.out.println(i);
//		}
		
		ArrayList al2 = new ArrayList<>();
		al2.add(10);
		al2.add("Hello");
		al2.add('S');
		al2.add(12.33);
		al2.addAll(al1);
		al2.addAll(al);
		
		for(Object o : al2)
		{
			System.out.println(o);
		}
		
	}
}
