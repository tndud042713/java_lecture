class This_01{
	public int a=10;
	public int age;
	public void ageFunc(int age) {
		this.age = age;
	}
	public void agePrint() {
		System.out.println("age : "+age);
	}
	public void func() {
		int a=123;
		System.out.println("this : "+this);
		System.out.println("func a : "+this.a);
	}
	public void func02() {
		System.out.println("func01 a : "+a);
	}
}
public class Test01 {
	public static void main(String[] args) {
		This_01 this01 = new This_01();
		System.out.println("this a : "+this01.a);
		this01.func();
		this01.func02();
		this01.ageFunc(20);
		this01.agePrint();
		
	}
}
