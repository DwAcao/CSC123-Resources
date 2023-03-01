import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		//Create object of the class java.io.File and initialize it by passing a file name to constructor
		File f=new File("myfile.txt");
		
		//Check if the file exists
		System.out.println("Exists:"+f.exists());
		
		//Check if the file is writable
		System.out.println("Writable:"+f.canWrite());
		
		//Check if the file is executable 
		System.out.println("Executable:"+f.canExecute());
		
		//Check if the file is readable 
		System.out.println("Readable:"+f.canRead());

		//Check if the file is a directory/folder
		System.out.println("Directory:"+f.isDirectory());
		
		//Check if the file is a directory/folder
		System.out.println("Parent directory:"+f.getAbsolutePath());
		
		
	}

}
