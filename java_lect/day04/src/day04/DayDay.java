package day04;

import java.util.Scanner;

public class DayDay {
public static void main(String[] args) {
	System.out.print("������ �Ǻ��ϰ� ���� ���ڸ� �Է��Ͻÿ� : ");
	Scanner input = new Scanner(System.in);
	int day= input.nextInt();
	if(day%7==1) {
		System.out.println("������");
	}else if(day%7==2) {
		System.out.println("ȭ����");
	}else if(day%7==3) {
		System.out.println("������");
	}else if(day%7==4) {
		System.out.println("�����");7
	}else if(day%7==5) {
		System.out.println("�ݿ���");
	}else if(day%7==6) {
		System.out.println("�����");
	}else {
		System.out.println("�Ͽ���");
	}
}
}
