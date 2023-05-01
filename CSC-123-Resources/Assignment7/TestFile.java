
public class TestFile {

	public static void main(String[] args) {
		
		FileManager fm=new FileManager(System.out);
		fm.listFiles();
		
		
		System.out.println(fm.getPath());
		fm.printFile(".project");

	}

}
