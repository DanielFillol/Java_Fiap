package objects;

public class Test {

	public static void main(String[] args) {
		
		Conta a = new Conta();
		
		a.deposit(200);
		a.withdraw(300);
		
		System.out.println(a.getBalance());

	}

}
