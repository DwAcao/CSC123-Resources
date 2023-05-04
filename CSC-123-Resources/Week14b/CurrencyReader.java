import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class CurrencyReader {

	public static CurrencyReader getInstance(String type) throws Exception{
		if(type.equalsIgnoreCase("file")) {
			return new FileHook();
		}
		else if(type.equalsIgnoreCase("http")) {
			return new HTTPHook();
		}
		else {
			throw new Exception("Type "+type+ " not understood!");
		}
	}
		
	public ArrayList<String> readCurrencies() throws Exception{
		//get an input steam
		InputStream in=getInputStream();
		//Create stream readers / buffered reader
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		
		ArrayList<String> list=new ArrayList<String>();
		
		String line=null;
		//read lines 
		while((line=br.readLine())!=null) {
			//add lines to arraylist
			list.add(line);
		}
		
		//return array list 
		
		return list;
		
	}
	
	protected abstract InputStream getInputStream() throws Exception; 
	

}
