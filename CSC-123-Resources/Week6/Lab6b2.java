import java.io.File;
import java.io.IOException;

public class Lab6b2 {

	public static void main(String[] args) throws IOException{
		String filePath="lab6b/challenge1/subfolder/test.txt";
		
		//Create file object
		File f=new File(filePath);
		
		//Get parent object (i.e. the path without the file name	
		File parent=f.getParentFile();
		
		//Check if the path exists, if not then create the path (i.e. all directories
		if(!parent.exists())parent.mkdirs();
		
		//Now that the directories have been created create the file
		f.createNewFile();
		
		//
		f.setReadable(true);
		f.setWritable(false);
		f.setExecutable(false);
		
		System.out.println(f);

	}

}
