package string;

public class string {

	public static void main(String[] args) {
		
		String text = new String("-Testing\n-\"string\"");
		
		System.out.println(text);
		
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.length());
		
		System.out.println(text.startsWith("-Tes"));
		System.out.println(text.endsWith("ing\""));
		
		String name = "daniel";
		
		if (name.equalsIgnoreCase("Daniel")){
			System.out.println("OK 1");
		}else {
			System.out.println("dosen't work 1");
		}
		
		if (name == "Daniel"){
			System.out.println("OK 2"); 
		} else {
			System.out.println("dosen't work 2");
		}
		
		

	}

}
