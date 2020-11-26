
public class Overloading01 {
	public int sumFunc(int a, int b) {
		System.out.println("정수 연산 : "+ (a+b) );
		return 100;
	}
	public int sumFunc(String a, String b) {
		System.out.println("문자열 연산 : "+ (a+b) );
		return 100;
	}
	public void sumFunc(String a) {
		System.out.println("문자열 정수 연산 : "+ (a) );
	}
}
