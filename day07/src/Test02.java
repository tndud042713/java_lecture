import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		/*
		HashMap map = new HashMap();
		map.put("��ǳ��","100����");
		map.put("�ڵ���","20����");
		map.put("�ڵ���","1����");
		System.out.println("��ǳ�� : "+map.get("��ǳ��"));
		System.out.println("�ڵ��� : "+map.get("�ڵ���"));
		System.out.println("�ڵ��� : "+map.get("�ڵ���"));
		*/
		/*
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String key = null, value=null;
		System.out.print("������ Ű �Է� : ");
		key = input.next();
		System.out.print("������ �� �Է� : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		*/
		/*
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "200����");
		map.put("��ǳ��", "110����");
		boolean bool = map.containsKey("������");
		System.out.println(bool);
		if(bool) {
			System.out.println("�������̶�� Ű�� �ִ�");
		}
		map.replace("������", "�ٸ��� ó��");
		System.out.println(map);
		System.out.println(map.remove("������"));
		System.out.println(map.containsKey("������"));
		System.out.println(map);
		*/
		//HashMap map = new HashMap();
		
		/*
		LinkedHashMap map = new LinkedHashMap();
		map.put("��ǳ��", "100����");
		map.put("������", "200����");
		map.put("�ڵ���", "10����");
		System.out.println(map);
		System.out.println("��� : "+map.keySet());
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		System.out.println("===�ι�°===");
		it = map.keySet().iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		*/	
			HashMap map = new HashMap();
			map.put("��ǳ��","100����");
			map.put("������","10����");
			map.put("�ڵ���","20����");
			System.out.println("��ǳ�� : "+map.get("��ǳ��"));
			System.out.println("������ : "+map.get("������"));
			System.out.println("�ڵ��� : "+map.get("�ڵ���"));
			System.out.println("���°� : "+map.get("���°�"));
	
	}
}
