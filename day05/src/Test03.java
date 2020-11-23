import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 10) {
		//for( ; i<=10 ; ) {
			sum += i;
			i++;
		}
		System.out.println("1~10 합 : "+sum);
		//구구단의 단수를 입력받아 해당하는 단을 출력하시오
		Scanner input = new Scanner(System.in);
		int n,k=1;
		System.out.print("수 입력 : ");
		n = input.nextInt();
		while(k<=9){
			System.out.println(n+" * "+k+" = " + n*k);
			k++;
		}

	}
}






