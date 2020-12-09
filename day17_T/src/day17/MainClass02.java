package day17;
class A{ }
class B extends A{}
class C extends A{}
class B1 extends A{}
class C1 extends A{}
class B2 extends A{}
class C2 extends A{}
public class MainClass02 {
	public static void main(String[] args) {
		A b = new B();
		b = new C();
	}
}
