package day13;

public class Test05 {
	private static Test05 dbCon;
	private static int cnt = 0;
	public Test05() { cnt++;}
	public int getCnt() {return cnt;}
	public void controlDB() {System.out.println("db를 사용합니다");}
	public static Test05 getInstance(){
		if(dbCon == null)
			dbCon = new Test05();
		return dbCon;
		} // 사용자가 객체를 호출할때
}
