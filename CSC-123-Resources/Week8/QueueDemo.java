import java.util.ArrayList;

public class QueueDemo {
	static final int HEAD_OF_THE_QUEUE=0;
	public static void main(String[] args) {
		
		ArrayList<Integer> myQueue=new ArrayList<Integer>();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.remove(HEAD_OF_THE_QUEUE));
		}

	}

}
