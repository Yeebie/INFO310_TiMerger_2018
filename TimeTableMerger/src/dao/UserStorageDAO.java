package dao;

/**
 *
 * @author yeeja359
 */
public class UserStorageDAO {
	private String currentUser;
	
	public String getUserName() {
		return currentUser;
	}

	public void setUserName(String userName) {
		this.currentUser = userName;
		if(userName.equals("")){
			System.out.println("There is no user logged in. Fix this bug");
		}
		System.out.println("This is the stored username: " + userName);
	}
}
