package com.heewon.one;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("현재 시간 : " + time);
		SimpleDateFormat s = 
			new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String resultTime = s.format(time);
		System.out.println(resultTime);
		Date date = new Date();
		System.out.println( s.format(date) );
		/*
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("종료 시간 : "+endTime);
		System.out.println("사용시간 : "+(endTime-time)/1000);
		*/
	}
}



