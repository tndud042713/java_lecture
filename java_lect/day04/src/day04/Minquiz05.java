package day04;

import java.util.Scanner;

public class Minquiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("0�� ������ ���ڸ� �Է��Ͻÿ�(0�� �Է��ҽ� ���Է�) : ");
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("=======>�Է¹��� ���� ���� ��µǰ� ���弼��.<=======");
				continue;
			} 
			else {
				if (num % 3 == 0) {
					if (num % 4 == 0) {
						System.out.println(num + "�� 3�� ����̸鼭, 4�� ����Դϴ�.");
						break;
					} else {
						System.out.println(num + "�� 3�� ����Դϴ�.");
						break;
					}
				}else {
					if (num % 4 == 0) {
						System.out.println(num + "�� 4�� ����Դϴ�.");
						break;
					} else {
						System.out.println(num + "�� 3�� ����� 4�� ����� �ƴմϴ�.");
						break;
					}
				}
			}
		}
	}

}
