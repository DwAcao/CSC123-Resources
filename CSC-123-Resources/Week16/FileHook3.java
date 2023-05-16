import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileHook3 extends Template{

	@Override
	protected InputStream getInputStream() {
		File f = new File("/Users/usman/tmp/config.txt");
		InputStream in=null;;
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return in;
	}

	@Override
	protected String getDataFormat() {
		
		return "json";
	}

}
