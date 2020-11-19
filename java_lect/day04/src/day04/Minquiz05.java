package day04;

import java.util.Scanner;

public class Minquiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("0을 제외한 숫자를 입력하시오(0을 입력할시 재입력) : ");
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("=======>입력받은 값에 따라 출력되게 만드세요.<=======");
				continue;
			} 
			else {
				if (num % 3 == 0) {
					if (num % 4 == 0) {
						System.out.println(num + "은 3의 배수이면서, 4의 배수입니다.");
						break;
					} else {
						System.out.println(num + "은 3의 배수입니다.");
						break;
					}
				}else {
					if (num % 4 == 0) {
						System.out.println(num + "은 4의 배수입니다.");
						break;
					} else {
						System.out.println(num + "은 3의 배수도 4의 배수도 아닙니다.");
						break;
					}
				}
			}
		}
	}

}
