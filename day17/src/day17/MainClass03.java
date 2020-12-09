package day17;

final class AA {
	public void test() {
		System.out.println("부모 test");
	}
}
//extends AA -파이널을 AA에 붙였으므로 BB에서 상속 받을 수 없다.
class BB  {
	public void test() {
		System.out.println("자식 test");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		BB b = new BB();
		b.test();
		AA a = new AA();
		a.test();
	}
}

//가끔식 final 키워드를 쓰는데
//final 키워드를 쓰면 상속 받을 수 없다.