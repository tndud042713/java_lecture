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
		mem1.setId("ȫ�浿");
		mem2.setId("ȫ�浿");
		if(mem1.equals(mem2)) {
//		if(mem1.getId().equals(mem2.getId())) {
			System.out.println("�������");
		}else {
			System.out.println("��������");
		}
		System.out.println("����� ���̵� : "+mem1.getId());
		System.out.println("����� ���̵� : "+mem1);
	}
}
