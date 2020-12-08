
class variable{
	public static int cnt=10;
	public static void func() {
		System.out.println("cnt : "+ ++cnt);
	}
}

public class Static_Ex {
	public static void main(String[] args) {
		variable.func();
		/*
		variable var = new variable();
		var.func(); // static 선언이 없다면 객체를 생성해서 가져와야 한다.
		*/
	}
}
