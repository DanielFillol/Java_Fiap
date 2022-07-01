package operators;

public class MathOperators {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		
		int sum = x+y;
		System.out.println("Sum restult: " + sum);
		
		int sub = x-y;
		System.out.println("Subtraciton restult: " + sub);
		
		int mult = x*y;
		System.out.println("Multiplication restult: " + mult);
		
		double div = x/(double)y;
		System.out.println("Division restult: " + div);
		
		int mod = x%y;
		System.out.println("Module restult: " + mod);

		
		x++;
		System.out.println("Increment result: " + x);
		
		y--;
		System.out.println("Decrement result: " + y);
		
		x+=10;
		System.out.println("Positive atribution: " + x);
		
		y-=10;
		System.out.println("Negative atribution" + y);

	}

}
