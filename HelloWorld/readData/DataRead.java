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
		int sub = firstNumber-seccondNumber;
		int mul = firstNumber*seccondNumber;
		int div = firstNumber/seccondNumber;
		int mod = firstNumber%seccondNumber;
		
		System.out.println("Sum:" + sum);
		System.out.println("Sub:" + sub);
		System.out.println("Mul:" + mul);
		System.out.println("div:" + div);
		System.out.println("mod:" + mod);

		
		if (sum % 2 == 0) {
			System.out.println("The sum is even");
		}else {
			System.out.println("The sum is odd");
		}

	}

}
