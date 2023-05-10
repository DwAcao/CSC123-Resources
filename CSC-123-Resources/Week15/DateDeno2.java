
public class DateDeno2 {

	public static void main(String[] args) throws Exception{
		
		long timeNow=System.currentTimeMillis();
		Thread.sleep(100);
		long timeAfter=System.currentTimeMillis();
		
		System.out.println(timeAfter-timeNow);

	}

}
