package day19;

class Car01{
	private String model;
	public Car01(String model) {this.model = model;} // ������
	public boolean equals(Object obj) {
		if(obj.equals(model)) {
			return true;
		}
		return false;
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Car01 c01 = new Car01("co2 vm502");
		Car01 c02 = new Car01("co1 vm502");
		System.out.println(c01);
		System.out.println(c02);
		if(c01.equals(c02)){ //c01�� c02�� ���� ��ü������ ���°� �̱� ������ Ʋ���ٰ� ���ϴ� ���̴�.
			System.out.println("���� ������ �ڵ���");
		}else {
			System.out.println("���� �ٸ� ������ �ڵ���");
		}
	}
}
