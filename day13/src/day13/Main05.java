package day13;

public class Main05 {
	public static void main(String[] args) {
//		Test05 t05 = new Test05(); //�Ѹ�
		Test05 t05 = Test05.getInstance(); //���� ������������������ Ŭ���� �̸����� ���� ������
		t05.controlDB();
		for(int i=0;i<1000;i++) {
//			t05 = new Test05(); //5000���� ȣ���
			t05 = Test05.getInstance(); //1���� ȣ��� �ֳ��ϸ� ��ü�� null�� �ƴ϶� �ѹ����� ���ǹǷ� 1���̻� ��������
		}
		System.out.println(t05.getCnt()+"�� ����Ǿ����ϴ�"); //��ü ������ ������ ���� cnt�� ������ �����ؼ� ��µȴ�.
	}

}
