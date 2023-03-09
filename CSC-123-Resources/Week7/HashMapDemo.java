import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, String> students = new HashMap<String, String>();

		students.put("Name", "Joe");
		students.put("Email", "Joe@email.com");
		students.put("Class", "CSC123");
		students.put("Email", "new email");
		students.put("Country", "USA");
		students.put("State", "California");



		// Printing one value at a time

	    System.out.println("Name: "+students.get("Name"));
		System.out.println("Email: "+students.get("Email"));

		
		//Printing all key/values
		Set<String> keys=students.keySet();
		
		for(String key:keys) {
			System.out.println(key+":"+students.get(key));
		}
		
		//Printing all values
		Collection<String> values=students.values();
	
		for(String v:students.values()) {
			System.out.println(v);
		}
		

	}

}
