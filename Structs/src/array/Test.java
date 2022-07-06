package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Vehicle[] cars = new Vehicle[3];
		Scanner reader = new Scanner(System.in);
		
		String model, manufacturer;
		
		
		//First Example
		cars[0] = new Vehicle("Civic", "Honda");
		
		//Loop Example
		for (int i=1; i<cars.length; i++) {
			 System.out.println("Inform model");
			 model = reader.next();
			 System.out.println("Inform manufacturer");
			 manufacturer = reader.next();
			 cars[i] = new Vehicle(model,manufacturer);
		}
		
		//Using object in for loop
		for (Vehicle car: cars) {
			System.out.println(car);
		}
	}

}
