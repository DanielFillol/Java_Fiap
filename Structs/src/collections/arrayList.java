package collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		//add
		list.add("Daniel");
		list.add("Java");
		list.add("Python");
		list.add("Python");
		
		//get
		System.out.println("\nget");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//remove
		System.out.println("\nremove");
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//set
		System.out.println("\nset");
		list.set(0, "André");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//indexOf
		System.out.println("\nindexOf: Python");
		System.out.println(list.indexOf("Python"));
		
		//lastIndexOf
		System.out.println("\nlastIndexOf: Python");
		System.out.println(list.lastIndexOf("Python"));
		
		//subList
		System.out.println("\nsubList");
		ArrayList list2 = new ArrayList(list.subList(0,3));
		System.out.println(list2);
		
		

	}

}
