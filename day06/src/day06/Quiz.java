package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	System.out.println("����ó ���� ���α׷� �����");
	Scanner input = new Scanner(System.in);
	ArrayList list_name = new ArrayList();
	ArrayList list_number = new ArrayList();
	String name = null;
	String number = null;
	String value = null;
	
	while(true) {
		System.out.println("1. ����ó ���");
		System.out.println("2. ����ó ����");
		System.out.println("3. ����ó ����");
		System.out.println("4. ��� ����ó ����");
		System.out.println("5. ����");
		int select = input.nextInt();
		
		switch(select) {
		
		case 1:
			System.out.println("�̸��� ��ȭ��ȣ�� �Է��մϴ�.");
			System.out.print("�̸� �Է� >>");
			name=input.next();
			list_name.add(name);
			System.out.println("����ó �Է�>>");
			number = input.next();
			list_number.add(number);
			break;
		case 2:
			System.out.print("����ó�� ã������ ����� �̸��� �Է��Ͻÿ� >>");
			value = input.next();
//			System.out.println(list_name.indexOf(value));//Ȯ���� ���� ������ �ڵ�
			System.out.println(list_number.get(list_name.indexOf(value)));
			break;
			
		case 3:
			System.out.print("����ó�� �����Ϸ��� ����� �̸��� �Է��Ͻÿ� >>");
			value = input.next();
			System.out.println(list_name.indexOf(value));			
			list_number.indexOf(list_name.indexOf(value));
			list_name.remove(value);
			System.out.println("�̸��� ����ó�� �����߽��ϴ�.");
			break;
			
		case 4:
			System.out.println("��� ����ó�� �����ݴϴ�.");
			for(int i=0; i<list_name.size(); i++) {
				System.out.print("�̸� : "+list_name.get(i)+"\t����ó : "+list_number.get(i)+"\n");
			}
			break;
		case 5:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);		
		}
	}
}
}
