package day04;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		System.out.print("판별하고 싶은 숫자를 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("1을 입력하셨네요");
			break;
		case 2:
			System.out.println("2를 입력하셨네요");
			break;
		case 3:
			System.out.println("3을 입력하셨네요");
			break;
		default:
			System.out.println("1,2,3 외에 다른 숫자를 입력하셨네요");
		}
	}
}
