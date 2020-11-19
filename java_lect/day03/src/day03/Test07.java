package day03;

import java.util.*;

public class Test07 {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			int Num;
			System.out.println("1.쉬운 게임");
			System.out.println("2.어려운 게임");
			System.out.println("3.나가기");
			System.out.println(">>>");
			Num = sc.nextInt();			

			if (Num == 1) {
				System.out.println("쉬운 게임을 시작합니다.");
				break;
			}

			else if (Num == 2) {
				System.out.println("어려운 게임을 시작합니다.");
				break;
			} else if (Num == 3) {
				System.out.println("나가기");
				break;
			}
			
			System.out.println("숫자를 잘못 입력했습니다.");
		}

	}
}
