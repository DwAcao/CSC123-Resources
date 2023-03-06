import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerStringDemo {

	public static void main(String[] args) throws IOException {

		File sourceFile = new File("/Users/usman/tmp/test.txt");

			// File reader
			Scanner reader = new Scanner(sourceFile);

			while (reader.hasNext()) {
				String line=reader.nextLine();
				System.out.println(line);
				
			}

	}

}
