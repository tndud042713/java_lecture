package day19;

import java.io.*;
import java.util.Scanner;

public class Mainclass05 {
	public static void main(String[] args)throws Exception{
//		String filePath = "D:\\test\\aaa.txt";
		String path = "D:\\test\\aaa.txt";
		File filePath = new File(path);		
		FileOutputStream fos = new FileOutputStream(filePath);	
		System.out.println(filePath.createNewFile());  //해당 파일있으면 False 없으면 True가 나온다.
		System.out.println("파일로 저장할 문자열 입력");
		String str = new Scanner(System.in).nextLine();
	}
}
