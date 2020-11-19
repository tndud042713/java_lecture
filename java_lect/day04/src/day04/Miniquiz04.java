package day04;

import java.util.Scanner;

public class Miniquiz04 {
public static void main(String[] args) {
	int kor,eng,mat;
	double avg;
	Scanner score = new Scanner(System.in);
	System.out.print("국어 점수를 입력하시오 : ");
	kor=score.nextInt();
	System.out.print("영어 점수를 입력하시오 : ");
	eng=score.nextInt();
	System.out.print("수학 점수를 입력하시오 : ");
	mat=score.nextInt();
	avg = (double) (kor+eng+mat)/3;
	if(kor<40||eng<40||mat<40) {
		System.out.println("과목 불합격");
	}else {
		if(avg<60) {
			System.out.println("평균 불합격");
		}else {
			System.out.println("축하합니다 합격입니다!!");
		}
	}
}
}
