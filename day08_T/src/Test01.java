import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.name = "ȫ�浿";
		System.out.println("mem : "+mem);
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		mem.age = input.nextInt();
		System.out.print("�̸� �Է� : ");
		mem.name = input.next();
		System.out.print("�ּ� �Է� : ");
		mem.addr = input.next();
		System.out.println("�̸� : "+mem.name);
		System.out.println("���� : "+mem.age);
		System.out.println("�ּ� : "+mem.addr);
	}
}














