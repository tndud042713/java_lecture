import java.util.Scanner;

public class Test {
	private String big(int x, int y) { // private 으로 묶이면 외부에서 접근하면 거절되므로,
		if(x > y) { // 문자열 + 숫자 = 문자열
			return x+"이(가)"+y+"보다 크다";
		}else { // 문자열이므로 반환 타입은 String. (void 자리)
			return y+"이(가)"+x+"보다 크다";
		}
	}
	public String test() { // public으로 다시 big을 return 시켜줘야 사용이 가능하다.
		return big(10, 20); // 대신 호출시에 test()를 호출해야 test 메소드 안에 있는
		// return big 이 실행된다. test를 통해서 호출하면 내부에서 접근하는 것이기 때문에 오류가 발생하지 않는다.
	}
	// private은 사용자에게 꼭 외부적으로 노출이 될 필요가 없는 기능들을 내부에서 진행 되도록 한다. (?)
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
		System.out.print("수 입력 : ");
		su = input.nextInt();
		return su;
	}

	public void resultPrint(int result) {
		System.out.print(result+",");
		//return 0;
	}
}
