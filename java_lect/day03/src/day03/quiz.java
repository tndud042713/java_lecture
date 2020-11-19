package day03;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int sum = 0;
		int kor_score;
		int eng_score;
		int mat_score;
		System.out.print("당신의 이름은 무엇입니까? ");
		name = in.next();
		System.out.print(name + " 님의 국어점수 : ");
		kor_score = in.nextInt();
		System.out.print(name + " 님의 영어점수 : ");
		eng_score = in.nextInt();
		System.out.print(name + " 님의 수학점수 : ");
		mat_score = in.nextInt();
		sum = kor_score + eng_score + mat_score;
		System.out.println("==============");
		System.out.println("이  름  : 홍  길  동");
		System.out.println("==============");
		System.out.println("국  어  : " + kor_score);
		System.out.println("영  어 : " + eng_score);
		System.out.println("수  학 : " + mat_score);
		System.out.println("==============");
		System.out.println("합  계  : " + sum);
		System.out.println("==============");
	}
}
