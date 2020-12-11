package day18;

abstract class Abs{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo(); //추상 클래스로서 기능이 있다는 것은 알려주고 상세한 기능은 자식클래스에서 명시함
	/*
	public void combo() {
		System.out.println(num+" 단 콤보 공격");
	}
	*/
	public void test() {
		System.out.println("부모 test");
	}
}
class NewAbs extends Abs{
	public void combo() {
		System.out.println(num+" 단 콤보 공격 & 업글");
	}
	//.../../../../../
}
public class MainClass01 {
	public static void main(String[] args) {
		Abs a = new NewAbs();
		a.setNum(5); a.combo(); a.test();
	}
}
