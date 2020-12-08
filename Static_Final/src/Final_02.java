import java.util.Scanner;//final 예제2

public class Final_02 {
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경 전  KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("입력 : ");
		KOREA = input.nextLine();
		System.out.println("변경 후 KOREA : "+KOREA);
	}
}
