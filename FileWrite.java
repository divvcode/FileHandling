package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String data = "1,Sky,and, Moon.";
		try {
			FileWriter output = new FileWriter("File.txt");
			output.write(data);
			System.out.println("Data is written successfully");
			output.close();
		} catch (IOException ex) {
			System.out.println("File write is error");
		
		
		}
		// TODO Auto-generated method stub

	}

}
