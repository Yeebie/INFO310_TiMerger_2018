package userDAO;

import dao.UserDAO;
import domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duecl801
 */
public class DaoUserTesting {
	
	private UserDAO userDAO = new UserDAO("jdbc:h2:tcp://localhost:9054/project-testing");
	private User user1;
	private User user2;
	private User user3;
	
	public DaoUserTesting() {
	}
	
	@Before
	public void setUp() {
		this.user1 = new User("username1", "firstname1", "lastname1", "password1", "email@email.com");
		this.user2 = new User("username2", "firstname2", "lastname2", "password2", "email@email.com");
		this.user3 = new User("username3", "firstname3", "lastname3", "password3", "email@email.com");
		
		userDAO.saveUser(user1);
		userDAO.saveUser(user2);
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testGetUser(){
	
	}
	
	@Test
	public void testSaveUser(){
		
	}
	
}
