import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		Test02 t02 = new Test02(age);
		//t02.setAge(age);
		System.out.println( t02.getAge() );
	}
}


