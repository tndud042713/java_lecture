package day17;//upcasting ����
class ATest{
	public void getTest() {
		System.out.println("A_TestŬ����");
	}
}
class BTest extends ATest{
	public void getTest() {
		System.out.println("B_TestŬ����");
	}
}
class CTest extends ATest{
	public void getTest() {
		System.out.println("C_TestŬ����");
	}
}


public class MainClass04 {
	public static void main(String[] args) {
		//��ĳ����
		ATest b = new BTest(); // ��ü�� ��� ������ �ʾƵ� �ڽ����·� �θ����·� ����ȯ �Ǽ� ��
		b.getTest();
		b = new CTest();
		b.getTest();
		BTest bb = (BTest) b; //�ٿ� ĳ���� 
	}
}
