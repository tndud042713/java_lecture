package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		String inputID = null, saveID = null;
		String inputPW = null, savePW = null;
		int select = 0;
		while (true) {

			System.out.print("1.�α���\n2.ȸ������\n3.������\n>>>");
			Scanner input = new Scanner(System.in);
			select = input.nextInt();

			switch (select) {

			case 1:
				System.out.print("���̵� �Է� : ");
				inputID = input.next();
				System.out.print("��й�ȣ �Է� : ");
				inputPW = input.next();
				if (inputID.equals(saveID) && inputPW.equals(savePW)) {
					System.out.println("��������!!!");
					break;
				} else {
					System.out.println("���� ����!!!");
					break;
				}

			case 2:
				System.out.print("������ ���̵� �Է� : ");
				saveID = input.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				savePW = input.next();
				System.out.println("���� �Ϸ� !!!!");
				break;

			case 3:
				System.out.println("���α׷��� �����մϴ�.");
//			System.exit(0);// ���α׷� ��������
				break;
			default:
				System.out.println("�߸� �Է�");
				break;
			}
		}
	}

}
