
public class Sleep {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}			
		}
		System.out.println("е╦юс ╬ф©Т");
	}
}
