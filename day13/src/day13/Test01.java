package day13;

public class Test01 {
	public Test01(int num) {
		System.out.println(num+"생성자 실행~");
	}
	public Test01() { //디폴트생성자 -- 매개변수를 안 받는 생성자
		System.out.println("생성자 실행~");
	}
	public void test() {
		System.out.println("test 실행");
	}
}
