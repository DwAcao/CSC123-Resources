import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {

	private static String ALPHA_KEY = "alpha";
	private static String NUMERIC_KEY = "numeric";
	private static String SPACE_KEY = "space";

	
	private static int BYTES_IN_KB = 1024;
	private static int BYTES_IN_MB = BYTES_IN_KB*BYTES_IN_KB;
	private static int BYTES_IN_GB = BYTES_IN_MB*BYTES_IN_KB;
	
	public static void main(String[] args) throws IOException {
		if (args.length != 0) {
			System.out.println("\nUSAGE: java FileAnalyzer <sourceFile>\n");
			System.exit(0);
		}

		File directory = new File("/Users/usman/tmp/dr");
		if (!directory.exists() || !directory.isDirectory())
			throw new IOException("Directory '%s' does not exist!%n".format(directory.getName()));

		File[] files = directory.listFiles();
		long totalSize = 0;
		long totalAlpha = 0;
		long totalNumbers = 0;
		long totalSpaces = 0;

		System.out.println("File Name\tSize\t\tAlpha\t\tNumeric\t\tSpace\n");

		for (File f : files) {
			if (f.isFile()) {
				InputStream in = new FileInputStream(f);
				int fileSize = in.available();
				Map<String, Integer> m = countCharacters(in);

				System.out.println(String.format("%s	%s bytes	 %s		  %s		  %s", f.getName(), fileSize,
						m.get(ALPHA_KEY), m.get(NUMERIC_KEY), m.get(SPACE_KEY)));

				totalSize += fileSize;
				totalAlpha += m.get(ALPHA_KEY);
				totalNumbers += m.get(NUMERIC_KEY);
				totalSpaces += m.get(SPACE_KEY);
			}
		}

		System.out.println("");

		System.out.println(String.format("Total Files		: %s", files.length));
		System.out.println(String.format("Total Alpha Chars	: %s", totalAlpha));
		System.out.println(String.format("Total Numeric		: %s", totalNumbers));
		System.out.println(String.format("Total Spaces		: %s", totalSpaces));

		System.out.println("");
		System.out.println(String.format("Total Size on Disk: %s", formatSize(totalSize)));

	}

	private static Map<String, Integer> countCharacters(InputStream in) throws IOException {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put(ALPHA_KEY, 0);
		m.put(NUMERIC_KEY, 0);
		m.put(SPACE_KEY, 0);

		byte b;

		while ((b = (byte) in.read()) != -1) {
			char c = (char) b;
			if (c == ' ')
				m.put(SPACE_KEY, m.get(SPACE_KEY) + 1);
			if (Character.isAlphabetic(c))
				m.put(ALPHA_KEY, m.get(ALPHA_KEY) + 1);
			if (Character.isDigit(c))
				m.put(NUMERIC_KEY, m.get(NUMERIC_KEY) + 1);
		}

		return m;

	}
	
	private static String formatSize(long bytes) {
		
		
		if(bytes/BYTES_IN_GB>=1) {
			return String.format("%.2f GB" ,(double)bytes/BYTES_IN_GB);
		}
		else if(bytes/BYTES_IN_MB>=1) {
			return String.format("%.2f MB" ,(double)bytes/BYTES_IN_MB);
		}
		else if(bytes/BYTES_IN_KB>=1) {
			return String.format("%.2f KB" ,(double)bytes/BYTES_IN_KB);
		}
		else{
			return String.format("%s bytes" ,bytes);
		}
		
	}


}
