import java.util.Scanner;

public class Member05 {
	private String big(int x, int y) {
		if(x > y) { return x+"��"+y+"���� ũ��"; }
		else { return y+"��"+x+"���� ũ��";	}
	}
	public String test() {
		return big(10,20);
	}
	public void reverse() {
		int su=0, temp=0;
		int result = 0;
		su = userInput();
		while(true) {
			temp = su % 10;
			su = su/10;
			result = result * 10 + temp;
			//resultPrint(temp);
			if(su == 0) break;
		}
		resultPrint(result);
	}
	public void resultPrint(int result) {
		System.out.print(result+",");
	}
	public int userInput() {
		Scanner input = new Scanner(System.in);
		int su=0;
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		return su;
	}
	
	public int reverse02(int su) {
		int temp=0;
		int result = 0;
		while(true) {
			temp = su % 10;
			su = su/10;
			result = result * 10 + temp;
			if(su == 0) break;
		}
		return result;
	}
	public void resultPrint02(int result) {
		System.out.print(result+",");
	}
	public int userInput02() {
		Scanner input = new Scanner(System.in);
		int su=0;
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		return su;
	}
}
/*
������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ�.
(����:main������ ����ϴ� ��� �ϳ��� ȣ���ϸ� ������ �޼ҵ�� ȣ���Ͽ� ���� )
1. ���길 �ϴ� ���.
2. �Է� �޴� ���.
3. ��� �ϴ� ���.






 */







