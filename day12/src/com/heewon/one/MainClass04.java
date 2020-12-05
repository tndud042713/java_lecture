package com.heewon.one;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		System.out.println("사용 가능 목록 : [메모장, 계산기]");
		Scanner input = new Scanner(System.in);
		System.out.print("기능 입력 : ");
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
			System.out.println("그런 명령어 없다!!!");
		}
	}
}










