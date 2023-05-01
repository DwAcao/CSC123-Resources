
public class Currnecy1 {
	
	public static void main(String[] args)throws Exception {
		
		String out=CarAPI.runAPI("http://www.usman.cloud/banking/exchange-rate.csv");
		String[] rates=out.split("\n");
		
		for(String r:rates) {
			System.out.println(r.split(",")[0]);
		}
		
		
	}

}
