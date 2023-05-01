import java.util.Scanner;

public class CarAppMain {

	
	
	public static void main(String[] args)throws Exception {
		
		String json=GenericAPIClient.callAPI("https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json");
		
		System.out.print("Enter vehicle model:");
		String model=new Scanner(System.in).nextLine();
		CarParser cp=new CarParser(json);
		
		System.out.println(cp.search(model));
		
		
		

	}
}
