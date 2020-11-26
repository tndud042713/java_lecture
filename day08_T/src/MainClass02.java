import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Member02 m02 = new Member02();
		//System.out.println("main start");
		//m02.test();
		//System.out.println("main end");
		//m02.sumFunc();
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		//m02.sumFunc02(num, su);
		int s = m02.sumFunc03(num, su);
		System.out.println(s);
	}
}







