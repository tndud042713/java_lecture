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
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("���̵� �Է� : ");
				userId = input.next();
				System.out.print("��й�ȣ �Է� : ");
				userPwd = input.next();
				//saveId == null
				if(saveId != null) {
					if(userId.equals(saveId) &&
							userPwd.equals(savePwd)) {
						System.out.println("�������");
					}else {
						System.out.println("��������");
					}
				}else {
					System.out.println("���Ե� ������ �����ϴ�");
				}
				break;
			case 2:
				System.out.print("���̵� �Է� : ");
				saveId = input.next();
				System.out.print("��й�ȣ �Է� : ");
				savePwd = input.next();
				break;
			case 3:
				//i=1;
				bool = false;
				System.out.println("���α׷� ���� �մϴ�");
				//System.exit(0); //���α׷� ��������
				break;
			default:System.out.println("�߸��Է�");
			}
		}
		
	}
}








