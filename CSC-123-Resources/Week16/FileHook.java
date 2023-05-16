import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

public class FileHook extends CurrencyReader{

	@Override
	protected InputStream getInputStream()throws Exception {
		return new FileInputStream(new File("/Users/usman/tmp/currencies.csv"));
	}


}
