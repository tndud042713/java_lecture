package day14;
class Calc{
	public Calc(int n) { System.out.println(n+"Calc ������ ����"); }
	public void display() { System.out.println("���� �����~"); }
}
class Computer extends Calc{
	public Computer(int a) {
		super(a);
		System.out.println("Computer ������ ����"); 
	}
	public void print() { System.out.println("���� ��ǻ�;�");	}
}
public class MainClass {
	public static void main(String[] args) {
		Computer com = new Computer(111);
		com.print(); com.display();
		//Calc c = new Calc();
		//c.display();
	}
}


