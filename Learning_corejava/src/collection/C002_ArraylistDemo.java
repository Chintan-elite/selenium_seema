package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_ArraylistDemo {
	public static void main(String[] args) {
		
		
		//defalt size : 10
		//newsize = oldsize*3/2 + 1 = 10*3/2 + 1 = 16
		ArrayList<String> s = new ArrayList<>();
		s.add("cricket");
		s.add("Hockey");
		s.add("Football");
		s.add("cricket");
		s.add(null);
		
		//s.add(1,"Vollyball");
		//s.set(1, "Vollyball");
		//s.remove(2);
		//System.out.println(s.size());
		//System.out.println(s.get(1));
		
//		for(String str : s)
//		{
//			System.out.println(str);
//		}
		
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
