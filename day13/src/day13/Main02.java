package day13;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		Test02 t02 = new Test02(age);
		System.out.println(t02.getAge());
	}
}
