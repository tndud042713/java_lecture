package day18;

import java.util.Scanner;

interface A����{
	public void attack(); //���ݱ�� �ۼ��� �ּ���
	public void defense();//����� �ۼ��� �ּ���
}
class A���� implements A����{
	public void attack() {	System.out.println("������ ���� �մϴ�");}
	public void defense() {	System.out.println("������ ��� �մϴ�");}
}
class B���� implements A����{
	public void attack() {	System.out.println("����Ⱑ ���� �մϴ�");	}
	public void defense() {	System.out.println("����Ⱑ ��� �մϴ�");	}
}
public class MainClass04 {
	public static void main(String[] args) {
		//A���� ���� = new A����();
		//A���� ���� = new B����();
		A���� parents = null;
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice = 0, num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num == 1) { 
			System.out.println("������ �����ϼ̽��ϴ�"); 
			parents = new A����();
		}
		else {	
			System.out.println("������ �����ϼ̽��ϴ�");	
			parents = new B����();	
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice == 1) {
			parents.attack();
		}else {
			parents.defense();
		}
		/*
		if(choice == 1 && num == 1) {	����.attack();	}
		else if(choice == 2 && num == 1) {	����.defense();	}
		else if(choice == 1 && num == 2) {	����.attack(); }
		else if(choice == 2 && num == 2) {	����.defense();	}
		*/
	}
}












