package day13;

public class Test05 {
	private static Test05 dbCon;
	private static int cnt = 0;
	public Test05() { cnt++;}
	public int getCnt() {return cnt;}
	public void controlDB() {System.out.println("db�� ����մϴ�");}
	public static Test05 getInstance(){
		if(dbCon == null)
			dbCon = new Test05();
		return dbCon;
		} // ����ڰ� ��ü�� ȣ���Ҷ�
}
