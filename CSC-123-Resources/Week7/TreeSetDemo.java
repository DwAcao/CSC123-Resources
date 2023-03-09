import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		Set<String> fruit=new TreeSet<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Banana");
		fruit.add("Banana");
		
		
		System.out.println("\nExample with enhanced for loop\n");
		
		
		for (String s: fruit) {	
			System.out.println(s);
		}
		
		
		
		
		
		System.out.println("\nExample with Iterator\n");
		
		Iterator<String> i=fruit.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		fruit.contains("Apple");

	}

}
