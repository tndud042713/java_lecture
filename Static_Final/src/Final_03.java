
public class Final_03 { // static final ���� �� // static ������ ���ְ� Ȯ���غ�
	public static final String KOREA = "���ѹα�";
	public static final String PI = "3.14";
}

class User1 {
//	public Final_03 user = new Final_03(); // ���� ����ƽ ������ ���ָ� ��ü�� ���� ����� ���� �ʾƵ� �ȴ�.

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
