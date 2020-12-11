package day19;
class Member{
	private String id;
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		mem1.setId("홍길동");
		mem2.setId("홍길동");
		if(mem1.equals(mem2)) {
//		if(mem1.getId().equals(mem2.getId())) {
			System.out.println("인증통과");
		}else {
			System.out.println("인증실패");
		}
		System.out.println("당신의 아이디 : "+mem1.getId());
		System.out.println("당신의 아이디 : "+mem1);
	}
}
