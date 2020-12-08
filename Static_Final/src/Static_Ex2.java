
class MySystem {
	static public MyOut out = new MyOut(); // 클래스 내부의 클래스
	static class MyOut {
		public void myPrint(int su) {
			System.out.print(su + "출력 됩니다.");
		}
	}
}

public class Static_Ex2 {
	public static void main(String[] args) {
		MySystem.out.myPrint(123);
	}
}
