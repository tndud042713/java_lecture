package day09;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass02 {
	public static void main(String[] args) {

		System.out.println("������ �ζǹ�ȣ�� ");
		// �ζǹ�ȣ ��÷��

		while (true) {
			HashSet num = new HashSet();
			for (int i = 0; i < 6; i++) {

				int k = (int) (Math.random() * 45 + 1);
				num.add(k);
			}
			if (num.size() == 6) {
				System.out.println(num);
				break;
			} else {
				continue;
			}
		}

	}
}
