
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author duecl801
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({timetableDAO.DaoTimetableTesting.class, userDAO.DaoUserTesting.class, 
	timetableGUI.GuiCreateTimetableTesting.class, userGUI.GuiCreateAccountTesting.class})

public class AllTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
