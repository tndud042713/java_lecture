class Test002{
	public void test() {
		int sum = 0;
		sum = test2();
		System.out.println("1~5 гу : "+sum);
	}
	public int test2() {
		int sum = 0;
		for(int i=1;i<6;i++)
			sum+=i;
		return sum;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Test002 t = new Test002();
		t.test();
	}
}
