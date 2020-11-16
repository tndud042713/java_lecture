package mycar;

public class Car {
	String color;
	int price;
	String option;
	
	public Car(String color,int price,String option) {
		this.color=color;
		this.price=price;
		this.option=option;		
	}
	
	public void run() {
		System.out.println("차가 움직입니다");
	}	
	
	public void info() {
		System.out.println("색상은 "+this.color+"색 입니다");
		System.out.println("가격은 "+this.price+"원 입니다");
		System.out.println("옵션은 "+this.option+"입니다.");
	}
}
