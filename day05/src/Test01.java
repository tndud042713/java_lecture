import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String name = null;
		int num = 0, num02 = 0 , sum = 0;
		sum = num + num02;
		System.out.println(name);
		
		while(true) 
		{
			System.out.print("�̸� �Է� : ");
			name = input.next();
			System.out.println("����� �̸� : "+name);
		}
		*/
		String home = null, office = null;
		int num;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��Ϻ���");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("�� �ּ� : ");
				home = input.next();
				System.out.println("��� �Ϸ�");
				break;
			case 2:
				System.out.print("ȸ�� �ּ� : ");
				office = input.next();
				System.out.println("��� �Ϸ�");
				break;
			case 3:
				if(home == null) {
					System.out.println("�� �ּҴ� ��ϵ��� �ʾҽ��ϴ�");
				}else{
					System.out.println("�� : "+home);
				}
				System.out.println("ȸ�� : "+office);
				break;
			default:System.out.println("�߸� �Է�");
			}
			
		}
	}
}

















