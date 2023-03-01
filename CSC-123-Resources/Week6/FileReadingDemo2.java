import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadingDemo2 {

	public static void main(String[] args) {
		File f=new File("/Users/usman/test.txt");
		if(!f.exists()) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
		if(!f.canRead()) {
			System.out.println("File not readable!");
			System.exit(0);
			
		}

		FileInputStream in=null;
		
		try {
			//Create a file input stream
			in=new FileInputStream(f);			
			byte b;
			
			//Use a for loop to read bytes one-by-one until the stream empties
			while((b=(byte)in.read())!=-1) {
				System.out.println(b+" : "+(char)b);
			}
		}
		catch(IOException e) {
			System.out.println("Error reading the file: "+e.getMessage());
		}
		
		finally {
			close(in);
		}
		
	}
	
	
	private static  void close(InputStream in) {
		try {
			if(in!=null)in.close();
		}
		catch(Exception ignored) {}
	}
}
