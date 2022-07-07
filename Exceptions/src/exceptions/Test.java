package exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int a, b, result=0;
		Scanner reader = new Scanner(System.in);
		
		Math mathFunc = new Math();
		
		System.out.println("Inform int A:");
		a = reader.nextInt();
		
		System.out.println("Inform int B:");
		b = reader.nextInt();
		
		try {
			result = mathFunc.division(a, b);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("The result:" + result);
		
		reader.close();
		
		

	}

}
