package com.heewon.one;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("���� �ð� : " + time);
		SimpleDateFormat s = 
			new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
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
		System.out.println("���� �ð� : "+endTime);
		System.out.println("���ð� : "+(endTime-time)/1000);
		*/
	}
}



