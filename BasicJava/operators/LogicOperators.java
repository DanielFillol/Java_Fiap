package operators;

public class LogicOperators {

	public static void main(String[] args) {
		
		// GREATER
		int age = 10;
		boolean legalAge = age > 18;
		System.out.println(age);
		System.out.println(legalAge);
		
		// AND
		boolean voteRequired = age > 18 && age < 70;
		System.out.println(voteRequired);
		
		// OR
		int x = 10;
		boolean orOperator = x < 10 || x > 50;
		System.out.println(orOperator);
		
		// Simple
		System.out.println(!(age > 18));
		
		
	}

}
