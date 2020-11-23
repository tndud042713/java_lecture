import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		/*
		int i = 0;
		while( i < 5 ) {
			i++;
			if(i == 3) {
				continue;
				//break;
				//System.out.println("3333333");
			}
			System.out.println("i : "+i);
		}
		System.out.println("다음문장 실행");
		*/
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("첫번째 문자열 입력 : ");
		n1 = input.next();
		System.out.print("두번째 문자열 입력 : ");
		n2 = input.next();
		System.out.println(n1+", 길이 : "+n1.length() );
		System.out.println(n2+", 길이 : "+n2.length() );
		if( n1.equals(n2) ) { // a == b
			System.out.println("두 문자열은 같다");
		}else {
			System.out.println("다르다~~~");
		}
	}
}












