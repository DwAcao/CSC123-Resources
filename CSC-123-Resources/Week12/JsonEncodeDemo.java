import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args) {
 
	   //JSON Array type (e.g. a Map) 
	  JSONArray array = new JSONArray();

	  array.add("Array Item 1");
	  array.add("Array Item 2");
	  array.add("Array Item 3");
	  array.add("Array Item 4");
 
      System.out.print(array);
	
	  System.out.println("\n"); 
	   
	   //JSON Object type (e.g. a Map) 
	  JSONObject obj = new JSONObject();

      obj.put("Student ID", 123);
      obj.put("Name", "Joe Blogs");
      obj.put("Email", "joe@email.com");
 
      System.out.print(obj);
   }
}