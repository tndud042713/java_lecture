package com.heewon.one;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		System.out.println("��� ���� ��� : [�޸���, ����]");
		Scanner input = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		String ex = input.next();
		if(map.containsKey(ex)) {
			String s = (String)map.get(ex);
			//Object s = map.get(ex);
			//String ss = (String)s;
			ProcessBuilder pro = new ProcessBuilder(s);
			try {
				pro.start();
			} catch (IOException e) { }
		}else {
			System.out.println("�׷� ��ɾ� ����!!!");
		}
	}
}










