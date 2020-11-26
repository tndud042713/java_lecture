package day08_T;

import java.util.Scanner;

public class reverse {
	
	public void revNum() {
		int su=0, temp=0;
		int result = 0;
		su = InputNum();
		while(true) {
		temp = su%10; // 만약에 236을 넣었다면 6이 맨 앞자리로 나옴
		su = su/10; //236을 10으로 나눠서 정수만 23으로 저장하는 것
		result = result * 10 + temp;
		if(su==0) break;
		}
		resultPrint(result);
	}

	
	public int InputNum() {
		 Scanner input = new Scanner(System.in);
		 int su =0;
		 System.out.println("수 입력 : ");
		 su = input.nextInt();
		 return su;
	}
	
	public void resultPrint(int result) {
		System.out.print(result);
	}
	
}
