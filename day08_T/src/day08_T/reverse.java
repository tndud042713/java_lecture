package day08_T;

import java.util.Scanner;

public class reverse {
	
	public void revNum() {
		int su=0, temp=0;
		int result = 0;
		su = InputNum();
		while(true) {
		temp = su%10; // ���࿡ 236�� �־��ٸ� 6�� �� ���ڸ��� ����
		su = su/10; //236�� 10���� ������ ������ 23���� �����ϴ� ��
		result = result * 10 + temp;
		if(su==0) break;
		}
		resultPrint(result);
	}

	
	public int InputNum() {
		 Scanner input = new Scanner(System.in);
		 int su =0;
		 System.out.println("�� �Է� : ");
		 su = input.nextInt();
		 return su;
	}
	
	public void resultPrint(int result) {
		System.out.print(result);
	}
	
}
