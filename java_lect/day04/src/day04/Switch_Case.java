package day04;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		System.out.print("�Ǻ��ϰ� ���� ���ڸ� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("1�� �Է��ϼ̳׿�");
			break;
		case 2:
			System.out.println("2�� �Է��ϼ̳׿�");
			break;
		case 3:
			System.out.println("3�� �Է��ϼ̳׿�");
			break;
		default:
			System.out.println("1,2,3 �ܿ� �ٸ� ���ڸ� �Է��ϼ̳׿�");
		}
	}
}
