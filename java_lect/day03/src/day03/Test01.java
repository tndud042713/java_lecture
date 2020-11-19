package day03;

import java.util.Scanner;// 그걸 import 받는거
//각각의 모듈을 따로 관리하다가 import 라는 것을 사용하면 받을 수 있도록 한다. - 특정 기능을 가져다가 쓴다.
public class Test01 { //특정기능을 사용하겠다고 하면 그 기능만 끌어 쓰면 된다.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int num;
		int num;
		String name;
		System.out.println("이름을 입력 하세요 : ");
		name = input.next();
		System.out.println("나이를 입력 하세요 : ");
		num = input.nextInt();
		System.out.println("입력 받은 이름  : "+name);
		System.out.println("입력 받은 나이  : "+num);
	}
}
