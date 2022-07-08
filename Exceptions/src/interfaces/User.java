package interfaces;

public class User implements Authentic  {
	
	public boolean login(String user, String password) {
		if (user.equals("adm") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
} 
