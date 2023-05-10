import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
	static final String format="MM/dd/yy";
	public static void main(String[] args) throws Exception{
		
		String inputDate="05/31/1923";
		
		SimpleDateFormat df=new SimpleDateFormat(format);
		df.setLenient(false);
		Date dt=df.parse(inputDate);
		
		System.out.println(dt);

	}

}
