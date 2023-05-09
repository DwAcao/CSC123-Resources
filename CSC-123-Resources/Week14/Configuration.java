
public class Configuration{
	
	private static Configuration self=new Configuration();
	
	private Configuration() {
		//Read file
		//Parse file
		//Store in key value pairs 
		
	}

	public static Configuration getInstance() {
		return self;
	}

	public boolean useCurrencies() {
		return false;
	}

}
