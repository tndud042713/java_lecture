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
		//main���� �Է� ���� ��,��,���� Test003�� kor,eng,math�� ����
		Test003 t03 = new Test003();
		System.out.print("kor �Է� : "); 	int kor = input.nextInt();
		t03.setKor(kor);
		System.out.print("eng �Է� : ");	int eng = input.nextInt();
		t03.setEng(eng);
		System.out.print("math �Է� : "); 	int math = input.nextInt();
		t03.setMath(math);
		//������ ���� ���� �ҷ��� main���� sum������ ���� ���ϰ� ��� �Ͻÿ� 
		int sum=0;
		sum = t03.getKor() + t03.getEng() + t03.getMath();
		System.out.println("3������ �� : "+sum);
	}
}






