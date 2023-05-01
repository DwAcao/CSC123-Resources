import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CarParser {
	
	long recordCount;
	ArrayList<CarMaker> makers=new ArrayList<CarMaker>();
	
	public CarParser(String json) throws Exception{
		JSONParser p=new JSONParser();
		JSONObject job=(JSONObject)p.parse(json);
		JSONArray arr=(JSONArray)job.get("Results");
		
		for(int x=0;x<arr.size();x++) {
			
			JSONObject o=(JSONObject)arr.get(x);
			
			CarMaker cm=new CarMaker((String)o.get("Mfr_CommonName"),(String)o.get("Country"),(String)o.get("Mfr_Name"),(Long)o.get("Mfr_ID"));
			makers.add(cm);
			
			JSONArray carTypes=(JSONArray)o.get("VehicleTypes");
			
			for(Object carType:carTypes) {
				JSONObject jo=(JSONObject)carType;
				VehicleType vt=new VehicleType((Boolean)jo.get("IsPrimary"), (String)jo.get("Name"));
				cm.addType(vt);
			}
		}
	}

	public ArrayList<CarMaker> getMakers() {
		return makers;
	}
	
	public CarMaker search(String carBrand) {
		for(CarMaker m: makers) {
			if(checkNull(m.getCommonName()).toLowerCase().contains(checkNull(carBrand).toLowerCase())) {
				return m;
			}
		}
		return null;
	}
	
	private String checkNull(String s) {
		return s==null?"":s;
	}
	

}
