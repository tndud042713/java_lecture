
public class Test05 {
	private static Test05 dbCon;
	private static int cnt = 0;
	Test05() { cnt++; }
	public int getCnt() { return cnt; }
	public void controlDB() {System.out.println("db를 사용합니다");}
	public static Test05 getInstance() {
		//System.out.println("dbCon : "+dbCon);
		if(dbCon == null)
			dbCon = new Test05();
		return dbCon;
	}
}



