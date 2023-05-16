import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest2 {
	private static final String PATTERN="MMM-dd-yyyy";
	public static void main(String[] args) throws Exception{
		SimpleDateFormat df = new SimpleDateFormat(PATTERN);
		
		Date dt=df.parse("JAN-10-1975");
		System.out.println(dt);
		
		

	}

}
