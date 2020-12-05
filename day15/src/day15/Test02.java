package day15;
class Test{
	public void test() throws InterruptedException {
		Thread.sleep(1000);
	}
}
public class Test02 { // 예외전가
	public static void main(String[] args) throws InterruptedException {
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		Test t = new Test();
		t.test();
		
	}
}
