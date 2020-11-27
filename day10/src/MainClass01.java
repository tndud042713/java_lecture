
public class MainClass01
{
	public static void main(String[] args) {
		User1 u1 = new User1();
		System.out.println("mainClass01 ");
		u1.func();
		
		
		Variable01 v01 = new Variable01();
		int a = v01.func01();
		v01.func02(a);
		/*
		int i=0;
		while(i<1) {
			int result = 100;
			i++;
			System.out.println(result);
		}
		System.out.println(result);
		*/
	}
	
}
