import java.sql.Array;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParserForCars {

	long count;
	String message;
	
	ArrayList<CarManufacturer> results=new ArrayList<CarManufacturer>();
	
	public JSONParserForCars(String json) throws Exception {
		
		JSONParser parser=new JSONParser();
		Object o=parser.parse(json);
		JSONObject job=(JSONObject)o;
		
		count=(Long)job.get("Count");
		message= (String)job.get("Message");
				
		JSONArray arr=(JSONArray)job.get("Results");
		
		for(Object o1:arr) {
			
			JSONObject o2=(JSONObject)o1;
			CarManufacturer cm=new CarManufacturer((String)o2.get("Country"),(String) o2.get("Mfr_Name"), (String)o2.get("Mfr_CommonName"), (Long)o2.get("Mfr_ID"));
			
			JSONArray cats=(JSONArray)o2.get("VehicleTypes");

			for(Object o3:cats) {
				JSONObject o4=(JSONObject)o3;
				VehicleCategory vc=new VehicleCategory((Boolean)o4.get("IsPrimary"),(String)o4.get("Name"));
				cm.addCategory(vc);
				
			}	
			results.add(cm);
			
		}
		
	}
	
	public ArrayList<CarManufacturer> getManufacturers(){
		
		return results;
	}
	
	public CarManufacturer find(String s){
		
		
		for(CarManufacturer cm:results) {
			if(isFound(cm.getCommonName(),s)) {
				return cm;
				
			}
		}
		
		return null;
	}
	
	private boolean isFound(String s1, String s2) {
		
		if(s1==null||s2==null)return false;
		return s1.toLowerCase().indexOf(s2)!=-1;
	}

}
