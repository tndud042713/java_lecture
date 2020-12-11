package day18;
interface Attack01{
	public void attack();
}
interface Defense01 {
	public void defense() ;
}
class Unit01 implements Attack01,Defense01{
	public void defense() {
		System.out.println("방어 합니다");
	}
	public void attack() {
		System.out.println("공격 합니다");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		Unit01 u = new Unit01();
		u.attack(); u.defense();
	}
}






