package day12win7;

import java.io.IOException;
import java.util.*;
//import java.text.*;

class Win7Quiz{
	private String[] name;
	private String[] info;
	
	public void function(String funcName){
		String[] name = getName();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i=0;i<name.length;i++){	map.put(name[i], info[i]);}
		if(map.containsKey(funcName)){
			System.out.println(map.get(funcName)+"��� �մϴ�");
			excute((String)map.get(funcName));
		}else{System.out.println("���� ��� �Դϴ�");}
	}
	
	private void excute(String n) {
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		} catch (IOException e) {}
	}

	public void funcPrint(){
		System.out.print("[��밡��] : ");
		String[] name = getName();
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+"  ");
		}
		System.out.println();
	}
	
	public String[] getName() {	return name;	}
	
	public void setName() { 
		name = new String[2];
		name[0]="����"; name[1]="�޸���";
	}
	
	public String[] getInfo() {	return info;	}
	
	public void setInfo() { 
		info = new String[2];
		info[0]="calc.exe";
		info[1]="notepad.exe";
	}
	
	public void display(){
		setName();setInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ �� �� �� �� =====");
		int sel=0;
		String funcName=null;
		while(true){
			System.out.println("1.�� ��");
			System.out.println("2.off");
			System.out.print("�Է� >>>> ");
			sel = input.nextInt();
			switch(sel){
				case 1:
					funcPrint();
					System.out.print("����� ��� �Է� : ");
					funcName=input.next();
					function(funcName);break;
				case 2:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}
	}
}

public class Test01 {
	public static void main(String[] args){
		Win7Quiz win7 = new Win7Quiz();
		win7.display();
		

	}
}

