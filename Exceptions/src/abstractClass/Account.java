package abstractClass;

public abstract class Account {
	protected double balance;
	
	public void withdraw(double value) throws Exception{
		if (value > balance) {
			throw new Exception("Insuficient founds");
		}
		balance = balance - value;
	}
	
	public abstract double getBalance();

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
