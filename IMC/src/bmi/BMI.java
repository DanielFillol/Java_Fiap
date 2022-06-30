package bmi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe your weight:");
		float weigth = sc.nextFloat();
		
		System.out.println("Informe your height:");
		float height = sc.nextFloat();
			
		sc.close();
		
		float bmi = weigth/(height*height);
		System.out.println("Your IBM is: " + bmi);
		
		if (bmi <= 18.5) {
			
			System.out.println("Under weight");
			
		} else if (bmi > 18.5 && bmi <= 24.9) {
			
			System.out.println("Normal weight");
			
		} else if (bmi > 25 && bmi <= 29.9) {

			System.out.println("Over weight");
			
		} else if (bmi > 30 && bmi <= 34.9) {
			
			System.out.println("Obesity  I");
			
		} else if (bmi > 35 && bmi <= 39.9) {
			
			System.out.println("Obesity  II");
			
		} else {
			
			System.out.println("Obesity  III");
		
		}

	}

}
