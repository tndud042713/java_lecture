
class MySystem {
	static public MyOut out = new MyOut(); // Ŭ���� ������ Ŭ����
	static class MyOut {
		public void myPrint(int su) {
			System.out.print(su + "��� �˴ϴ�.");
		}
	}
}

public class Static_Ex2 {
	public static void main(String[] args) {
		MySystem.out.myPrint(123);
	}
}
