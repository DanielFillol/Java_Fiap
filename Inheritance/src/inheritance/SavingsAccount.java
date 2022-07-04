package inheritance;

public class SavingsAccount extends Account {

	private String AccountType;
	private double Overdraft;
	
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


}
