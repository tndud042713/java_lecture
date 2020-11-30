class Test002{
	private int num;
	public void func() { System.out.println("num : "+num); }
	public void setNum( int n ) {
		//this.num = n;
		num = n;
	}
	public int getNum() { return num; }
}
public class Test02 {
	public static void main(String[] args) {
		Test002 t02 = new Test002();
		//t02.num=12345;
		t02.setNum(10);
		t02.func();
		// 저장되어 있는 num 필요해요.
		// num이 저장하고 있는 값만큼 연산을 원해요
		int sum = 0;
		int num = t02.getNum(); //t02.num;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}
}






