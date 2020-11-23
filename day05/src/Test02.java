import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		/*
		for(초기값 ; 조건식 ; 증감식) {
			종속문장
		}
		*/
		Scanner input = new Scanner(System.in);
		int repet;
		/*
		System.out.print("수 입력 : ");
		repet = input.nextInt();
		
		for(int i=0 ; i < repet ; i++) {
			System.out.println(i+1 +"번 반복");
		}*/
		/*
		int su, sum = 0;
			// 1 ~ 10   = 1,3,5,7,9, 11
		for(su = 1; su <= 10; su=su+2) {//su+=2
			sum+=su;// sum = sum+su
		}
		System.out.println("sum : "+sum);
		System.out.println("su : "+su);
		*/
		/*
		int su=1, evenSum = 0, oddSum = 0;
		for( ; su<=10 ; su++) {
			if(su % 2 == 0) {
				evenSum += su;
			}else {
				oddSum += su;
			}
		}
		System.out.println("1 ~ 10 짝수 합 : "+evenSum);
		System.out.println("1 ~ 10 홀수 합 : "+oddSum);
		*/
		/*
		int su=1, sum=0;
		for( ; su<=10 ; ) {
			sum+=su;
			su++;
		}
		System.out.println("1~10까지 합 : "+sum);
		*/
		/*
		for( ; ; ) {
			System.out.println("출력");
		}
		*/
		/*
		 	1. hello
			2. hello
			3. hello
			4. hello
		 */
		/*
		for(int i = 1; i < 5;i++) {
			System.out.println(i+". hello");
		}*/
		/*
		 1~ 100 까지의 합 중에서 그 합이 528일때 i의 값을 출력 하시오
	 	for(int i=1;i<=100;i++)
		 */
		/*
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
			if(sum == 528) {
				System.out.println(i);
			}
		}
		*/
		/*
		1	2	3	4	5	
		6	7	8	9	10	
		11	12	13	14	15	
		16	17	18	19	20	
		21	22	23	24	25
		 */
		/*
		for(int i=1 ; i<=25 ; i++) {
			System.out.print(i+"\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("=======================");
		for(int i=1 ; i<=25 ; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}else {
				System.out.print(i+"\t");
			}
		}
		*/
		/*
		int su1, su2;
		for(su1 = 1 ; su1 <= 3 ; su1++) {
			System.out.println("++++ 상위포문 시작 ++++");
			for(su2 = 1 ; su2 <= 5 ; su2++) {
				System.out.println("su1 : "+su1+", su2 : "+su2);
			}
			System.out.println("---- 상위포문 종료 ----");
		}
		*/
		/*
		 구구단 만들기
		 */
		int su1, su2;
		for(su1 = 2 ; su1 <= 9 ; su1++) {
			for(su2 = 1 ; su2 <= 9 ; su2++) {
				System.out.println(su1+"*"+su2+"="+su1*su2);
			}
		}
		int num=1;
		int su = 1;
		for(int i=1; i<=5; i++) {
			num = i * 5;
			for(int k = su; k <= num; k++) {
				System.out.print(k+",");
			}
			System.out.println();
			su = num+1;
		}
		/*
		 2중 for문을 이용하여 아래와 같이 출력 하시오.
		 (if문은 사용하지 마세요)
			1	2	3	4	5	
			6	7	8	9	10	
			11	12	13	14	15	
			16	17	18	19	20	
			21	22	23	24	25
		 */
		System.out.println("=================");
		int i, j=1;
		for(i=1; i<=20; ){
			i = j; 
			for( ; j <= i+4; j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}
}















