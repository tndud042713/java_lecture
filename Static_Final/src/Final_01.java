import java.util.Scanner; //final예제 1

public class Final_01 {
	public String KOREA = "대한민국";
	public void func() {
		System.out.println("변경 전 KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.print("변경할 내용을 입력하세요 : ");
		KOREA = input.nextLine();
		System.out.println("변경 후 KOREA : "+KOREA);		
		
	}
}
