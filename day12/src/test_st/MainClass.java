package test_st;

import java.util.*;
import java.io.*;
import java.util.Scanner;

class Memo{
	public void memo() {
		System.out.println("memo.exe사용합니다.");
		String n = "notepad";
		ProcessBuilder pro = new ProcessBuilder(n);//"notepad"
		//pro.start();
		try {
			pro.start();
		} catch (IOException e) {}
	}
}

class Calcul {
	public void calcul() {
		System.out.println("calculator.exe사용합니다.");
		ProcessBuilder pro = new ProcessBuilder("calc");
		//pro.start();
		try{
			pro.start();
		} catch (IOException e) {}
	}
}

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Memo m = new Memo();
		Calcul c = new Calcul();

		while(true)
		{
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.print("입력 >>>>> ");

			int opt = input.nextInt();

			switch(opt)
			{
			case 1:
				System.out.println("[사용가능] : 계산기 / 메모장");
				System.out.print("사용할 기능 입력 : ");

				String cal = "계산기";
				String memo = "메모장";
				String want = input.next();

				if(cal.equals(want)) {c.calcul(); }
				else if(memo.equals(want)) {m.memo();}
				else {System.out.println("없는 기능 입니다.");}
				break;

			case 2:
				System.out.println("off");
				return;
			}
		}

	}
}