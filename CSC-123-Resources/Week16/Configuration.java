import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Configuration{
	
	private static Configuration self=new Configuration();
	private static final String CONFIG_FILE="/Users/usman/tmp/config.txt";
	private Map< String,String> config=new HashMap<String,String>();
 	
	
	private Configuration() {
		try {
			File f=new File(CONFIG_FILE);
			BufferedReader br=new BufferedReader(new FileReader(f));
			
			String line="";
			
			while((line=br.readLine())!=null){
				String[] tokens=line.split("=");
				config.put(tokens[0], tokens[1]);
			}
			
			System.out.println("Config loaded!");
			
		}
		catch(Exception ignore) {
		}
		
	}
	
	public boolean isCurrenciesSupported() {
		return config.get("support.currencies").equalsIgnoreCase("true");
		
	}
	
	public String getCurrencySource() {
		return config.get("currencies.source");
		
	}
	
	
	public static Configuration getInstance() {
		return self;
	}


}
