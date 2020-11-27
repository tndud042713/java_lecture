
public class Variable02 {
	public int var=100; //전역변수 선언
	public void func01() {
		System.out.println("func01 : "+var);
		var = 200; 
	}
	public void func02() {
		System.out.println("func02 : "+var);
	}
}
