import java.util.Scanner;//final ����2

public class Final_02 {
	public final String KOREA = "���ѹα�";
	public void func() {
		System.out.println("���� ��  KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("�Է� : ");
		KOREA = input.nextLine();
		System.out.println("���� �� KOREA : "+KOREA);
	}
}
