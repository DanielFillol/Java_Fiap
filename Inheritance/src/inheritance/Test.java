package inheritance;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount cc = new SavingsAccount(123,321,100,",V.I.P",100);
	
		
		System.out.println(cc.getAvailableBalance());
		System.out.println(cc.getBalance());
		
		//Remember that cc is instance of Account and SavingsAccount
		if (cc instanceof Account) {
			System.out.println("The obj is Savings Account");
		}else {
			System.out.println("The obj is't Savings Account");
		}
		
		
		//How Override works 
		Account c = new Account();
		
		c.setBalance(100);
		
		System.out.println("The balance of the account is: " + c.getBalance());
		System.out.println("The balance of the saings account is: " + cc.getBalance());
		 
		c.withdraw(50, 10);
		cc.withdraw(50, 10);
		
		System.out.println("The balance of the account is: " + c.getBalance());
		System.out.println("The balance of the saings account is: " + cc.getBalance());
		
		
		

	}

}

