package FileHandling;
import java.io.File;
import java.io.IOException;


public class CreateFile {

	public static void main(String[] args) {
		File myFile = new File("File.txt");
		try {
		
		if (myFile.createNewFile()) {
			System.out.println("File created successfully.");
		}
		else {
			System.out.println("File is not created");
		}
		} catch (IOException ex) {
			System.out.println("File error..");
		}
		
		// TODO Auto-generated method stub

	}

}
