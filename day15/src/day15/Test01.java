package day15;

import java.util.Scanner;

public class Test01 { //����ó��
	public static void main(String[] args) {
		try {
			int [] arr = {1,2,3};
			for(int i=0;i<5;i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�������� ������ ����˴ϴ�.");
		}
		System.out.println("��������� ����");
		/*
		Scanner input = new Scanner(System.in);
		int x,y,result;
		System.out.println("�� �Է� : ");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x/y;
			System.out.println("x / y = "+result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
		}
		System.out.println("���� ���� ����");	
		*/	
	}
}
