package collections;

import java.util.ArrayList;
import array.Vehicle;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList <Vehicle> list = new ArrayList<Vehicle>();
		
		//add
		list.add(new Vehicle ("Palio", "Fiat"));
		list.add(new Vehicle ("Civic", "Honda"));
		list.add(new Vehicle ("Renegade", "Jeep"));
		
		System.out.println(list);
		
		for (Vehicle car:list) {
			System.out.println(car);
		}

	}

}
