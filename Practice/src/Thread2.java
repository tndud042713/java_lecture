class C01 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("C01 : " + i);
	}
}

class D01 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println("D01 : " + i);
	}
}

public class Thread2 extends Thread{
	public static void main(String[] args){
		C01 a = new C01();
		D01 b = new D01();
		a.start();
		b.start();
		}
}
