package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) {
		
		try {
			FileReader stream = new FileReader("test.txt");	
			BufferedReader reader = new BufferedReader(stream);
			
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			
			reader.close();
			stream.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException e) {
			System.out.println("Error reading file");
		}
		

	}

}
