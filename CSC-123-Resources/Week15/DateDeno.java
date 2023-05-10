import java.util.Date;

public class DateDeno {

	public static void main(String[] args) throws Exception{
		
		Date dateNow=new Date();
		long nextDate=System.currentTimeMillis()+2592000000L;
		Date newDate=new Date(nextDate);
		//To get number of milliseconds
		System.out.println(newDate.getTime());
		
		//To get number of milliseconds
		System.out.println(newDate.after(dateNow));
		//To get number of milliseconds
		System.out.println(newDate.before(dateNow));
		
		
		System.out.println(dateNow);
		System.out.println(newDate);

	}

}
