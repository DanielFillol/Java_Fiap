package collections;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		HashSet list = new HashSet();
		System.out.println();
		
		//add
		list.add("Java");
		list.add("Phython");
		list.add("Go");
		list.add("Java");
		System.out.println(list);
		
		//contains
		System.out.println(list.contains("Go"));
		
		//isEmpty
		System.out.println(list.isEmpty());
		
		//remove
		list.remove("Go");
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//toArray
		System.out.println(list.toArray());
		
		//clear
		list.clear();
		System.out.println(list);

	}

}
