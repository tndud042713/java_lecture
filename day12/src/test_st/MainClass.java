package test_st;

import java.util.*;
import java.io.*;
import java.util.Scanner;

class Memo{
	public void memo() {
		System.out.println("memo.exe����մϴ�.");
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
		System.out.println("calculator.exe����մϴ�.");
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
			System.out.println("1. ���");
			System.out.println("2. off");
			System.out.print("�Է� >>>>> ");

			int opt = input.nextInt();

			switch(opt)
			{
			case 1:
				System.out.println("[��밡��] : ���� / �޸���");
				System.out.print("����� ��� �Է� : ");

				String cal = "����";
				String memo = "�޸���";
				String want = input.next();

				if(cal.equals(want)) {c.calcul(); }
				else if(memo.equals(want)) {m.memo();}
				else {System.out.println("���� ��� �Դϴ�.");}
				break;

			case 2:
				System.out.println("off");
				return;
			}
		}

	}
}