package day17;

class Test extends Thread{
	A01 a;
	Test(A01 a){ 
		this.a = a; 
	}
	public void run() {
		a.test();
	}
}
class A01{
	int sum=1;
	public synchronized void test() {
		for(int i=1;i<10;i++) {
			System.out.println(i+": sum : "+sum);
			sum += i;
		}
	}
}

public class TestClass {
	public static void main(String[] args) {
		A01 a = new A01();
		Test b = new Test(a);
		Test c = new Test(a);
		Test d = new Test(a);
		Test e = new Test(a);
	
		b.start(); c.start(); d.start(); e.start();
	}
}











