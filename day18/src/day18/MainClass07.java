package day18;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	private String name;
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}
public class MainClass07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> st = new ArrayList<StInfo>();
		String name = null;
		while(true) {
			System.out.println("1.�̸� ��� 2.��� �̸� Ȯ��");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("����� �̸� : ");
				name = input.next();
				StInfo s = new StInfo();
				s.setName(name);
				st.add(s);
			}else {
				for(int i=0;i< st.size();i++) {
					StInfo s = st.get(i);
					System.out.println(i+1+"�� �̸� : "+s.getName());
				}
			}
		}
	}
}





