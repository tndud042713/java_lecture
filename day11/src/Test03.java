import java.util.Scanner;
class Test003{
	private int kor,eng,math;
	public void setKor(int kor) { this.kor = kor;  }
	public void setEng(int eng) { this.eng = eng; }
	public void setMath(int math) { this.math = math; }
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
}
public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//main에서 입력 받은 국,영,수를 Test003의 kor,eng,math에 저장
		Test003 t03 = new Test003();
		System.out.print("kor 입력 : "); 	int kor = input.nextInt();
		t03.setKor(kor);
		System.out.print("eng 입력 : ");	int eng = input.nextInt();
		t03.setEng(eng);
		System.out.print("math 입력 : "); 	int math = input.nextInt();
		t03.setMath(math);
		//각각의 변수 값을 불러와 main에서 sum변수에 합을 구하고 출력 하시오 
		int sum=0;
		sum = t03.getKor() + t03.getEng() + t03.getMath();
		System.out.println("3과목의 합 : "+sum);
	}
}






