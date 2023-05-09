import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class InputSourceFile extends CSVReader {

	public InputSourceFile() {
		super();
	}

	@Override
	protected InputStream getInputStream() throws Exception{
		return new FileInputStream(new File("/Users/usman/tmp/test.csv"));
		
	}

}
