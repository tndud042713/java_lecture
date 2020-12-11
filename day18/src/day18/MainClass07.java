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
			System.out.println("1.이름 등록 2.모든 이름 확인");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("당신의 이름 : ");
				name = input.next();
				StInfo s = new StInfo();
				s.setName(name);
				st.add(s);
			}else {
				for(int i=0;i< st.size();i++) {
					StInfo s = st.get(i);
					System.out.println(i+1+"번 이름 : "+s.getName());
				}
			}
		}
	}
}





