package abstractClass;

public class CheckingAccount extends Account {
	
	private double limit;

	@Override
	public void withdraw(double value) throws Exception{
		if (value > balance + limit) {
			throw new Exception("Insuficient founds");
		}
		balance = balance - value;
	}
	
	@Override
	public double getBalance() {
		return balance + limit;
	}
	
	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
}
