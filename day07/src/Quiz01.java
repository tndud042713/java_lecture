import java.util.*;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name = null;
		String price = null;
		int num=0;
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("메뉴 입력 : ");
				name = input.next();
				if(map.containsKey(name)==false) {
					System.out.print("가격 입력 : ");
					price = input.next();
					map.put(name, price);
					System.out.println("등록 되었습니다.");
				}else {
					System.out.println("존재하는 메뉴 입니다");
				}
			}
			else if(num == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
			}
			else break;
			
		}*/
		HashMap map = new HashMap();
		map.put("선풍기","100만원");
		map.put("에어컨","10만원");
		map.put("자동차","20만원");
		System.out.println("결과 : "+map.containsKey("자동차"));
		map.replace("선풍기", "123456");
		System.out.println(map);
		System.out.println("목록 : "+map.keySet());
	}

}
