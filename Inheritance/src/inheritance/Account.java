package inheritance;


/**
 * Class that abstract a bank account.
 * @author danielfillol
 * @version 1.0
 */

public class Account {
	
	/**
	 *  account number
	 */
	private int accountNumber;
	
	/**
	 * bank number
	 */
	private int bankNumber;
	
	/**
	 * account balance
	 */
	private double balance;
	
	
	public Account() {
		
	}
	
	/**
	 * Constructor for Conta
	 * @param acountNumber
	 * @param bankNumber
	 */
	public Account(int accountNumber, int bankNumber) {
		setAccountNumber(accountNumber);
		setBankNumber(bankNumber);
	}
	
	/**
	 * Setter for account balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;	
		}else {
			System.out.println("Balance has to be aleast 0.");
		}
		
		
	}

	/**
	 * Setter for bank number
	 * @param bankNumber
	 */
	public void setBankNumber (int bankNumber) {
		if (bankNumber < 0) {
			System.out.println("Bank number has to be greater than 0");
		}
		this.bankNumber = bankNumber;
	}
	
	/**
	 * Setter for account number
	 * @param acountNumber
	 */
	public void setAccountNumber (int accountNumber) {
		if (accountNumber < 0) {
			System.out.println("Acount number has to be greater than 0");
		}
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Function to get the account balance
	 * @return account balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Function to get the account number
	 * @return account number
	 */
	public int getAcountNumber() {
		return accountNumber;
	}

	/**
	 * Function to get bank number
	 * @return bank number
	 */
    public int getBankNumber() {
    	return bankNumber;
    }
	
    /**
     * Function to increase account balance
     * @param amount - the money to be credit
     */
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("The amount has to be greater than 0");
		}
	}
	
	/**
	 * Function to decrease account balance WITHOUT taxes
	 * @param amount - the money to be deducted
	 */
	public void withdraw(double amount) {
		balance = getBalance();
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insuficient founds");
		}
	}
	
	/**
	 * Function to decrease account balance WITH taxes
	 * @param amount - the money to be deducted
	 * @param tax - the tax to be deducted
	 */
	public void withdraw(double amount, double tax) {
		double totalAmount = amount + tax;
		withdraw(totalAmount);
	}
}
