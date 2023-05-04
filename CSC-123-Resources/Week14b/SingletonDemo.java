
public class SingletonDemo {
	
	private static final String CONFIG_FILE="file.txt";
	private static  SingletonDemo self=null;
	
	private boolean useCurrencies;
	private String currencySource;
	private String webserviceURL;
	private String currencyFile;
	
	
	public static SingletonDemo getInstance() {
		 if(self==null) {
			 self=new SingletonDemo();
		 }
		 return self;
	}
	
	private SingletonDemo() {
		//Read file
		
		useCurrencies=true;
		currencySource="file";
		currencyFile="/tmp/file.txt";
		webserviceURL="http://webservice";
	}

	public static String getConfigFile() {
		return CONFIG_FILE;
	}

	public boolean isUseCurrencies() {
		return useCurrencies;
	}

	public String getCurrencySource() {
		return currencySource;
	}

	public String getWebserviceURL() {
		return webserviceURL;
	}

	public String getCurrencyFile() {
		return currencyFile;
	}

	@Override
	public String toString() {
		return "SingletonDemo [useCurrencies=" + useCurrencies + ", currencySource=" + currencySource
				+ ", webserviceURL=" + webserviceURL + ", currencyFile=" + currencyFile + "]";
	}

	
	
}
