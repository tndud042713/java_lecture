import java.util.Scanner;

public class Test {
	private String big(int x, int y) { // private ���� ���̸� �ܺο��� �����ϸ� �����ǹǷ�,
		if(x > y) { // ���ڿ� + ���� = ���ڿ�
			return x+"��(��)"+y+"���� ũ��";
		}else { // ���ڿ��̹Ƿ� ��ȯ Ÿ���� String. (void �ڸ�)
			return y+"��(��)"+x+"���� ũ��";
		}
	}
	public String test() { // public���� �ٽ� big�� return ������� ����� �����ϴ�.
		return big(10, 20); // ��� ȣ��ÿ� test()�� ȣ���ؾ� test �޼ҵ� �ȿ� �ִ�
		// return big �� ����ȴ�. test�� ���ؼ� ȣ���ϸ� ���ο��� �����ϴ� ���̱� ������ ������ �߻����� �ʴ´�.
	}
	// private�� ����ڿ��� �� �ܺ������� ������ �� �ʿ䰡 ���� ��ɵ��� ���ο��� ���� �ǵ��� �Ѵ�. (?)
	public void reverse() {
		int su = 0, temp = 0;
		su = userInput();
		while(true) {
			temp = su % 10;
			su = su/10;
			resultPrint(temp);
			if(su == 0) break;
		}
	}
	public int userInput() {
		Scanner input = new Scanner(System.in);
		int su = 0;
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		return su;
	}

	public void resultPrint(int result) {
		System.out.print(result+",");
		//return 0;
	}
}
