package day17;
class AA{
	public void test() { System.out.println("�θ� test");}
}
class BB extends AA{
	public void test() { System.out.println("�ڽ� test");}
}
public class MainClass03 {
	public static void main(String[] args) {
		BB b = new BB();
		b.test();
		//AA a = new AA();
		//a.test();
	}
}
