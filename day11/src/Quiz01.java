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
			System.out.println("1.�α���, 2.����, 3.�α׾ƿ�");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("���� ���̵� �Է� : ");
				userId = input.next();
				System.out.print("���� ��й�ȣ �Է� : ");
				userPw = input.next();
				int result = lo.checkUser(userId,userPw);
				if(result == 0) {
					System.out.println("�������, �α��μ���, �����ܰ�����");
				}else {
					System.out.println("��������!!!!");
				}
				break;
			case 2:
				System.out.print("���� ���̵� �Է� : ");
				userId = input.next();
				System.out.print("���� ��й�ȣ �Է� : ");
				userPw = input.next();
				lo.setSaveId(userId);
				lo.setSavePw(userPw);
				System.out.println("���� ����");
				break;
			case 3:System.out.println("���α׷� ����");return ;
			}
		}
		
	}
}









