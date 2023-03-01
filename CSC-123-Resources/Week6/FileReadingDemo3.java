import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadingDemo3 {

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
			
			//Create an empty array where we can fit all bytes at once
			byte[] readBuffer=new byte[totalBytesAvailable];
		
			//Read the entire content of file into the buffer
			in.read(readBuffer);
			
			//First lets try to print these bytes one at a time and see what we get
			System.out.println("1 - Printing raw bytes:");
			for(byte b: readBuffer) {
				System.out.println(b);
			}
			
			//Now print the bytes again but also type cast them into char (remember the ASCII character set)
			System.out.println("\n2 - Printing raw bytes + coverting each byte to a char");
			for(byte b: readBuffer) {
				System.out.println(b+" : "+(char)b);
			}
			
			
			
			//Finally we can convert our array of bytes into String, there is a constructor available for that purpose on java.lang.String class
			
			String s=new String(readBuffer);
			
			System.out.println("\n3 - Printing entire string");
			
			System.out.println(s);
			
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
