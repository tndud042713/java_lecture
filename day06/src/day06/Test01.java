package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	/*ArrayList arr = new ArrayList();
	arr.add("12345");
	arr.add("�ȳ��ϼ���");
	System.out.println("arr.get(0) : "+arr.get(0));
	System.out.println("arr.get(1) : "+arr.get(1));
	System.out.println("size : "+arr.size());
	System.out.println("contains : "+arr.contains("12345"));
	System.out.println("contains : "+arr.contains("aaaa"));
	System.out.println("remove : "+arr.remove("12345"));
	System.out.println("get(0) : "+arr.get(0));
	System.out.println("size : "+arr.size());
	arr.clear();
	System.out.println("size : "+arr.size());	
	 */
	/*
	Scanner input = new Scanner(System.in);
	ArrayList list = new ArrayList();
	int num;
	System.out.println("���� ���� �� �Է� : ");
	num = input.nextInt();
	int i=0;
	while(i<num) {
		System.out.println(i+1+".���� �� �Է� : ");
		String n = input.next();
		list.add(n);
		i++;
		}
	System.out.println("==== ��� ====");
	for(int j=0;j<list.size();j++) {
		System.out.println(list.get(j));
	}
	*/
	Scanner input = new Scanner(System.in);
	ArrayList list = new ArrayList();
	list.add("ȫ�浿"); list.add("�谳��");
	list.add("�踻��"); list.add("��浿");
	System.out.println(list);
	System.out.println("========================");
	int num;
	String value;
	System.out.println("�����ϰ��� �ϴ� ��ġ : ");
	num = input.nextInt();
	System.out.println("������ ���� �Է� : ");
	value = input.next();
	list.set(num,value);
	System.out.println("==== ������ ====");
	System.out.println(list);
	System.out.println("ã�� �� �Է� : ");
	value = input.next();
	System.out.println(list.indexOf(value));
	
	
}
}
