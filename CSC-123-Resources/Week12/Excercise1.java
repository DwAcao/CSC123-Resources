import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Excercise1 {
	
	public static void main (String args[]) {
		
		
		//List of Students 
		Map<String,Map> students=new TreeMap<String,Map>();
		
		//Student Joe
		Map joe=new TreeMap<String, Object>();
		
		joe.put("Name", "joe");
		joe.put("Email", "joe@email.com");
		
		Set joesHobbies=new TreeSet<String>();
		joesHobbies.add("Swimming");
		joesHobbies.add("Hiking");		
		joesHobbies.add("Reading");
		
		joe.put("Hobbies", joesHobbies);
		
		students.put("10",joe);
		
		
		
		//Student Jane
		Map jane=new TreeMap<String, Object>();
		Set janesHobbies=new TreeSet<String>();
		janesHobbies.add("Horse Riding");
		janesHobbies.add("Shooting");
		
		
		
		jane.put("Name", "Jane");
		jane.put("Email", "jane@email.com");
		jane.put("Hobbies",janesHobbies);
		
		students.put("11",jane);
		
		System.out.println(students);
		
	}

}
