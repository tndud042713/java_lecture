
public class Overloading01 {
	public int sumFunc(int a, int b) {
		System.out.println("���� ���� : "+ (a+b) );
		return 100;
	}
	public int sumFunc(String a, String b) {
		System.out.println("���ڿ� ���� : "+ (a+b) );
		return 100;
	}
	public void sumFunc(String a) {
		System.out.println("���ڿ� ���� ���� : "+ (a) );
	}
}
