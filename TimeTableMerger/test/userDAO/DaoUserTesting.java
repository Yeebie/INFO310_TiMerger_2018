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
		userDAO.deleteUser(user1);
		userDAO.deleteUser(user2);
		userDAO.deleteUser(user3);
	}
	
	@Test
	public void testGetUser(){
		User retrieved = userDAO.getUser("username2");
		assertEquals("Retrieved user should be the same", user2, retrieved);

		assertEquals("Retrieved username should be the same", user2.getUserName(), retrieved.getUserName());
		assertEquals("Retrieved first name should be the same", user2.getFirstName(), retrieved.getFirstName());
		assertEquals("Retrieved last name should be the same", user2.getLastName(), retrieved.getLastName());
		assertEquals("Retrieved password should be the same", user2.getPassword(), retrieved.getPassword());
		assertEquals("Retrieved email should be the same", user2.getEmail(), retrieved.getEmail());

		User testUser = userDAO.getUser("username4");

		assertNull("User should not exist", testUser);
	
	}
	
	@Test
	public void testSaveUser(){
		userDAO.saveUser(user3);
		User retrieved = userDAO.getUser("username3");
		assertEquals("Retrieved user should be the same", user3, retrieved);
	}
	
	@Test
	public void testDeleteUser(){
		userDAO.deleteUser(user1);
		User retrieved = userDAO.getUser("username1");
		assertNull("User should no longer exist", retrieved);
	}
	
}
