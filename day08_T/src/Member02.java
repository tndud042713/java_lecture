import java.util.Scanner;

public class Member02 {
	//void : ��ȯ �ڷ���(return type)
	// test() : �޼ҵ� �̸�
	public void test() {
		System.out.println("test����Դϴ�!!!");
	}
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		sum = su+num;
		System.out.println("�� ���� �� : "+sum);
	}
	public void sumFunc02(int n, int n2) {
		int sum = n + n2;
		System.out.println("�� ���� �� : "+sum);
	}
	public int sumFunc03(int n, int n2) {
		int sum = n + n2;
		return sum;
	}
}



