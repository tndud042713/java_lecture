package day04;

import java.util.Scanner;

public class DayDay {
public static void main(String[] args) {
	System.out.print("요일을 판별하고 싶은 숫자를 입력하시오 : ");
	Scanner input = new Scanner(System.in);
	int day= input.nextInt();
	if(day%7==1) {
		System.out.println("월요일");
	}else if(day%7==2) {
		System.out.println("화요일");
	}else if(day%7==3) {
		System.out.println("수요일");
	}else if(day%7==4) {
		System.out.println("목요일");7
	}else if(day%7==5) {
		System.out.println("금요일");
	}else if(day%7==6) {
		System.out.println("토요일");
	}else {
		System.out.println("일요일");
	}
}
}
