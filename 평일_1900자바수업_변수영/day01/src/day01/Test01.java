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
		System.out.println("�ȳ��ϼ���");
			System.out.println("�ڹٿ���");
			Car mycar = new Car("�Ķ�", 30000000, "�������");
			mycar.run();
			mycar.info();
//		System.out.println("�ּ� ������ �Դϴ�.");
			System.out.println("�ּ� ������ �Դϴ�.");
			String Ha="�ϼ���";
			System.out.println("�ȳ�"+Ha+" �׷�");
			System.out.println("\"�ȳ��ϼ���!\" \"�׷�!\"");
	}
}
