import java.util.Scanner;  // ���� �޸���
import java.io.IOException;
import java.util.HashMap;

class winNum{
	static int num;
	public winNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}
}


class Win7func{
	HashMap map ;
	public Win7func(HashMap map) {
		this.map = map;
	} //������
	public void exe(String s) {

		if(map.containsKey(s)) {
			System.out.println(map.get(s)+"��� �մϴ�");
			ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
			try {
				pro.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("���� ����Դϴ�.");
		}
	}
}

public class Test01{
//���θ޼ҵ�
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("�޸���", "notepad");
		map.put("����", "calc.exe");
		Win7func w07func = new Win7func(map);
		int num;
		String s;

		while(true) {
			System.out.println("1. ���");
			System.out.println("2. off");
			System.out.print(">>>>");
			winNum w07 = new winNum(input.nextInt());
			num = w07.getNum();

			if(num==1) {
				System.out.println("��� ���� : ���� �޸���");
				System.out.print("����� ��� �Է� :");
				s = input.next();
				w07func.exe(s);
			}else if(num==2) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�ٽ� �Է�");
			}
		}

	}
}
