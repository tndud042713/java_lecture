package day17;
class ATest{
	public int test;
	public void getTest() {
		System.out.println("A_Test 클래스");
	}
}
class BTest extends ATest{
	public void getTest() {
		System.out.println("B_Test 클래스");
	}
}
class CTest extends ATest{
	public void getTest() {
		System.out.println("C_Test 클래스");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		ATest b = new BTest();
		b.test = 8888;
		System.out.println("btest : "+b.test);
		b.getTest();
		b = new CTest();
		b.getTest();
		System.out.println("ctest : "+b.test);
		//BTest bb = (BTest)b;
	}
}






