package day03;

import java.util.Scanner;// �װ� import �޴°�
//������ ����� ���� �����ϴٰ� import ��� ���� ����ϸ� ���� �� �ֵ��� �Ѵ�. - Ư�� ����� �����ٰ� ����.
public class Test01 { //Ư������� ����ϰڴٰ� �ϸ� �� ��ɸ� ���� ���� �ȴ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int num;
		int num;
		String name;
		System.out.println("�̸��� �Է� �ϼ��� : ");
		name = input.next();
		System.out.println("���̸� �Է� �ϼ��� : ");
		num = input.nextInt();
		System.out.println("�Է� ���� �̸�  : "+name);
		System.out.println("�Է� ���� ����  : "+num);
	}
}
