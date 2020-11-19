package day04;

import java.util.Scanner;

public class Miniquiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num%2==0&&num%3==0) {
			System.out.println("짝수이면서 3의 배수");
		}else System.out.println("그냥 정수");
	}
}

