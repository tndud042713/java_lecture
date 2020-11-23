package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	System.out.println("연락처 저장 프로그램 만들기");
	Scanner input = new Scanner(System.in);
	ArrayList list_name = new ArrayList();
	ArrayList list_number = new ArrayList();
	String name = null;
	String number = null;
	String value = null;
	
	while(true) {
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 종료");
		int select = input.nextInt();
		
		switch(select) {
		
		case 1:
			System.out.println("이름과 전화번호를 입력합니다.");
			System.out.print("이름 입력 >>");
			name=input.next();
			list_name.add(name);
			System.out.println("연락처 입력>>");
			number = input.next();
			list_number.add(number);
			break;
		case 2:
			System.out.print("연락처를 찾으려는 사람의 이름을 입력하시오 >>");
			value = input.next();
//			System.out.println(list_name.indexOf(value));//확인을 위해 삽입한 코드
			System.out.println(list_number.get(list_name.indexOf(value)));
			break;
			
		case 3:
			System.out.print("연락처를 삭제하려는 사람의 이름을 입력하시오 >>");
			value = input.next();
			System.out.println(list_name.indexOf(value));			
			list_number.indexOf(list_name.indexOf(value));
			list_name.remove(value);
			System.out.println("이름과 연락처를 삭제했습니다.");
			break;
			
		case 4:
			System.out.println("모든 연락처를 보여줍니다.");
			for(int i=0; i<list_name.size(); i++) {
				System.out.print("이름 : "+list_name.get(i)+"\t연락처 : "+list_number.get(i)+"\n");
			}
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);		
		}
	}
}
}
