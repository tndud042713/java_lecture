package day19;

class Car001{
	public String model;
	public Car001(String model) {
		this.model = model;

	}
	public String toString() {
		return model;
	}
}
public class Test {
	public static void main(String[] args) {
		Car001 c01 = new Car001("vm502");
		Car001 c02 = new Car001("vm502");
		if(c01.equals(c02)) {
			System.out.println("���� ������ �ڵ���");
		}else{
			System.out.println("���� �ٸ� ������ �ڵ���");
		}

	}
}