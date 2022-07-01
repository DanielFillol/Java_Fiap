package readData;

import java.util.Scanner;

public class DataRead {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Choose a number");
		int firstNumber = sc.nextInt();
		
		System.out.println("Choose another number");
		int seccondNumber = sc.nextInt();
		
		sc.close();
		
		int sum = firstNumber+seccondNumber;
		System.out.println("Sum:" + sum);
		
		int sub = firstNumber-seccondNumber;
		System.out.println("Sub:" + sub);
		
		int mul = firstNumber*seccondNumber;
		System.out.println("Mul:" + mul);
		
		double div = firstNumber/ (double) seccondNumber;
		System.out.println("div:" + div);
		
		int mod = firstNumber%seccondNumber;
		System.out.println("mod:" + mod);

		
		if (sum % 2 == 0) {
			System.out.println("The sum is even");
		}else {
			System.out.println("The sum is odd");
		}

	}

}
