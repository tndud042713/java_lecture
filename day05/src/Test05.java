import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		String saveId = null,savePwd = null;
		String userId = null, userPwd = null;
		int num = 0;
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		int i = 0;
		while(bool) {// i == 0
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("아이디 입력 : ");
				userId = input.next();
				System.out.print("비밀번호 입력 : ");
				userPwd = input.next();
				//saveId == null
				if(saveId != null) {
					if(userId.equals(saveId) &&
							userPwd.equals(savePwd)) {
						System.out.println("인증통과");
					}else {
						System.out.println("인증실패");
					}
				}else {
					System.out.println("가입된 정보가 없습니다");
				}
				break;
			case 2:
				System.out.print("아이디 입력 : ");
				saveId = input.next();
				System.out.print("비밀번호 입력 : ");
				savePwd = input.next();
				break;
			case 3:
				//i=1;
				bool = false;
				System.out.println("프로그램 종료 합니다");
				//System.exit(0); //프로그램 강제종료
				break;
			default:System.out.println("잘못입력");
			}
		}
		
	}
}








