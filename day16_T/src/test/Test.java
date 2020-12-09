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
	SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");

	public void Time1() {
		System.out.println(s.format(this.time));
	}

	public void run() {
		JFrame frame = new JFrame("Time");
		Container c = frame.getContentPane();
		JLabel label = new JLabel(s.format(this.time));
		c.add(label);

		Font font = new Font("굴림", Font.ITALIC, 32);
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
		System.out.println(n + ".exe사용합니다.");
		ProcessBuilder pro = new ProcessBuilder(n);
		try {
			pro.start();
		} catch (IOException e) {
		}
	}

	public void func() {
		System.out.println("1. 기능 2. off");
		System.out.print(">>>>");
		int num2 = input.nextInt();

		if (num2 == 1) {
			map2.put("계산기", "calc");
			map2.put("메모장", "notepad");
			System.out.println("[사용가능] : 계산기\t메모장");
			System.out.println("사용할 기능 입력");
			String want = input.next();
			excute(want);
		} else if (num2 == 1) {
			System.out.println("종료");
		} else {
			System.out.println("잘못 입력");
		}

	}

	public void case1() {

		System.out.print("아이디 입력 : ");
		String input_id = input.next();
		System.out.print("비밀번호 입력 : ");
		String input_pw = input.next();

		if (map.containsKey(input_id) && map.containsKey(input_pw)) {
			System.out.println("인증통과");
			System.out.println("=====환영합니다=====");
			Time t = new Time();
			t.setDaemon(true);
			t.start();
			func();
		} else {
			System.out.println("잘못된 정보입니다.");
		}
	}

	public void case2() {
		System.out.print("가입할 아이디 입력 : ");
		String creat_id = input.next();
		System.out.print("가입할 비밀번호 입력 : ");
		String creat_pw = input.next();

		if (map.containsKey(creat_id)) {
			System.out.println("중복된 계정입니다.");
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
			System.out.println("시스템 종료");
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
			System.out.println("1. 로그인 2. 가입 3.로그아웃");
			System.out.print(">>>");
			int num = input.nextInt();
			log.login(num);
		}

	}
}