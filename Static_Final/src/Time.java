import java.text.SimpleDateFormat;

public class Time {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String s = simple.format(time);
		System.out.println(s);
	}
}
