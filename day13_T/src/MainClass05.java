
public class MainClass05 {
	public static void main(String[] args) {
		//Test05 t05 = new Test05();
		Test05 t05 = Test05.getInstance();
		t05.controlDB();
		for(int i=0;i<1000;i++) {
			//t05 = new Test05();
			t05 = Test05.getInstance();
			//System.out.println(i+"."+t05);
		}
		System.out.println(t05.getCnt()+"명 연결 되었습니다.");
		//test();
	}
}
