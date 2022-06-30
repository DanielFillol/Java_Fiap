package operators;

public class MathOperators {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		
		int sum = x+y;
		int sub = x-y;
		int mult = x*y;
		int div = x/y;
		int mod = x%y;
		
		System.out.println("Sum restult: " + sum);
		System.out.println("Subtraciton restult: " + sub);
		System.out.println("Multiplication restult: " + mult);
		System.out.println("Division restult: " + div);
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
