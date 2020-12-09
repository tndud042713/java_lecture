package test;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Time extends Thread {
	long time = System.currentTimeMillis();
	SimpleDateFormat s = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");

	public void Time1() {
		System.out.println(s.format(this.time));
	}

	public void run() {
		JFrame frame = new JFrame("Time");
		Container c = frame.getContentPane();
		JLabel label = new JLabel(s.format(this.time));
		c.add(label);

		Font font = new Font("����", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0;; i++) {
			try {
				Thread.sleep(1000);
				label.setText(s.format(this.time));
			} catch (Exception e) {

			}
		}

	}
}

class loginFunc {
	Scanner input = new Scanner(System.in);
	HashMap map = new HashMap();
	HashMap map2 = new HashMap();

	private void excute(String n) {
		System.out.println(n + ".exe����մϴ�.");
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		} catch (IOException e) {
		}
	}

	public void func() {
		System.out.println("1. ��� 2. off");
		System.out.print(">>>>");
		int num2 = input.nextInt();

		if (num2 == 1) {
			map2.put("����", "calc");
			map2.put("�޸���", "notepad");
			System.out.println("[��밡��] : ����\t�޸���");
			System.out.println("����� ��� �Է�");
			String want = input.next();
			excute(want);
		} else if (num2 == 1) {
			System.out.println("����");
		} else {
			System.out.println("�߸� �Է�");
		}

	}

	public void case1() {

		System.out.print("���̵� �Է� : ");
		String input_id = input.next();
		System.out.print("��й�ȣ �Է� : ");
		String input_pw = input.next();

		if (map.containsKey(input_id) && map.containsKey(input_pw)) {
			System.out.println("�������");
			System.out.println("=====ȯ���մϴ�=====");
			Time t = new Time();
			t.setDaemon(true);
			t.start();
			func();
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}

	public void case2() {
		System.out.print("������ ���̵� �Է� : ");
		String creat_id = input.next();
		System.out.print("������ ��й�ȣ �Է� : ");
		String creat_pw = input.next();

		if (map.containsKey(creat_id)) {
			System.out.println("�ߺ��� �����Դϴ�.");
		} else {
			map.put(creat_id, creat_pw);
		}
	}

	public void login(int num) {

		switch (num) {
		case 1:
			case1();
			break;

		case 2:

			case2();
			break;

		case 3:
			System.out.println("�ý��� ����");
			System.exit(0);

		}
	}
}

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		loginFunc log = new loginFunc();
		try {

			for (int i = 0; i < 10; i++) {
				Thread.sleep(10);
				Time t = new Time();
				t.Time1();
			}
		} catch (Exception e) {
		}

		while (true) {
			System.out.println("1. �α��� 2. ���� 3.�α׾ƿ�");
			System.out.print(">>>");
			int num = input.nextInt();
			log.login(num);
		}

	}
}