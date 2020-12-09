package day17;

class Aclass {
	public String getPwd() {
		return "A Å¬·¡½º";
	}
}

class PrintClass extends Aclass {
	public void print(Object ob) {
		Aclass a = (Aclass) ob;
		System.out.println(a.getPwd());
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		Aclass a = new Aclass();
		PrintClass pc = new PrintClass();
		pc.print(a);
	}
}
