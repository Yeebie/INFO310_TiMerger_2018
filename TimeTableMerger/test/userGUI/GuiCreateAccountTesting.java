package userGUI;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.User;
import gui.CreateAccount;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.TreeSet;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.DialogFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 *
 * @author duecl801
 */
public class GuiCreateAccountTesting {

	private UserDAO userDao;
	private UserStorageDAO userStorageDao;
	private TimetableDAO timetableDao;
	private DialogFixture fixture;
	private Robot robot;
	private User user1;
	private User user2;
	private Collection<User> users = new TreeSet<>();

	public GuiCreateAccountTesting() {
	}

	@Before
	public void setUp() {
		robot = BasicRobot.robotWithNewAwtHierarchy();
		robot.settings().delayBetweenEvents(75);

		this.user1 = new User("username1", "firstname1", "lastname1", "password1", "email@email.com");
		this.user2 = new User("username2", "firstname2", "lastname2", "password2", "email@email.com");
		users.add(user1);
		users.add(user2);

		userDao = mock(UserDAO.class);
		userStorageDao = mock(UserStorageDAO.class);
		timetableDao = mock(TimetableDAO.class);

		Mockito.doAnswer(new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				users.remove(user1);
				return null;
			}
		}).when(userDao).deleteUser(user1);
	}

	@After
	public void tearDown() {
		fixture.cleanUp();
	}
	
		@Test
	public void testSaveUser() {
		CreateAccount create = new CreateAccount(userDao, timetableDao, userStorageDao);
		fixture = new DialogFixture(robot, create);
		fixture.show().requireVisible();

		fixture.textBox("userNameField").enterText("username3");
		fixture.textBox("firstNameField").enterText("firstName3");
		fixture.textBox("lastNameField").enterText("lastName3");
		fixture.textBox("passwordField").enterText("password3");
		fixture.textBox("reenterField").enterText("password3");
		fixture.textBox("emailField").enterText("email@email.com");

		fixture.button("loginButton").click();

		ArgumentCaptor<User> argument = ArgumentCaptor.forClass(User.class);

		verify(userDao).saveUser(argument.capture());

		User savedUser = argument.getValue();

		assertEquals("Ensure the username was saved", "username3", savedUser.getUserName());
		assertEquals("Ensure the first name was saved", "firstName3", savedUser.getFirstName());
		assertEquals("ensure the last name was saved", "lastName3", savedUser.getLastName());
		assertEquals("Ensure the password was saved", "password3", savedUser.getPassword());
		assertEquals("Ensure the email was saved", "email@email.com", savedUser.getEmail());
	}

}
