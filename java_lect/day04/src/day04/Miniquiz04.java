package day04;

import java.util.Scanner;

public class Miniquiz04 {
public static void main(String[] args) {
	int kor,eng,mat;
	double avg;
	Scanner score = new Scanner(System.in);
	System.out.print("���� ������ �Է��Ͻÿ� : ");
	kor=score.nextInt();
	System.out.print("���� ������ �Է��Ͻÿ� : ");
	eng=score.nextInt();
	System.out.print("���� ������ �Է��Ͻÿ� : ");
	mat=score.nextInt();
	avg = (double) (kor+eng+mat)/3;
	if(kor<40||eng<40||mat<40) {
		System.out.println("���� ���հ�");
	}else {
		if(avg<60) {
			System.out.println("��� ���հ�");
		}else {
			System.out.println("�����մϴ� �հ��Դϴ�!!");
		}
	}
}
}
