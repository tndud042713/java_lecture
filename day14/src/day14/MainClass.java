package day14;
class Calc{
	public Calc(int n) { System.out.println(n+"Calc 생성자 실행"); }
	public void display() { System.out.println("나는 계산기야~"); }
}
class Computer extends Calc{
	public Computer(int a) {
		super(a);
		System.out.println("Computer 생성자 실행"); 
	}
	public void print() { System.out.println("나는 컴퓨터야");	}
}
public class MainClass {
	public static void main(String[] args) {
		Computer com = new Computer(111);
		com.print(); com.display();
		//Calc c = new Calc();
		//c.display();
	}
}


