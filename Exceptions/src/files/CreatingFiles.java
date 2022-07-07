package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingFiles {

	public static void main(String[] args) {
		
		try {
			
			FileWriter stream = new FileWriter("test.txt");
			PrintWriter writer = new PrintWriter(stream);
		
			writer.println("Test 1");
			writer.println("Test 2");
			
			writer.close();
			stream.close();
		
		} catch(IOException e) {
			
			System.out.println("Error creating file" + e);
			
		}
		
	}

}
