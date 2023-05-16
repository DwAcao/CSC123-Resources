import java.io.ObjectInputFilter.Config;

public class TestTemplate {

	public static void main(String[] args) throws Exception {
		
		Configuration config=Configuration.getInstance();
		
		if(config.isCurrenciesSupported()) {
			CurrencyReader reader=CurrencyReader.getInstance(config.getCurrencySource());
			System.out.println(reader.readCurrencies());
		}
		else {
			System.out.println("Currencies not Supported");
		}
		
		
		//System.out.println(Configuration.getInstance().getCurrencySource());
		
		

	}

}
