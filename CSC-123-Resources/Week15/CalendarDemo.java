import java.util.Calendar;

public class CalendarDemo {
	static final String format="MM/dd/yy HH:mm";
	public static void main(String[] args) throws Exception{
		
		Calendar mycal=Calendar.getInstance();
		
		
		System.out.println(mycal.getTimeZone());

	}
}
