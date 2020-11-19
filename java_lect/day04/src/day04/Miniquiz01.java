package day04;

import java.util.Scanner;

public class Miniquiz01 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int Num;
			Num = input.nextInt();
			if (Num % 5 == 0) {
				System.out.println("5의 배수입니다.");
			} else {
				System.out.println("5의 배수가 아닙니다.");

			}

		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(e);
		}

	}
}
