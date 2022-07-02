package bmi;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		float weigth, height, bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform your weight:");
		weigth = sc.nextFloat();
		
		System.out.println("Inform your height:");
		height = sc.nextFloat();
			
		sc.close();
		
		bmi = weigth/(height*height);
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
