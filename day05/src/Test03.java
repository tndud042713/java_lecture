import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 10) {
		//for( ; i<=10 ; ) {
			sum += i;
			i++;
		}
		System.out.println("1~10 �� : "+sum);
		//�������� �ܼ��� �Է¹޾� �ش��ϴ� ���� ����Ͻÿ�
		Scanner input = new Scanner(System.in);
		int n,k=1;
		System.out.print("�� �Է� : ");
		n = input.nextInt();
		while(k<=9){
			System.out.println(n+" * "+k+" = " + n*k);
			k++;
		}

	}
}






