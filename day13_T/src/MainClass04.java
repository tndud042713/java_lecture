
public class MainClass04 {
	public static void main(String[] args) {
		Test04 t04 = new Test04(10, 2) {
			public void mul() { System.out.println(10*2); }
		};
		t04.display();
	}
}
