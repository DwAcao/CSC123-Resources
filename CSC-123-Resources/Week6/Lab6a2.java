import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab6a2 {

	public static void main(String[] args) {

		int a;
		float b;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Enter an integer a: ");
				a = scanner.nextInt();
				System.out.print("Enter an float b: ");
				b = scanner.nextFloat();

				System.out.println("a / b = " + (a / b));
				break;

			}
			catch(InputMismatchException ime) {
				System.out.println("\nInvalid input, starting over again\n");
				scanner.next();
			}
			catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}

			finally {
			}
		}

	}


}
