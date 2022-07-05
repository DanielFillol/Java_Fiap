package inheritance;

public class SavingsAccount extends Account {

	private String AccountType;
	private double Overdraft;
	
	public SavingsAccount(int accountNumber,int bankAccount, double balance, String AccountType, double Overdraft) {
		super (accountNumber, bankAccount, balance);
		this.AccountType = AccountType;
		this.Overdraft = Overdraft;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	
	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;	
	}
	
	public double getOverdraft() {
		return Overdraft;
	}

	public void setOverdraft(double overdraft) {
		Overdraft = overdraft;
	}
	
	public double getAvailableBalance() {
		return getBalance() + this.Overdraft;
	}
	
	@Override public void withdraw(double amount, double tax) {
		if (amount > 0) {
			double totalAmount = amount + (amount * (tax/100));
			withdraw(totalAmount);
		}else {
			System.out.println("The amount has to be greater than 0");
		}
	}


}
