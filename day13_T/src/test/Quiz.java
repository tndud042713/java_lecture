package test;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

class Func{
	private HashMap map;
	public Func(HashMap map) {
		this.map = map;
	}
	public void excuteFunc(String want) {
		if(map.containsKey(want)) {
			excute((String)map.get(want));
		}
		else {
			System.out.println("없는 기능 입니다.");
		}
	}
	private void excute(String n) {
		System.out.println(n+".exe사용합니다.");
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		} catch (IOException e) {}
	}
}
public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("계산기", "calc");
		map.put("메모장", "notepad");
		map.put("그림판", "mspaint");
		Func f = new Func(map);
		while(true)		{
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.print("입력 >>>>> ");
			int opt = input.nextInt();
			switch(opt){
			case 1:
				System.out.println("[사용가능] : 계산기 / 메모장 / 그림판 ");
				System.out.print("사용할 기능 입력 : ");
				String want = input.next();
				f.excuteFunc(want);
				break;
			case 2:
				System.out.println("off");
				return;
			}
		}

	}
}