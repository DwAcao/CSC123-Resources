import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FileHook2 extends Template{

	@Override
	protected InputStream getInputStream() {
		
		String s="A quick brown fox jumps over the lazy dog!";
		
		return new ByteArrayInputStream(s.getBytes());
		

	}

	@Override
	protected String getDataFormat() {
		
		return "csv";
	}

}
