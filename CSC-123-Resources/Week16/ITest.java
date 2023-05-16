import java.util.ArrayList;

public class ITest {

	public static void main(String[] args)throws Exception {
		
		
		
		if(Configuration.getInstance().isCurrenciesSupported()) {
			
			CurrencyReader reader=CurrencyReader.getInstance(Configuration.getInstance().getCurrencySource());		
			ArrayList<String> currencies=reader.readCurrencies();
			System.out.println(currencies);
			
		}
		else {
			System.out.println("Currencies not supported!!!");
		}
		
		

	}

}
