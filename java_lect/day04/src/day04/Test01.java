package day04;

import java.util.*;

public class Test01 {
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	
	if(num%3==0) {
		System.out.println("입력하신 숫자는 3의 배수입니다.");
	}
	else  System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
}
}
