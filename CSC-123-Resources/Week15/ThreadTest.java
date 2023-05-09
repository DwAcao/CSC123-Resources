
public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getPriority());
		
		for(int x=0; x<10;x++) {
			NumberCounter nc=new NumberCounter("Counter", 0, 20);
			nc.start();
			
			
			
			System.out.println("ACTIVE:"+Thread.activeCount());
			
		}
	}
}
