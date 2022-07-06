package loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// Use when the repetition is connected with a condition
		
		int psw = 0;
		
		Scanner reader = new Scanner(System.in);
		
		while(psw != 1138) {
			System.out.println("You need to find the secret number!");
			psw = reader.nextInt();
		}
		
		System.out.println("You found the secret number!");

	}

}
