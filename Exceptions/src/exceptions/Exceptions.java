package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			int a, b, result;
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Insert value for A:");
			a = reader.nextInt();
			
			System.out.println("Insert value for B");
			b = reader.nextInt();
			
			reader.close();
			
			result = a / b;
			System.out.println("The result is:" + result);
		
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("Arithmetic Excepion");
		} catch(InputMismatchException e) {
			System.out.println("Only int values");
		}
		 
		System.out.println("Everything works");

	}

}
