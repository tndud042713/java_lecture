import java.util.Scanner;

public class Member02 {
	//void : 반환 자료형(return type)
	// test() : 메소드 이름
	public void test() {
		System.out.println("test기능입니다!!!");
	}
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		sum = su+num;
		System.out.println("두 수의 합 : "+sum);
	}
	public void sumFunc02(int n, int n2) {
		int sum = n + n2;
		System.out.println("두 수의 합 : "+sum);
	}
	public int sumFunc03(int n, int n2) {
		int sum = n + n2;
		return sum;
	}
}



