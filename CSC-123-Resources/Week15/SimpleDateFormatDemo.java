import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	static final String format="MMMM -   dd -  yyyy HH:mm";
	public static void main(String[] args) throws Exception{
		
		Date rightNow=new Date();
		
		SimpleDateFormat df=new SimpleDateFormat(format);
		
		System.out.println(df.format(rightNow));
		
		

	}

}
