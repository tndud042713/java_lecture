
public class MainClass05 {
	public static void main(String[] args) {
		Member05 m05 = new Member05();
		//String s = m05.test(); //m05.big(30, 20);
		//System.out.println("°á°ú °ª : "+s);
		m05.reverse();
		System.out.println("========================");
		int su = m05.userInput02();
		int result = m05.reverse02(su);
		m05.resultPrint02(result);
	}
}

