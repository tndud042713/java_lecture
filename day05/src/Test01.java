import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String name = null;
		int num = 0, num02 = 0 , sum = 0;
		sum = num + num02;
		System.out.println(name);
		
		while(true) 
		{
			System.out.print("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름 : "+name);
		}
		*/
		String home = null, office = null;
		int num;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록보기");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("집 주소 : ");
				home = input.next();
				System.out.println("등록 완료");
				break;
			case 2:
				System.out.print("회사 주소 : ");
				office = input.next();
				System.out.println("등록 완료");
				break;
			case 3:
				if(home == null) {
					System.out.println("집 주소는 등록되지 않았습니다");
				}else{
					System.out.println("집 : "+home);
				}
				System.out.println("회사 : "+office);
				break;
			default:System.out.println("잘못 입력");
			}
			
		}
	}
}

















