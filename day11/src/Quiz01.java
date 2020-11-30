import java.util.Scanner;

class Login{
	private String saveId, savePw;
	public int checkUser(String userId, String userPw) {
		if(userId.equals(getSaveId()) && userPw.equals(this.savePw)) {
			return 0;
		}else {
			return 1;
		}
	}
	public String getSaveId() { return saveId; }
	public void setSaveId(String saveId) { this.saveId = saveId; }
	public String getSavePw() {	return savePw; }
	public void setSavePw(String savePw) { this.savePw = savePw; }
	
}
public class Quiz01 {
	public static void main(String[] args) {
		int num=0;
		String userId = null, userPw = null;
		Scanner input = new Scanner(System.in);
		Login lo = new Login();
		while(true) {
			System.out.println("1.로그인, 2.가입, 3.로그아웃");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("인증 아이디 입력 : ");
				userId = input.next();
				System.out.print("인증 비밀번호 입력 : ");
				userPw = input.next();
				int result = lo.checkUser(userId,userPw);
				if(result == 0) {
					System.out.println("인증통과, 로그인성공, 다음단계진행");
				}else {
					System.out.println("인증실패!!!!");
				}
				break;
			case 2:
				System.out.print("가입 아이디 입력 : ");
				userId = input.next();
				System.out.print("가입 비밀번호 입력 : ");
				userPw = input.next();
				lo.setSaveId(userId);
				lo.setSavePw(userPw);
				System.out.println("가입 성공");
				break;
			case 3:System.out.println("프로그램 종료");return ;
			}
		}
		
	}
}









