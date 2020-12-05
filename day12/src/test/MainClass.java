package test;
import abc.*;
public class MainClass {
	public static void main(String[] args) {
		Test01 t01 = new Test01();
		t01.test01();
		AbcTest01 a01 = new AbcTest01();
		a01.abctest01();
		AbcTest02 a02 = new AbcTest02();
		a02.abctest02();
	}
}
