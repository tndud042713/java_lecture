import java.util.Scanner;

public class MainGame01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Game_01 gg = new Game_01();
		System.out.println("1.���Ӽ���, 2.���ӽ���");
		System.out.print(">>> : ");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println(Game_01.info); //info�� static �����ؼ� ���������� ������� ������ ����� �� ����
		}else if(num == 2) {
			Game_01 gg = new Game_01();
			gg.make();
			gg.make02();
			gg.make1();
		}
	}
}
