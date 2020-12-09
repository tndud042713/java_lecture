package day16;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Label Example");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		Font font = new Font(null,0,32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack(); // 적용하기
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; ;i++) {
			label.setText(i+" : 안녕하세요");
		}
	}
}










