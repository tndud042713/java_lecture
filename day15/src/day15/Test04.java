package day15;

public class Test04 {
	public static void main(String[] args) {
		int num=100;
		String str = null;
		
//		str = num ; //str에 num을 넣으려고 함 (이건 에러가 발생함)
		str = num +"100"; //str에 num을 넣으려고 함 (이건 에러가 발생하지 않음)

//		num = (int)str; //캐스팅 형변환이 안됨
		num = Integer.parseInt(str) ; //이런식으로는 형변환이 가능함
		System.out.println(num + 20000);
//		System.out.println("문자열"+(100+200));
		String st = "abcd test";
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i)+",");
		}
	}
}
