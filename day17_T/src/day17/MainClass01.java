package day17;
class Ferrari{
	private int ye;//ye = 2020
	public Ferrari(int ye) { this.ye = ye; }
	public int getYe() { return ye; }
	public void speed() { System.out.println(ye+"��� ��� �ӵ� : 300km");}
}
class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { super(ye); }
	public void autoSystem() {
		System.out.println("�ڵ� ���� ��带 �����մϴ�");
	}
	public void speed() {
		System.out.println(getYe()+"��� ��� �ӵ� : 400km");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		NewFerrari nfe = new NewFerrari(2021);
		nfe.autoSystem();
		nfe.speed();
		//Ferrari fe = new Ferrari(2020);
		//fe.speed();
	}
}


