package day04;

import java.util.Scanner;

public class Miniquiz02 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int Score = input.nextInt();
	
	if(Score>=1&&Score<=100) {
		System.out.println("�������� �������� �Է��Դϴ�.");
	}else
		System.out.println("���������� ���� �Է��Դϴ�.");
}
}
