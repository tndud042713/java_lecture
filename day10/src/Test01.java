import java.util.Scanner;

class ClassTest01{
	public static final String KOREA = "¥Î«—πŒ±π";
}
class User1{
	//public ClassTest01 c = new ClassTest01();
	public void func() { 
		System.out.println("user1 : "+ ClassTest01.KOREA );
	}
}
class User2{
	//public ClassTest01 c = new ClassTest01();
	public void func() { 
		System.out.println("user2 : "+ ClassTest01.KOREA );
	}
}
public class Test01 {
	public static void main(String[] args) {
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();   u2.func();
	}
}


