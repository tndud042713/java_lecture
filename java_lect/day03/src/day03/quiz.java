package day03;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int sum = 0;
		int kor_score;
		int eng_score;
		int mat_score;
		System.out.print("����� �̸��� �����Դϱ�? ");
		name = in.next();
		System.out.print(name + " ���� �������� : ");
		kor_score = in.nextInt();
		System.out.print(name + " ���� �������� : ");
		eng_score = in.nextInt();
		System.out.print(name + " ���� �������� : ");
		mat_score = in.nextInt();
		sum = kor_score + eng_score + mat_score;
		System.out.println("==============");
		System.out.println("��  ��  : ȫ  ��  ��");
		System.out.println("==============");
		System.out.println("��  ��  : " + kor_score);
		System.out.println("��  �� : " + eng_score);
		System.out.println("��  �� : " + mat_score);
		System.out.println("==============");
		System.out.println("��  ��  : " + sum);
		System.out.println("==============");
	}
}
