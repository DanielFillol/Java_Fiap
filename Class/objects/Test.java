package objects;

public class Test {

	public static void main(String[] args) {
		
		Account a = new Account(123,456);
		a.deposit(200);
		a.withdraw(10,10);
		System.out.println(a.getBalance());
		
		Account b = new Account(2,456);
		b.deposit(10);
		b.withdraw(5);
		System.out.println(b.getBalance());

	}

}
