package day19;

import java.io.*;
import java.util.Scanner;

public class Mainclass05 {
	public static void main(String[] args)throws Exception{
//		String filePath = "D:\\test\\aaa.txt";
		String path = "D:\\test\\aaa.txt";
		File filePath = new File(path);		
		FileOutputStream fos = new FileOutputStream(filePath);	
		System.out.println(filePath.createNewFile());  //�ش� ���������� False ������ True�� ���´�.
		System.out.println("���Ϸ� ������ ���ڿ� �Է�");
		String str = new Scanner(System.in).nextLine();
	}
}
