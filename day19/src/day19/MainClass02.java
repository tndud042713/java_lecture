package day19;

class Car01{
	private String model;
	public Car01(String model) {this.model = model;} // 생성자
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
		if(c01.equals(c02)){ //c01과 c02가 같은 객체인지를 묻는거 이기 때문에 틀리다고 말하는 것이다.
			System.out.println("같은 종류의 자동차");
		}else {
			System.out.println("서로 다른 종류의 자동차");
		}
	}
}
