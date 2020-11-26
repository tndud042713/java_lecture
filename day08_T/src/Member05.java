import java.util.Scanner;

public class Member05 {
	private String big(int x, int y) {
		if(x > y) { return x+"이"+y+"보다 크다"; }
		else { return y+"이"+x+"보다 크다";	}
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
		System.out.print("수 입력 : ");
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
		System.out.print("수 입력 : ");
		su = input.nextInt();
		return su;
	}
}
/*
이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오.
(참고:main에서는 출력하는 기능 하나만 호출하면 나머지 메소드들 호출하여 연산 )
1. 연산만 하는 기능.
2. 입력 받는 기능.
3. 출력 하는 기능.






 */







