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
		System.out.println("This is the stored username: " + userName);
	}
}
