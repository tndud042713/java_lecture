package day03;

import java.util.*;

public class Test07 {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			int Num;
			System.out.println("1.���� ����");
			System.out.println("2.����� ����");
			System.out.println("3.������");
			System.out.println(">>>");
			Num = sc.nextInt();			

			if (Num == 1) {
				System.out.println("���� ������ �����մϴ�.");
				break;
			}

			else if (Num == 2) {
				System.out.println("����� ������ �����մϴ�.");
				break;
			} else if (Num == 3) {
				System.out.println("������");
				break;
			}
			
			System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
		}

	}
}
