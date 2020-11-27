import java.util.Scanner;

public class MainGame01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Game_01 gg = new Game_01();
		System.out.println("1.게임설명, 2.게임시작");
		System.out.print(">>> : ");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println(Game_01.info); //info를 static 선언해서 전역변수로 만들었기 때문에 사용할 수 있음
		}else if(num == 2) {
			Game_01 gg = new Game_01();
			gg.make();
			gg.make02();
			gg.make1();
		}
	}
}
