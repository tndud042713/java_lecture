import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		String dateFormat = simple.format(date);
		System.out.println(dateFormat);
		
		long time = System.currentTimeMillis();
		System.out.println("time : "+simple.format(time));
	}
}
