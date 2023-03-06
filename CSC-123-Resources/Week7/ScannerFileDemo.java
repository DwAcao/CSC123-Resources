import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileDemo {

	public static void main(String[] args) throws IOException {

		String input="If I buy 2 cans of soda for 4 dollars, what is the price for one soda can? ";

			// File reader
			Scanner reader = new Scanner(input);

			//Print all tokens at once
			while (reader.hasNext()) {
				String token=reader.next();
				System.out.println(token);
			}
			
			System.out.println("-------------\n");
			
			reader=new Scanner(input);
			//print only numbers
			while (reader.hasNext()) {
				if(reader.hasNextInt()) {
					System.out.println(reader.nextInt());
				}
				else {
					reader.next();
				}
				
			}

	}

}
