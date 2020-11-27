import java.util.Scanner;

public class Student01 {
	public int age;
	public String name;
	
	public void display() { //display 메소드
		//userInput();
		System.out.println("학생 이름 : "+name);
		System.out.println("학생 나이 : "+age);
	}
	
	public void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
	}
}




