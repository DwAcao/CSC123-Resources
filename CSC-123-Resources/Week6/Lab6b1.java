import java.io.File;
import java.io.IOException;

public class Lab6b1 {

	public static void main(String[] args) throws IOException{
		
		String filePath="/Users/usman/tmp";
		
		//Create file object
		File directory=new File(filePath);
		
		if(!directory.exists()||!directory.isDirectory()) {
			System.out.printf("Directory \"%s\" does not exist, or is not a directory!!",directory);
			System.exit(0);
		}
		
		
		int counter=0;
		File[] files=directory.listFiles();
		System.out.printf("Reading Directory: %s%n%n",directory);
		for(File f:files) {
			String type=f.isDirectory()?"Directory":"File";
			String readable=f.canRead()?"readable":"not-readable";
			String writable=f.canWrite()?"writable":"not-writable";
			String executable=f.canExecute()?"executable":"not-executable";
			
			System.out.printf("%s - %s (%s), %s, %s, %s %n", ++counter,f.getName(),type,readable,writable,executable);
			
		}
		
		System.out.printf("\n\nTotal Files: %s%n",files.length);


	}

}
