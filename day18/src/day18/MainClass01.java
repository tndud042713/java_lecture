package day18;

abstract class Abs{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo(); //�߻� Ŭ�����μ� ����� �ִٴ� ���� �˷��ְ� ���� ����� �ڽ�Ŭ�������� �����
	/*
	public void combo() {
		System.out.println(num+" �� �޺� ����");
	}
	*/
	public void test() {
		System.out.println("�θ� test");
	}
}
class NewAbs extends Abs{
	public void combo() {
		System.out.println(num+" �� �޺� ���� & ����");
	}
	//.../../../../../
}
public class MainClass01 {
	public static void main(String[] args) {
		Abs a = new NewAbs();
		a.setNum(5); a.combo(); a.test();
	}
}
