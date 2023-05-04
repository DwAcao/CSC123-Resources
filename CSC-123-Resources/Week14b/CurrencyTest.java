
public class CurrencyTest {

	public static void main(String[] args)throws Exception {
		CurrencyReader r=CurrencyReader.getInstance("");
		
		System.out.println(r.getClass().getName());
		
		for(String line:r.readCurrencies()) {
			System.out.println(line);
		}
	}

}
