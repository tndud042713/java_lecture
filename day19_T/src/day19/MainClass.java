package day19;
class Car01{
	public String model;
	public Car01(String model) { this.model = model; }
	public boolean equals(Object obj) {
		if( obj.equals(model) ) {
			return true;
		}
		return false;
	}
}
public class MainClass {
	public static void main(String[] args) {
		Car01 c01 = new Car01("vm502");
		Car01 c02 = new Car01("vm502");
		System.out.println(c01);
		System.out.println(c02);
		if( c01.equals(c02) ) {
			System.out.println("���� ������ �ڵ���");
		}else {
			System.out.println("���� �ٸ� ������ �ڵ���");
		}
	}
}
