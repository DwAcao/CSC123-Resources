import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class CSVReader {
	
	public static final String FILE_SOURCE="file";
	public static final String HTTP_SOURCE="http";

	public static CSVReader newCSVReader(String type) throws Exception {
		if(type.equalsIgnoreCase("file")) {
			return new InputSourceFile();
		}
		else if(type.equalsIgnoreCase("http")) {
			return new HTTPSource();
		}
		else {
			throw new Exception("Type "+type+" unknown!");
		}
	}
	
	public ArrayList<String> readData() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(getInputStream()));
		String line=null;
		ArrayList<String> list=new ArrayList<String>();
		while((line=br.readLine())!=null) {
			list.add(line);
		}
		
		return list;
	}
	
	protected abstract InputStream getInputStream()throws Exception;

}
