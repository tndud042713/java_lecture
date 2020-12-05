package com.heewon.one;

import java.io.IOException;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("실행 명령어 입력 : ");
		String execute = input.next();
		ProcessBuilder pro = new ProcessBuilder(execute);
		try {
			pro.start();
		} catch (IOException e) { }
		
	}
}




