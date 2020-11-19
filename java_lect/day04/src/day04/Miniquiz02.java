package day04;

import java.util.Scanner;

public class Miniquiz02 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int Score = input.nextInt();
	
	if(Score>=1&&Score<=100) {
		System.out.println("정상적인 시험점수 입력입니다.");
	}else
		System.out.println("비정상적인 점수 입력입니다.");
}
}
