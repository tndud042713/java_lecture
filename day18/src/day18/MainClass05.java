package day18;
//Á¦³×¸¯
import java.util.ArrayList;

class Print<T>{
	public void display(T n1, T n2) {
		System.out.println(n1 + "," + n2); 
	}
	//public void display(String n1, String n2) { System.out.println(n1+n2); }
	//public void display(double n1, double n2) { System.out.println(n1+n2); }
}

public class MainClass05 {
	public static void main(String[] args) {
		Print p = new Print();
		p.display(10, 20);
		p.display(10.11, 20.11);
		p.display("test", "aaa");
		Print<Integer> pp = new Print<Integer>();
		pp.display(10, 20);
		
		ArrayList<Integer> arr = null;
	}
}










