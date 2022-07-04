package inheritance;

public class Test {

	public static void main(String[] args) {
		
		SavingsAccount cc = new SavingsAccount();
		
		cc.setBalance(1000);
		cc.setOverdraft(5000);
		
		System.out.println(cc.getAvailableBalance());
		System.out.println(cc.getBalance());
		
		//Remember that cc is instance of Account and SavingsAccount
		if (cc instanceof Account) {
			System.out.println("The obj is Savings Account");
		}else {
			System.out.println("The obj is't Savings Account");
		}
		
		

	}

}

