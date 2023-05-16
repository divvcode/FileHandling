package FileHandling;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {

	public static void main(String[] args) {
		char[] data = new char[1000];
		try {
			FileReader input = new FileReader("File.txt");
			input.read(data);
			System.out.println("Data is read from file");
			System.out.println(data);
			input.close();
		} catch (IOException ex) {
			System.out.println("File read is error");
		}
		// TODO Auto-generated method stub

	}

}
