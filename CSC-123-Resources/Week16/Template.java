import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public abstract class Template {

	public static Template getInstance(String type) {
		
		switch(type) {
		case "type1":
			return new FileHook2();
		
		case "type2":
			return new FileHook3();
		default:
			throw new RuntimeException("Freaking out");
		
		}
		
	}
	
	public String readInfo() {
		try {
			//File f = new File("/Users/usman/tmp/config.txt");
			InputStream in = getInputStream();
			byte[] bytes = new byte[in.available()];

			if(getDataFormat().equalsIgnoreCase("csv")) {
				//process data in this way
			}
			else if(getDataFormat().equalsIgnoreCase("json")) {
				//Use JSON library to processs
			}
			else {
				//Freak out
			}
			in.read(bytes);
			return new String(bytes).toUpperCase();

		} catch (Exception ignore) {
		}
		return null;

	}
	protected abstract InputStream getInputStream();
	protected abstract String getDataFormat();
}
