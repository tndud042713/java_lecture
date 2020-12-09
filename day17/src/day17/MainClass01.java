package day17;
class Ferrari{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void setYe(int ye) {
		this.ye = ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
	}	
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드를 시작합니다.");
	}
	public void speed() {
//		super.speed(); //부모클래스의 메소드를 확인 할 수 있다.
		System.out.println(getYe() + "년식 페라리 속도 : 400km");
		// ye를 getYe로 바꿔주었음 왜냐하면 ye는 private 선언 되었기 때문이다.
	}	
}

//메인 부
public class MainClass01 {
	public static void main(String[] args) {
//		Ferrari fe = new Ferrari(2020);
//		fe.speed();
		Ferrari nfe = new NewFerrari(2021);
		nfe.autoSystem();
		nfe.speed();
	}
}
