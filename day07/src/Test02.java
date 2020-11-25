import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		/*
		HashMap map = new HashMap();
		map.put("선풍기","100만원");
		map.put("자동차","20만원");
		map.put("핸드폰","1만원");
		System.out.println("선풍기 : "+map.get("선풍기"));
		System.out.println("자동차 : "+map.get("자동차"));
		System.out.println("핸드폰 : "+map.get("핸드폰"));
		*/
		/*
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String key = null, value=null;
		System.out.print("저장할 키 입력 : ");
		key = input.next();
		System.out.print("저장할 값 입력 : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		*/
		/*
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "200만원");
		map.put("선풍기", "110만원");
		boolean bool = map.containsKey("에어컨");
		System.out.println(bool);
		if(bool) {
			System.out.println("에어컨이라는 키는 있다");
		}
		map.replace("에어컨", "다른값 처리");
		System.out.println(map);
		System.out.println(map.remove("에어컨"));
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map);
		*/
		//HashMap map = new HashMap();
		
		/*
		LinkedHashMap map = new LinkedHashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "200만원");
		map.put("자동차", "10만원");
		System.out.println(map);
		System.out.println("목록 : "+map.keySet());
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		System.out.println("===두번째===");
		it = map.keySet().iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		*/	
			HashMap map = new HashMap();
			map.put("선풍기","100만원");
			map.put("에어컨","10만원");
			map.put("자동차","20만원");
			System.out.println("선풍기 : "+map.get("선풍기"));
			System.out.println("에어컨 : "+map.get("에어컨"));
			System.out.println("자동차 : "+map.get("자동차"));
			System.out.println("없는값 : "+map.get("없는값"));
	
	}
}
