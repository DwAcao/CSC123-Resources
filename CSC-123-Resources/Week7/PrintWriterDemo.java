import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {


		// Create a target file object to write to
		File targetFile = new File("/Users/usman/tmp/output_file.txt");

		// Declare variable of type PrintWriter, will be used to write to target file
		PrintWriter writer = null;
		try {
			// Prevent overwriting
			if (!targetFile.exists()) {
				targetFile.createNewFile();
			}
			else {
				System.out.println("File already exists");
				System.exit(0);
			}

			writer = new PrintWriter(targetFile);
			
			
			writer.println("A quick brown fox jumps over the lazy dog!");
			writer.println("A quick brown fox jumps over the lazy dog!");
			writer.println("A quick brown fox jumps over the lazy dog!");
			writer.println("A quick brown fox jumps over the lazy dog!");
			writer.println("A quick brown fox jumps over the lazy dog!");
			

		} catch (FileNotFoundException fne) {
			System.out.println(fne.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			if (writer != null)
				writer.close();
		}

	}
}
