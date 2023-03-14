import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializationCustomDemo {

	public static void main(String[] args) throws IOException{

		ArrayList<Customer> myQueue = new ArrayList<Customer>();
		
		myQueue.add(new Customer("Name1","LName1","SSN1"));
		myQueue.add(new Customer("Name2","LName2","SSN2"));
		myQueue.add(new Customer("Name3","LName3","SSN3"));
		myQueue.add(new Customer("Name4","LName4","SSN4"));

		
		File outFile=new File("/Users/usman/tmp/os/object_store2.dat");
		
		if(outFile.exists()) {
			System.out.println("File already exists!");
			System.exit(0);
		}

		outFile.createNewFile();
		
		FileOutputStream fout=new FileOutputStream(outFile);
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		
		oout.writeObject(myQueue);
		
		oout.flush();
		oout.close();
		
		
		
	}
}
