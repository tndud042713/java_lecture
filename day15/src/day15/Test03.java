package day15;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("���� �Է� : ");
		try {
			age = input.nextInt();
			if (age < 1 || age > 130) {
				throw new Exception("���� �߸� �Է� : "+age);
			}
			System.out.println("����� ���̴� : " + age);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("���� ����� ����");

	}
}
