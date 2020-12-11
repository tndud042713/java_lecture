package day19;
class Car03{
	private String model;
	public Car03() { this.model = "ÀÚµ¿Â÷"; }
	public String toString() {
		return "Car03 : "+model;
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		Car03 c03 = new Car03();
		System.out.println( c03 );
		System.out.println( c03.toString() );
	}
}
