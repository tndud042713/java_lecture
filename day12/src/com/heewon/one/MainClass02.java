package com.heewon.one;

public class MainClass02 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {	}
		}
		System.out.println("¹Ýº¹¹® Å»Ãâ");
	}
}
