package day19;

import java.io.*;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		//String filePath01 = "K:\\test\\aaa.txt";
		String path = "K:\\test\\aaa.txt";
		File filePath = new File(path);
		
		File file = new File("k:\\test\\ddd");
		//file.mkdir();
		
		//Thread.sleep(1000);
		
		FileOutputStream fos = new FileOutputStream("k:\\test\\ddd\\aaa.html");
		//fos.write(97); // 1byte ũ���� ��
		//fos.write("aaaaa");
		System.out.println( filePath.createNewFile() );
		
		System.out.println("���Ϸ� ������ ���ڿ� �Է�");
		String str = new Scanner(System.in).nextLine();
		fos.write(str.getBytes());
		
	}
}
















