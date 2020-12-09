package day17;

import java.util.ArrayList;
class Aclass{
	public String getPwd() { return "AÅ¬·¡½º"; }
}
class PrintClass{
	public void print(Object ob) {
		Aclass a =(Aclass)ob;
		System.out.println(a.getPwd());
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		Aclass aa = new Aclass();
		PrintClass pc = new PrintClass();
		pc.print(aa);

		
		Object a = new PrintClass();
		Object b = 1234;
		Object c = "aaaaa";
		ArrayList arr = new ArrayList();
		arr.add(111);
		int re = (int)arr.get(0) + 1234;
		System.out.println( "get : "+arr.get(0) );
		
	}
}
