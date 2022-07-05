package inheritance;

public class override {

	public static void main(String[] args) {
		//How Override works 
		SavingsAccount cc = new SavingsAccount(123,321,100,",V.I.P",100);
		Account c = new Account(456,789,100);
				
		System.out.println("The balance of the account is: " + c.getBalance());
		System.out.println("The balance of the saings account is: " + cc.getBalance());
			
		c.withdraw(50, 10);
		cc.withdraw(50, 10);
				
		System.out.println("The balance of the account is: " + c.getBalance());
		System.out.println("The balance of the saings account is: " + cc.getBalance());

	}

}
