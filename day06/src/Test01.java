
public class Test01 {
	public static void main(String[] args) {
		/*
		int[] a = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		System.out.println("a[0] : "+a[0]);
		System.out.println("a[1] : "+a[1]);
		System.out.println("a[2] : "+a[2]);
		*/
		String[] s = new String[5];
		s[0] = "11111";
		s[1] = "문자열저장";
		System.out.println("s[0] : "+s[0]);
		System.out.println("s[1] : "+s[1]);
		System.out.println("s[2] : "+s[2]);
		System.out.println("length : "+s.length);
		System.out.println("=====================");
		for(int i=0; i<s.length ; i++) {
			if(s[i] == null )
				break;
			System.out.println(s[i]);
		}
		System.out.println("=====================");
		int[] a = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}









