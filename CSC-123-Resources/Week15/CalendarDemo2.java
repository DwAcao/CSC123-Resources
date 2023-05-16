import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		
		Calendar myCalendar=Calendar.getInstance();
		System.out.println(myCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(myCalendar.get(Calendar.MINUTE));
		System.out.println(myCalendar.get(Calendar.SECOND));
	}
}
