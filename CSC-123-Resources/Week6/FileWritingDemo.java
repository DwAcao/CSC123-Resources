import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileWritingDemo {

	public static void main(String[] args) {
	
		File f=new File("/Users/usman/my_out.txt");
		
		String text="This is the text I want to write to my file\n";
		
		//Output stream is used to writes data to destination
		FileOutputStream out=null;
		
		try {
			
			//Safety first, do not accidentally overwrite important files
			if(!f.exists()) {
				f.createNewFile();
			}
			else {
				System.out.println("File exists, maybe I should not overwrite it!");
				System.exit(0);
			}
			
			
			//Check permission to write the file
			if(!f.canWrite()) {
				System.out.println("File not writable!");
				System.exit(0);
				
			}
			
			out=new FileOutputStream(f);
			
			//Create a byte array from our data
			
			byte[] bytes=text.getBytes();
			
			for(byte b: bytes) {
				out.write(b);
			}
			
			//once done writing "flush" the stream to ensure no data is left in buffers
			out.flush();
			
		}
		catch(IOException e) {
			System.out.println("Error writing the file: "+e.getMessage());
		}
		
		finally {
			close(out);
		}
		
	}
	
	
	private static  void close(OutputStream out) {
		try {
			if(out!=null)out.close();
		}
		catch(Exception ignored) {}
	}
}
