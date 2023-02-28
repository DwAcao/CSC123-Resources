import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionTest {

		
		public static void main(String[] args) {
			
			try {
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				n=n/0;
				System.out.println("Done!");
			}

			catch(NoSuchElementException |ArithmeticException e) {
				System.out.println("try again!");
			}
			
			finally {
				System.out.println("Run for your life!");
				
			}

		}

		
}
