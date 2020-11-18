public class Test01 {
public static void main(String[] args) {
	int age = 23;
	double weight = 50.0;
	System.out.println("나의 나이는 "+age+"입니다");
	System.out.println("나의 몸무게는 "+weight+"입니다");
	age = age + 100;
	System.out.println("변경 후 age : "+age);
	char ch = 'D';
	System.out.println("ch : "+ch);
	ch = 'G';
	System.out.println("변경 후 ch : "+ch);
	System.out.println("ch + 1 => "+ (ch+1));
	
	char ch01 = 'A';
	System.out.println("ch01 : "+ch01);
	System.out.println("(int)ch01 : "+(int)ch01);
	int num = 98;
	System.out.println("num : "+num);
	System.out.println("(char)num : "+(char)num);
	byte b = 97; // 1byte
	short s = -20; // 2byte
	char c = 'A'; // 2byte
	float f; // 4byte
	s = b;
	c = b;
	s = c;
	c = s;
	f = 5.11; 
	f = 5.11f; 

}
}















