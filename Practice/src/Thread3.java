class E01 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("E01 : " + i);
	}
}

class F01 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("F01 : " + i);
	}
}

public class Thread3 extends Thread{
	public static void main(String[] args){
		E01 a = new E01();
		F01 b = new F01();
		a.start();
		b.start();
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		}
}
