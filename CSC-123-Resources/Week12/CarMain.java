import java.util.Scanner;

public class CarMain {


	
	public static void main(String[] args) throws Exception{
//		String json="{\n"
//				+ "  \"Count\": 89,\n"
//				+ "  \"Message\": \"Response returned successfully\",\n"
//				+ "  \"SearchCriteria\": null,\n"
//				+ "  \"Results\": [\n"
//				+ "    {\n"
//				+ "      \"Country\": \"UNITED STATES (USA)\",\n"
//				+ "      \"Mfr_CommonName\": \"Tesla\",\n"
//				+ "      \"Mfr_ID\": 955,\n"
//				+ "      \"Mfr_Name\": \"TESLA, INC.\",\n"
//				+ "      \"VehicleTypes\": [\n"
//				+ "        {\n"
//				+ "          \"IsPrimary\": true,\n"
//				+ "          \"Name\": \"Passenger Car\"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "          \"IsPrimary\": false,\n"
//				+ "          \"Name\": \"Truck \"\n"
//				+ "        },\n"
//				+ "        {\n"
//				+ "          \"IsPrimary\": false,\n"
//				+ "          \"Name\": \"Multipurpose Passenger Vehicle (MPV)\"\n"
//				+ "        }\n"
//				+ "      ]\n"
//				+ "    }"
//				+ "]}";
		
		
		System.out.println("Enter vehicle make to search:");
		Scanner keyboard=new Scanner(System.in);
		String carMake=keyboard.nextLine();
		
		String carM=CarAPI.runAPI("https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json");	
		JSONParserForCars jp=new JSONParserForCars(carM);
		
		
		
		
		System.out.println(jp.find(carMake));
		
		

	}
}
