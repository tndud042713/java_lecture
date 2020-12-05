package day14;
class Super{
	protected int num;
	protected int num1;
	public Super() { num=100; num1=2000;}
}
class Child extends Super{
	private int su, su1;
	public Child() { su=10; su1=20;  }
	public void display() {
		System.out.println("num : "+num);
		System.out.println("super.num1 : "+super.num1);
		System.out.println("su : "+su);
		System.out.println("su1 : "+su1);
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		Child c = new Child();   c.display();
	}
}
