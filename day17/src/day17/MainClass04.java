package day17;//upcasting 내용
class ATest{
	public void getTest() {
		System.out.println("A_Test클래스");
	}
}
class BTest extends ATest{
	public void getTest() {
		System.out.println("B_Test클래스");
	}
}
class CTest extends ATest{
	public void getTest() {
		System.out.println("C_Test클래스");
	}
}


public class MainClass04 {
	public static void main(String[] args) {
		//업캐스팅
		ATest b = new BTest(); // 객체를 계속 만들지 않아도 자식형태로 부모형태로 형변환 되서 들어감
		b.getTest();
		b = new CTest();
		b.getTest();
		BTest bb = (BTest) b; //다운 캐스팅 
	}
}
