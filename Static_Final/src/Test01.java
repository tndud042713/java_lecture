import java.util.Scanner;  // 계산기 메모장
import java.io.IOException;
import java.util.HashMap;

class winNum{
	static int num;
	public winNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}
}


class Win7func{
	HashMap map ;
	public Win7func(HashMap map) {
		this.map = map;
	} //생성자
	public void exe(String s) {

		if(map.containsKey(s)) {
			System.out.println(map.get(s)+"사용 합니다");
			ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
			try {
				pro.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("없는 기능입니다.");
		}
	}
}

public class Test01{
//메인메소드
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc.exe");
		Win7func w07func = new Win7func(map);
		int num;
		String s;

		while(true) {
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.print(">>>>");
			winNum w07 = new winNum(input.nextInt());
			num = w07.getNum();

			if(num==1) {
				System.out.println("사용 가능 : 계산기 메모장");
				System.out.print("사용할 기능 입력 :");
				s = input.next();
				w07func.exe(s);
			}else if(num==2) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 입력");
			}
		}

	}
}
