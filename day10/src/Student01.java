import java.util.Scanner;

public class Student01 {
	public int age;
	public String name;
	
	public void display() { //display �޼ҵ�
		//userInput();
		System.out.println("�л� �̸� : "+name);
		System.out.println("�л� ���� : "+age);
	}
	
	public void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		name = input.next();
		System.out.println("���� �Է� : ");
		age = input.nextInt();
	}
}




