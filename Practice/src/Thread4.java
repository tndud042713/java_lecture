class A02 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("A01 : " + i);
	}
}

class B02 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("B01 : " + i);
	}
}

public class Thread4 {
	public static void main(String[] args){
		A02 a = new A02();
		B02 b = new B02();
		a.start();
		b.start();
		try{
		Thread.sleep(10000); // 10초가 지나면 아래의 문장들을 실행한다.
		}catch(InterruptedException e){}
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		}
}
