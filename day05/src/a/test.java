package a;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String saveID = null, savePW = null;
		String userID = null, userPW = null;
		int num = 0;
		Scanner input = new Scanner(System.in);
		while(true) { // i == 0
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.println(" >>> ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("������ ���̵� �Է��ϼ��� : ");
				userID = input.next();
				System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
				userPW = input.next();
				if(saveID != null) {
					if(userID.equals(saveID) &&
							userPW.equals(savePW)) { // ���� null ���� ������ �ִ�
						// saveID�� ���������� equals�� ���� ���Ϸ��� �ϸ� null �� (�ƹ��͵� ������ ���� ����)
						// �� ���� ������ �߻��ϹǷ�, ����ڸ� ���� �Է¹��� ���� �����ϰ� �� userID�� .equals��
						// ���Ѵ�. / ���� null ���� ���������� ���Ϸ��� saveID == null �̶�� ����� �ִ�.
						System.out.println("���� ����");
					}else {
						System.out.println("���� ����");
					}
				}else {
					System.out.println("���Ե� ������ �����ϴ�. ");
				}break;
			case 2:
				System.out.print("���̵� �Է� : ");
				saveID = input.next();
				System.out.print("��й�ȣ �Է� : ");
				savePW = input.next();
				break;
			case 3:
				// i == 1;
				// bool = false
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���α׷� ���� ����
				break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�.");

			}

		}

	}
}
