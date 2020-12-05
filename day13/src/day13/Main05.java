package day13;

public class Main05 {
	public static void main(String[] args) {
//		Test05 t05 = new Test05(); //한명
		Test05 t05 = Test05.getInstance(); //위에 전역변수선언했으면 클래스 이름으로 선언 가능하
		t05.controlDB();
		for(int i=0;i<1000;i++) {
//			t05 = new Test05(); //5000명이 호출됨
			t05 = Test05.getInstance(); //1명이 호출됨 왜냐하면 객체가 null이 아니라 한번쓰면 사용되므로 1번이상 쓰지않음
		}
		System.out.println(t05.getCnt()+"명 연결되었습니다"); //객체 갯수가 증가할 수록 cnt의 갯수가 증가해서 출력된다.
	}

}
