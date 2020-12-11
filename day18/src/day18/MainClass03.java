package day18;
class A공격{
	public void 막공격_그냥공격() {
		System.out.println("막 공격할거에요");
	}
}
class B방어{
	public void defense() {
		System.out.println("방어를 시작합니다.");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		A공격 a = new A공격();
		B방어 b = new B방어();
		System.out.println("적군이 처들어온다.....");
		a.막공격_그냥공격();
		b.defense();
	}
}







