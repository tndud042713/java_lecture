import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Test01 {
	public static void main(String[] args) {
		/*
		HashSet hs = new HashSet();
		hs.add("¶ó¸é");
		hs.add("±è¹ä");
		hs.add("¼ø´ë");
		hs.add("±è¹ä");
		System.out.println(hs);
		
	
		ArrayList arr = new ArrayList();
		arr.add("¶ó¸é");
		arr.add("±è¹ä");
		arr.add("¼ø´ë");
		arr.add("±è¹ä");
		System.out.println(arr);
		System.out.println("======================");
		for(int i=0;i < arr.size();i++) {
			System.out.println(i+"."+arr.get(i));
		}
		*/

		HashSet hs = new HashSet();
		hs.add("È«±æµ¿");hs.add("±è°³¶Ë");
		hs.add(1234);hs.add(1.123);
		Iterator it = hs.iterator();
	
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
	
		/*
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList arr = new ArrayList();
		arr.add("111");arr.add("222");
		arr.add("444");arr.add("333");
		Iterator it01 = arr.iterator();
		System.out.println(it01.next());
		System.out.println(it01.next());
		System.out.println(it01.next());
		System.out.println(it01.next());
		*/
	}
}








