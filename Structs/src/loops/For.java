package loops;


public class For {

	public static void main(String[] args) {
	
		// Use if you know the amount
		for (int i = 0; i<=10; i++) {
			System.out.println(i);
		}
				
		// This permit to access the variable b outside the loop
		int b = 0;
		while(b<=10) {
			System.out.println(b);
			b++;
		}
	}

}
