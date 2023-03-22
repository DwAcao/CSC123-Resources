import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String input="lineNumber=32";
		Scanner s=new Scanner(input);
		s.useDelimiter("=");
		System.out.println(s.delimiter());
		

	}

}
