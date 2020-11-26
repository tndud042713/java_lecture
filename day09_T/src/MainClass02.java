import java.util.HashSet;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		for(int i=0; i<5 ; i++) {
			//System.out.println( (int)(Math.random()*3) + 1 );
		}
		for(int i=0; i<6 ; i++) {
			System.out.println((int)(Math.random()*45) + 1);
		}
		
		
	 /*//내가 만든 로또 프로그램 : set안에 숫자들을 배열로 한번에 받지는 못해서 피드백 구해보려고 함
		System.out.println("오늘의 로또번호는 ");
		// 로또번호 추첨기
			for (int i = 0; i < 6; i++) {
				HashSet num = new HashSet();
				int k = (int) (Math.random() * 45 + 1);
				num.add(k);
			System.out.println(num);	
			}
		*/	
			
	}
}
