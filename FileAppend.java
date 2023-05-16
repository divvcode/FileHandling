package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		String  data = "The data is appended";
		try {
			FileWriter output = new FileWriter("File.txt", true);
			output.write(data);
			System.out.println("Data is appended is successfully");
			output.close();
		} catch (IOException ex) {
			System.out.println("File append is error");
		}
		
		// TODO Auto-generated method stub

	}

}
