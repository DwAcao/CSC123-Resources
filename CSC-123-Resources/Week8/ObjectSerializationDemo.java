import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializationDemo {

	public static void main(String[] args) throws IOException{

		ArrayList<Integer> myQueue = new ArrayList<Integer>();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		
		File outFile=new File("/Users/usman/tmp/object_store.dat");
		
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
