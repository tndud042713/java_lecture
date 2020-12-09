import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Label Example");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		
		Font dukeFont = new Font(null,0,32);
		label.setFont(dukeFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		c.add(label);
		frame.setLocation(1000, 200);// ȭ�� ��ġ
		frame.setPreferredSize(new Dimension(500, 200));// ������ ũ��
		frame.pack();// ������ ���� ���� �ϱ�
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;;i++){
			label.setText(i+" : �ȳ��ϼ���");
			}

	}
}
