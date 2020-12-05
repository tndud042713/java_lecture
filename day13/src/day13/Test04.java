package day13;

public class Test04 {
	int num1,num2;
	Test04(int num1, int num2){
		this.num1 = num1; this . num2= num2;
	}
	public void sum() { System.out.println(num1+num2);}
	public void sub() { System.out.println(num1-num2);}
	public void mul() { System.out.println(num1*num2);}
	public void div() { System.out.println(num1/num2);}
	public void display() { sum(); sub(); mul(); div();}
}
