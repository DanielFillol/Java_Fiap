package exceptions;

public class Math {
	
	public int division(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("The number can't be 0");
		}
		return a/b;
	}

}
 