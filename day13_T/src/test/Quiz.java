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
			System.out.println("���� ��� �Դϴ�.");
		}
	}
	private void excute(String n) {
		System.out.println(n+".exe����մϴ�.");
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
		map.put("����", "calc");
		map.put("�޸���", "notepad");
		map.put("�׸���", "mspaint");
		Func f = new Func(map);
		while(true)		{
			System.out.println("1. ���");
			System.out.println("2. off");
			System.out.print("�Է� >>>>> ");
			int opt = input.nextInt();
			switch(opt){
			case 1:
				System.out.println("[��밡��] : ���� / �޸��� / �׸��� ");
				System.out.print("����� ��� �Է� : ");
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