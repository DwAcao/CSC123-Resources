import java.util.Date;

public class TimeTest {
	public static void main(String[] args) throws Exception{
		
		long time=System.currentTimeMillis();
		
		Date past=new Date();
		Thread.sleep(10000);
		Date now=new Date();
		
		System.out.println(now);
		System.out.println(past);
		
	}
}
