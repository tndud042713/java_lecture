import java.util.Scanner; //final���� 1

public class Final_01 {
	public String KOREA = "���ѹα�";
	public void func() {
		System.out.println("���� �� KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ��� : ");
		KOREA = input.nextLine();
		System.out.println("���� �� KOREA : "+KOREA);		
		
	}
}
