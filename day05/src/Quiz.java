import java.io.*;
import java.util.*;
public class Quiz {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String saveID=null,savePW=null,newID=null,newPW=null;
		boolean flag = true;
		int num;
		while(flag){
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 3){
				System.out.println("���α׷� ���� �մϴ�!!!");
				break;
			}
			switch(num){
			case 1:
				System.out.print("���̵� �Է� : ");
				newID = input.next();
				System.out.print("��й�ȣ �Է� : ");
				newPW = input.next();
				if(newID.equals(saveID) && newPW.equals(savePW))
					System.out.println("���� ���� !!!");
				else
					System.out.println("���� ���� !!!");
				break;
			case 2:
				System.out.print("������ ���̵� �Է� : ");
				saveID = input.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				savePW = input.next();
				System.out.print("���� �Ϸ� !!!");
			}
		}
	}
}











