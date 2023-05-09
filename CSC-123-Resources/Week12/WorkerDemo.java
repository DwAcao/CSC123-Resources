import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class WorkerDemo extends Thread{

	BufferedReader reader;
	BufferedWriter writer;
	
	String workingDir;
	String prompt;
	
	

	public WorkerDemo(BufferedReader reader, BufferedWriter writer, String workingDir, String prompt) {
		super();
		this.reader = reader;
		this.writer = writer;
		this.workingDir = workingDir;
		this.prompt = prompt;
	}



	public synchronized void run() {
		try {
			while (true) {
				
				System.out.println(getName());

				writer.write("\n\r" + workingDir + prompt);
				writer.flush();
				String clientCommand = reader.readLine();

				if (clientCommand.equalsIgnoreCase("pwd")) {
					writer.write("\nWorking directory is: " + workingDir + "\n\n");
				} else if (clientCommand.equalsIgnoreCase("dir")) {

					File currentDirectory = new File(workingDir);
					File[] allFiles = currentDirectory.listFiles();

					for (File f : allFiles) {
						writer.write("\n\r" + f.getName() + (f.isDirectory() ? " - Directory" : " - File"));
					}

				}
				else if (clientCommand.startsWith("cd")) {
					String directory = clientCommand.split(" ")[1];
					File tempWorkingDir;

					if (directory.equalsIgnoreCase("..")) {
						tempWorkingDir = new File(workingDir).getParentFile();
					} else {
						tempWorkingDir = new File(workingDir + File.separator + directory);
					}

					if (tempWorkingDir.isDirectory()) {
						workingDir = tempWorkingDir.getAbsolutePath();
					} else {
						writer.write("\n\r Directory does not exist!\n\r");
					}

				}
				else if(clientCommand.startsWith("exit")) {
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
