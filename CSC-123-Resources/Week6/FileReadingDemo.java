import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadingDemo {

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
			//See how many bytes are there in our file
			int totalBytesAvailable=in.available();
			
			//Use a for loop to read bytes one-by-one
			for (int x=0;x<totalBytesAvailable;x++) {
				byte b=(byte)in.read();
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
