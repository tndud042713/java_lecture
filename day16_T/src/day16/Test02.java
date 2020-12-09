package day16;

import java.util.Scanner;
class A02 extends Thread{
	public void run() {
		for( ; ; ) { // while(true)
			System.out.println("A01 : ");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = null;
		A02 a = new A02();
		a.setDaemon(true);
		a.start();
		while(true) {
			str = input.next();
			System.out.println("ÀÔ·Â °ª : "+str);
		}
	}
}







