
public class Final_03 { // static final 수정 전 // static 수정도 해주고 확인해봄
	public static final String KOREA = "대한민국";
	public static final String PI = "3.14";
}

class User1 {
//	public Final_03 user = new Final_03(); // 위에 스테틱 선언을 해주면 객체를 따로 만들어 주지 않아도 된다.

	public void func() {
		System.out.println("KOREA : " + Final_03.KOREA);
		System.out.println("PI : " + Final_03.PI);
	}
}

class User2 {
	public Final_03 user = new Final_03();

	public void func() {
		System.out.println("KOREA : " + Final_03.KOREA);
		System.out.println("PI : " + Final_03.PI);
	}

}
