package abstractClass;

public class Test {

	public static void main(String[] args) {
		
		//Impossible to init a object with abstract class
		//-> Account c = new Account();
		
		CheckingAccount cc = new  CheckingAccount();
		SavingsAccount sc = new SavingsAccount();

	}

}
