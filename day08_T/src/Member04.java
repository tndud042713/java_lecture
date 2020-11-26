
public class Member04 {
	public void test1() {
		int a=10,b=20;
		test2(10,b);
		System.out.println("test1 a => "+a);
		System.out.println("test1 b => "+b);
	}
	public void test2(int a, int b) {
		a+=100;
		b+=200;
		System.out.println("test2 a => "+a);
		System.out.println("test2 b => "+b);
	}
}
