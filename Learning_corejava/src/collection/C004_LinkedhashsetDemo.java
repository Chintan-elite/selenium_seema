package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C004_LinkedhashsetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("java");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
	}
}
