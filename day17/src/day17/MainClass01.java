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
		System.out.println(ye + "��� ��� �ӵ� : 300km");
	}	
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("�ڵ� ���� ��带 �����մϴ�.");
	}
	public void speed() {
//		super.speed(); //�θ�Ŭ������ �޼ҵ带 Ȯ�� �� �� �ִ�.
		System.out.println(getYe() + "��� ��� �ӵ� : 400km");
		// ye�� getYe�� �ٲ��־��� �ֳ��ϸ� ye�� private ���� �Ǿ��� �����̴�.
	}	
}

//���� ��
public class MainClass01 {
	public static void main(String[] args) {
//		Ferrari fe = new Ferrari(2020);
//		fe.speed();
		Ferrari nfe = new NewFerrari(2021);
		nfe.autoSystem();
		nfe.speed();
	}
}
