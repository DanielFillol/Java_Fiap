package objects;

public class Conta {
	
	int acountNumber, bankNumber;
	double balance;
	
	double getBalance() {
		return balance;
	}
	
	void setBankNumber (int bankNumber) {
		if (bankNumber < 0) {
			System.out.println("Bank number has to be greater than 0");
		}
		this.bankNumber = bankNumber;
	}
	
	void setAcountNumber (int acountNumber) {
		if (acountNumber < 0) {
			System.out.println("Acount number has to be greater than 0");
		}
		this.acountNumber = acountNumber;
	}
	
	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("The amount has to be greater than 0");
		}
	}
	
	void withdraw(double amount) {
		balance = getBalance();
		if (amount < balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insuficient founds");
		}
	}
	

}
