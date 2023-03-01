
public class ExceptionDemo {

	public static void main(String[] args) throws MyException {
		
		int x=2;
		int y=4;
		
		if(y%x!=0) throw new MyException("Y is not an eve number");
		

	}

}
