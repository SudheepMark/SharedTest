package com.fdmgroup.mockito;

public class LoginManager {
	
	private UserManager userManager;

	public LoginManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public boolean login(String username, String password) {
		User user = userManager.getUserFromDatabase(username);
		
		if(user == null)
		{
			return false;
		}
		
		if(user.getPassword().equals(password)){
			return true;
		}
		return false;
	}

}
