package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// Use when the repetition is connected with a condition
		// The difference between do while and while: do while always will be executed at least the first time.
		
		int psw;
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("You need to find the secret number!");
			psw = reader.nextInt();
			
		} while (psw != 1138);
		
		System.out.println("You found the secret number!");

	}

}
