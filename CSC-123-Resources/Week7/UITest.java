import java.io.IOException;

public class UITest {

	public static final String[] menuOptions = { "Open Checking Account%n","Open Saving Account%n","Open Credit Card Account%n", "List Accounts%n","View Statement%n", "Deposit Funds%n", "Withdraw Funds%n",
			"Close an Account%n", "Exit%n%n" };
	
	public static final String INPUT_PROMPT = "Enter choice";
	
	
	
	public static void main(String[] args) throws IOException{
		
			UIManager ui=new UIManager(System.in, System.out, menuOptions, INPUT_PROMPT);
			int option=ui.getMainOption();
		

	}

}
