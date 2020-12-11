package day18;

import java.util.Scanner;

interface A공방{
	public void attack(); //공격기능 작성해 주세요
	public void defense();//방어기능 작성해 주세요
}
class A지상군 implements A공방{
	public void attack() {	System.out.println("지상군이 공격 합니다");}
	public void defense() {	System.out.println("지상군이 방어 합니다");}
}
class B공군 implements A공방{
	public void attack() {	System.out.println("비행기가 공격 합니다");	}
	public void defense() {	System.out.println("비행기가 방어 합니다");	}
}
public class MainClass04 {
	public static void main(String[] args) {
		//A공방 지상군 = new A지상군();
		//A공방 공군 = new B공군();
		A공방 parents = null;
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice = 0, num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num == 1) { 
			System.out.println("지상군을 선택하셨습니다"); 
			parents = new A지상군();
		}
		else {	
			System.out.println("공군을 선택하셨습니다");	
			parents = new B공군();	
		}
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		if(choice == 1) {
			parents.attack();
		}else {
			parents.defense();
		}
		/*
		if(choice == 1 && num == 1) {	지상군.attack();	}
		else if(choice == 2 && num == 1) {	지상군.defense();	}
		else if(choice == 1 && num == 2) {	공군.attack(); }
		else if(choice == 2 && num == 2) {	공군.defense();	}
		*/
	}
}












