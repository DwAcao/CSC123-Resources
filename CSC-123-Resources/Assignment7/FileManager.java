import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileManager {

	private File currentDir;
	private OutputStream out;

	public FileManager(OutputStream out) {
		currentDir = new File(System.getProperty("user.dir"));
		this.out = out;

	}

	public void changeDir(String dir) {
		if (dir.equalsIgnoreCase("..")) {
			this.currentDir = this.currentDir.getParentFile();
		} else {
			File d = new File(dir);
			if (!d.exists() || !d.isDirectory()) {
				print("\n\nInvalid directory!\n");
			} else {
				currentDir = d;
			}

		}
	}

	public String getPath() {
		return this.currentDir.getAbsolutePath();
	}

	public void listFiles() {
			int x=1;
			for (File f : this.currentDir.listFiles()) {
				print(String.format("%d - %s [%s]%n",x++,f.getName(),(f.isDirectory()?"D":"F")));
			}

	}

	public void printFile(String fName) {
		File f = new File(fName);
		try {
			if (!f.exists() || f.isDirectory())
				print("\n\nFile not found!\n\n");
			InputStream in = new FileInputStream(f);
			byte[] readBytes = new byte[in.available()];
			in.read(readBytes);
			print("\n\n====================\n\n");
			print(new String(readBytes));
			print("\n====================\n\n");

			out.flush();
			in.close();
			out.close();
		} catch (IOException e) {
		}
	}

	private void print(String s) {
		try {
			out.write(s.getBytes());
		} catch (Exception ignored) {
		}
	}

}
