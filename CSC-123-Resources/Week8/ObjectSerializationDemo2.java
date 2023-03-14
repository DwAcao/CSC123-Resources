import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializationDemo2 {

	static final int HEAD_OF_THE_QUEUE = 0;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Integer> myQueue;

		File inFile = new File("/Users/usman/tmp/os/object_store.dat");

		if (!inFile.exists()) {
			System.out.println("File does not exist");
			System.exit(0);
		}

		FileInputStream fin = new FileInputStream(inFile);

		ObjectInputStream oin = new ObjectInputStream(fin);

		Object o = oin.readObject();

		myQueue = (ArrayList<Integer>) o;

		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.remove(HEAD_OF_THE_QUEUE));
		}

	}
}
