package day15;

public class Test04 {
	public static void main(String[] args) {
		int num=100;
		String str = null;
		
//		str = num ; //str�� num�� �������� �� (�̰� ������ �߻���)
		str = num +"100"; //str�� num�� �������� �� (�̰� ������ �߻����� ����)

//		num = (int)str; //ĳ���� ����ȯ�� �ȵ�
		num = Integer.parseInt(str) ; //�̷������δ� ����ȯ�� ������
		System.out.println(num + 20000);
//		System.out.println("���ڿ�"+(100+200));
		String st = "abcd test";
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i)+",");
		}
	}
}
