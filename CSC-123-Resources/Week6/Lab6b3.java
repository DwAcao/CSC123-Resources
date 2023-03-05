import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lab6b3 {

	public static void main(String[] args) throws IOException, TooManyNumbersException {
		String filePath = "/Users/usman/tmp/test.txt";

		// Create file object
		File f = new File(filePath);

		if (!f.exists()) {
			System.out.println("Find not found!");
			System.exit(0);
		}

		InputStream in = new FileInputStream(f);

		try {
			byte b;
			int digitCounter = 0;
			while ((b = (byte) in.read()) != -1) {

				if (Character.isDigit((char) b))
					digitCounter++;
				if (digitCounter > 10)
					throw new TooManyNumbersException("Number of numerical characters exceeded limit!");
			}
		} finally {
			in.close();
		}

	}

}
