import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Banana");
		
		Iterator<String> i=fruit.iterator();
		
		for(int x=0;x<fruit.size();x++) {
			System.out.println(fruit.get(x));
		}
	
		
		

		
		
		
		
		
//		System.out.println("\nExample with enhanced for loop\n");
//		
//		for (String s: fruit) {
//			
//			System.out.println(s);
//		}
//		
//		System.out.println("\nExample with Iterator\n");
//		
//		Iterator<String> i=fruit.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		

	}

}
