package day19;

import java.util.ArrayList;

class Car{
	private int speed;
	private int gear;
	private String color;
}
public class MainClass01 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("car ∞¥√º »Æ¿Œ : "+car.getClass());
		ArrayList arr = new ArrayList();
		arr.add(1234);
		arr.add("456");
		System.out.println(arr.get(0).getClass());
		System.out.println(arr.get(1).getClass());
		
	}
}
