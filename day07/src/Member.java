import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Student{
	int num;
}
public class Member {
	public static void main(String[] args) {
		/*
		ArrayList<Student> st = new ArrayList<Student>();
		Student s = new Student(); s.num = 1;
		Student s1 = new Student(); s1.num = 2;
		Student s2 = new Student(); s2.num = 3;
		Student s3 = new Student(); s3.num = 4;
		st.add(s); st.add(s1); st.add(s2); st.add(s3);
		System.out.println(st.get(0).num);
		System.out.println(st.get(1).num);
		System.out.println(st.get(2).num);
		System.out.println(st.get(3).num == 3 );
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, s);
		map.put(2, s1);
		map.put(3, s2);
		*/
		
		HashMap map = new HashMap();
		map.put("선풍기","100만원");
		map.put("에어컨","10만원");
		map.put("자동차","20만원");
		System.out.println(" 목록 : "+map.entrySet());
		
		/*
			HashMap map = new HashMap();
			String key = null;
			String value = null;
			map.put("선풍기","100만원");
			map.put("에어컨","10만원");
			map.put("자동차","20만원");
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
			key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
		
			}
		*/	
	}
}





