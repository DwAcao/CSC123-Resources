
public class CurrencyTest {

	public static void main(String[] args)throws Exception {
		CurrencyReader r=new HTTPHook();
		
		
		for(String line:r.readCurrencies()) {
			System.out.println(line);
		}
	}

}
