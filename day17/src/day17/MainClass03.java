package day17;

final class AA {
	public void test() {
		System.out.println("�θ� test");
	}
}
//extends AA -���̳��� AA�� �ٿ����Ƿ� BB���� ��� ���� �� ����.
class BB  {
	public void test() {
		System.out.println("�ڽ� test");
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

//������ final Ű���带 ���µ�
//final Ű���带 ���� ��� ���� �� ����.