package day01;

import mycar.*;

public class Test01 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			

		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Exception:"+ msg);
			
		}
		System.out.println("안녕하세요");
			System.out.println("자바연습");
			Car mycar = new Car("파랑", 30000000, "수동기어");
			mycar.run();
			mycar.info();
//		System.out.println("주석 연습용 입니다.");
			System.out.println("주석 연습용 입니다.");
			String Ha="하세요";
			System.out.println("안녕"+Ha+" 그래");
			System.out.println("\"안녕하세요!\" \"그래!\"");
	}
}
