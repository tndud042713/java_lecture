package day04; //if-else���� ���� �н�

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		if(num > 100){
		System.out.println(num+" : 100���� ũ��");
		}else if(num > 50){
		System.out.println(num+" : 50���� ũ��");
		}else{
		System.out.println(num+" : 50���� ���� ����");
		}
	}
}
