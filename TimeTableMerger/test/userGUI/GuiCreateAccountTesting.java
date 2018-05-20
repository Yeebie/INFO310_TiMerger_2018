package userGUI;
 
import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.Day;
import domain.User;
import gui.CreateAccount;
import gui.CreateTimetable;
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
 
	private UserDAO userDao = new UserDAO ("jdbc:h2:tcp://localhost:9054/project-testing");
        private User user;
        private CreateAccount createAccount;
	private UserStorageDAO userStorageDao;
	private TimetableDAO timetableDao;
	private DialogFixture fixture;
	private Robot robot;
	private User user1;
	private User user2;
	
 
	public GuiCreateAccountTesting() {
	}
 
	@Before
	public void setUp() {
 
	robot = BasicRobot.robotWithNewAwtHierarchy();
        robot.settings().delayBetweenEvents(75);
 
        this.user1 = new User("test", "user1", "true", "true", "true");
        this.user2 = new User("test", "user2", "true", "true" , "true");
 
        timetableDao = mock(TimetableDAO.class);
        userDao = mock(UserDAO.class);
        userStorageDao = mock(UserStorageDAO.class);
    }
	@After
	public void tearDown() {
            
		fixture.cleanUp();
                
                
 
	}
 
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	@Test
	public void testSave() {
            
           
             //CreateTimetable create = new CreateTimetable(null, true, timetableDao, userDao, userStorageDao);
                CreateAccount create = new CreateAccount (userDao ,timetableDao ,userStorageDao);
		// create the dialog passing in the mocked DAO
		
 
		// use AssertJ to control the dialog
		fixture = new DialogFixture(robot , create );
		fixture.show().requireVisible();
 
		// enter some details into the UI components
		fixture.textBox("usernameField").enterText("Alzhu850");
		fixture.textBox("firstNameField").enterText("Hus");
		fixture.textBox("lastNameField").enterText("Alzah");
		fixture.textBox("emailField").enterText("h22m@hot.com");
		fixture.textBox("passwordField").enterText("12345");
                fixture.textBox("reenterfield").enterText("12345");
		
 
		// click the save button
		fixture.button("loginButton").click();
 
		// create a Mockito argument captor to use to retrieve the passed student from the mocked DAO
		ArgumentCaptor<User> argument = ArgumentCaptor.forClass(User.class);
                 verify(userDao).saveUser(argument.capture());
 
                 User saveUser = argument.getValue();
 
		// test that the product details were properly saved
		assertEquals("Ensure the userName was saved", "Alzhu850",  saveUser.getUserName());
		assertEquals("Ensure the firstName was saved", "Hus", saveUser.getFirstName());
		assertEquals("Ensure the lastName was saved", "Alzah", saveUser.getLastName());
		assertEquals("Ensure the email was saved", "h22m@hot.com" , saveUser.getEmail());
                assertEquals("Ensure the password was saved", "12345", saveUser.getPassword());
                assertEquals("Ensure the password was saved", "12345", saveUser.getPassword());
		
 
	}
}