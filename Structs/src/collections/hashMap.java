package collections;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap data = new HashMap();
		System.out.println();
		
		//put
		data.put("RMS8D33", "Daniel");
		data.put("DZF4849", "Celso");
		data.put("123456", "LOTR");
		
		System.out.println(data);
		
		//get
		System.out.println(data.get("RMS8D33"));
		
		//containsKey
		System.out.println(data.containsKey("DZF4849"));
		
		//contaisValue
		System.out.println(data.containsValue("LOTR"));
		
		//keySet
		System.out.println(data.keySet());
		
		//values
		System.out.println(data.values());
		
		//isEmpty
		System.out.println(data.isEmpty());
		
		//remove
		data.remove("RMS8D33");
		System.out.println(data);
		
		//size
		System.out.println(data.size());
		
		//clear
		data.clear();
		System.out.println(data);
		

	}

}
