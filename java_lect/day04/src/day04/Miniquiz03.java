package day04;

import java.util.Scanner;

public class Miniquiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num%2==0&&num%3==0) {
			System.out.println("¦���̸鼭 3�� ���");
		}else System.out.println("�׳� ����");
	}
}

