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
		System.out.println("���� �����Դϴ�");
	}	
	
	public void info() {
		System.out.println("������ "+this.color+"�� �Դϴ�");
		System.out.println("������ "+this.price+"�� �Դϴ�");
		System.out.println("�ɼ��� "+this.option+"�Դϴ�.");
	}
}
