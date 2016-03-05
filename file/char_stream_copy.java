import java.io.*;
public class CopyFile {
	public static void main(String args[]){
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			while ((int c = in.read()) != -1) {
				out.write(c);
			}
		} 	
		catch (IOException e) {
			System.out.println("IOException: "+e.getMessage());
		} finally {
			if (in != null) { in.close(); }
			if (out != null) { out.close(); }
		}
	}
}