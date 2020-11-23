package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		String inputID = null, saveID = null;
		String inputPW = null, savePW = null;
		int select = 0;
		while (true) {

			System.out.print("1.로그인\n2.회원가입\n3.나가기\n>>>");
			Scanner input = new Scanner(System.in);
			select = input.nextInt();

			switch (select) {

			case 1:
				System.out.print("아이디 입력 : ");
				inputID = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPW = input.next();
				if (inputID.equals(saveID) && inputPW.equals(savePW)) {
					System.out.println("인증성공!!!");
					break;
				} else {
					System.out.println("인증 실패!!!");
					break;
				}

			case 2:
				System.out.print("저장할 아이디 입력 : ");
				saveID = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				savePW = input.next();
				System.out.println("가입 완료 !!!!");
				break;

			case 3:
				System.out.println("프로그램을 종료합니다.");
//			System.exit(0);// 프로그램 강제종료
				break;
			default:
				System.out.println("잘못 입력");
				break;
			}
		}
	}

}
