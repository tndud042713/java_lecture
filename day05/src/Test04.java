import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		/*
		int i = 0;
		while( i < 5 ) {
			i++;
			if(i == 3) {
				continue;
				//break;
				//System.out.println("3333333");
			}
			System.out.println("i : "+i);
		}
		System.out.println("�������� ����");
		*/
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("ù��° ���ڿ� �Է� : ");
		n1 = input.next();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		n2 = input.next();
		System.out.println(n1+", ���� : "+n1.length() );
		System.out.println(n2+", ���� : "+n2.length() );
		if( n1.equals(n2) ) { // a == b
			System.out.println("�� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ���~~~");
		}
	}
}












