package day15;

import java.util.Scanner;

public class Test01 { //예외처리
	public static void main(String[] args) {
		try {
			int [] arr = {1,2,3};
			for(int i=0;i<5;i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("마지막에 무조건 실행됩니다.");
		}
		System.out.println("다음문장들 실행");
		/*
		Scanner input = new Scanner(System.in);
		int x,y,result;
		System.out.println("수 입력 : ");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x/y;
			System.out.println("x / y = "+result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("문제 발생");
		}
		System.out.println("다음 문장 실행");	
		*/	
	}
}
