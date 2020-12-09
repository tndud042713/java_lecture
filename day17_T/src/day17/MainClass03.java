package day17;
class AA{
	public void test() { System.out.println("부모 test");}
}
class BB extends AA{
	public void test() { System.out.println("자식 test");}
}
public class MainClass03 {
	public static void main(String[] args) {
		BB b = new BB();
		b.test();
		//AA a = new AA();
		//a.test();
	}
}
