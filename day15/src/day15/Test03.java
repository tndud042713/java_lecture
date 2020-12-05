package day15;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("나이 입력 : ");
		try {
			age = input.nextInt();
			if (age < 1 || age > 130) {
				throw new Exception("나이 잘못 입력 : "+age);
			}
			System.out.println("당신의 나이는 : " + age);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("다음 문장들 진행");

	}
}
