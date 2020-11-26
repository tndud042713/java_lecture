import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.name = "홍길동";
		System.out.println("mem : "+mem);
		
		Scanner input = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		mem.age = input.nextInt();
		System.out.print("이름 입력 : ");
		mem.name = input.next();
		System.out.print("주소 입력 : ");
		mem.addr = input.next();
		System.out.println("이름 : "+mem.name);
		System.out.println("나이 : "+mem.age);
		System.out.println("주소 : "+mem.addr);
	}
}














