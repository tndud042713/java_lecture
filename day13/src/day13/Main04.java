package day13;

public class Main04 {
	public static void main(String[] args) {
		Test04 t04 = new Test04(10, 2) {
			public void mul() { System.out.println(num1*num2);}
		};
		t04.display();
	}
}
