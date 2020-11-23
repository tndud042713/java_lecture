package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	/*ArrayList arr = new ArrayList();
	arr.add("12345");
	arr.add("안녕하세요");
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
	System.out.println("공간 생성 수 입력 : ");
	num = input.nextInt();
	int i=0;
	while(i<num) {
		System.out.println(i+1+".저장 값 입력 : ");
		String n = input.next();
		list.add(n);
		i++;
		}
	System.out.println("==== 출력 ====");
	for(int j=0;j<list.size();j++) {
		System.out.println(list.get(j));
	}
	*/
	Scanner input = new Scanner(System.in);
	ArrayList list = new ArrayList();
	list.add("홍길동"); list.add("김개똥");
	list.add("김말이"); list.add("고길동");
	System.out.println(list);
	System.out.println("========================");
	int num;
	String value;
	System.out.println("변경하고자 하는 위치 : ");
	num = input.nextInt();
	System.out.println("변경할 내용 입력 : ");
	value = input.next();
	list.set(num,value);
	System.out.println("==== 결과출력 ====");
	System.out.println(list);
	System.out.println("찾을 값 입력 : ");
	value = input.next();
	System.out.println(list.indexOf(value));
	
	
}
}
