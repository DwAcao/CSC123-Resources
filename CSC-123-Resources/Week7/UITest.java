import java.io.IOException;

public class UITest {

	public static final String[] menuOptions = { "Option 1%n","Option2%n","Execute all options%n" };
	
	public static final String INPUT_PROMPT = "Enter choice";
	
	
	
	public static void main(String[] args) throws IOException{
		
			UIManager ui=new UIManager(System.in, System.out, menuOptions, INPUT_PROMPT);
			int option=ui.getMainOption();
			double d=ui.readDouble("Enter amount of money you need: ");
			int i=ui.readInt("Enter your age: ");
		

	}

}
