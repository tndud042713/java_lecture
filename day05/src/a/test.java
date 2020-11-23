package a;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String saveID = null, savePW = null;
		String userID = null, userPW = null;
		int num = 0;
		Scanner input = new Scanner(System.in);
		while(true) { // i == 0
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.println(" >>> ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("저장할 아이디를 입력하세요 : ");
				userID = input.next();
				System.out.print("저장할 비밀번호를 입력하세요 : ");
				userPW = input.next();
				if(saveID != null) {
					if(userID.equals(saveID) &&
							userPW.equals(savePW)) { // 현재 null 값을 가지고 있는
						// saveID를 직접적으로 equals를 통해 비교하려고 하면 null 값 (아무것도 가지고 있지 않음)
						// 에 의해 오류가 발생하므로, 사용자를 통해 입력받은 값을 저장하게 될 userID를 .equals로
						// 비교한다. / 만약 null 값을 직접적으로 비교하려면 saveID == null 이라는 방법도 있다.
						System.out.println("인증 성공");
					}else {
						System.out.println("인증 실패");
					}
				}else {
					System.out.println("가입된 정보가 없습니다. ");
				}break;
			case 2:
				System.out.print("아이디 입력 : ");
				saveID = input.next();
				System.out.print("비밀번호 입력 : ");
				savePW = input.next();
				break;
			case 3:
				// i == 1;
				// bool = false
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램 강제 종료
				break;
			default : System.out.println("잘못 입력하였습니다.");

			}

		}

	}
}
