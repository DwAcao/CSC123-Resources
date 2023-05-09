
public class NumberCounter extends Thread{

	String name;
	int start;
	int end;
	public NumberCounter(String name, int start, int end) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
	}
	

	public void run() {
		for(int x=start;x<end;x++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception ignored) {}
			System.out.println(Thread.currentThread().getName()+" : "+x);
		}
	}


}
