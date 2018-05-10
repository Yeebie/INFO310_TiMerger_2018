package timetableGUI;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.Day;
import gui.CreateTimetable;
import static org.junit.Assert.*;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.DialogFixture;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 *
 * @author duecl801
 */
public class GuiCreateTimetableTestsing {

	private TimetableDAO timetableDao;
	private UserDAO userDao;
	private UserStorageDAO userStorageDao;
	private DialogFixture fixture;
	private Robot robot;
	private Day monday;
	private Day tuesday;

	public GuiCreateTimetableTestsing() {
	}

	@Before
	public void setUp() {
		robot = BasicRobot.robotWithNewAwtHierarchy();
		robot.settings().delayBetweenEvents(75);

		this.monday = new Day("test", "Monday", true, true, true, true, true, true, true, true, true, true, true, true, true, false);
		this.tuesday = new Day("test", "Tuesday", false, false, false, false, false, false, false, false, false, false, false, false, false, true);

		timetableDao = mock(TimetableDAO.class);
		userDao = mock(UserDAO.class);
		userStorageDao = mock(UserStorageDAO.class);
	}

	@After
	public void tearDown() {
		fixture.cleanUp();
	}
	
		@Test
	public void testSaveDay() {
		CreateTimetable create = new CreateTimetable(null, true, timetableDao, userDao, userStorageDao);
		fixture = new DialogFixture(robot, create);
		fixture.show().requireVisible();

		fixture.textBox("txtID").enterText("p3");
		fixture.textBox("txtName").enterText("n3");
		fixture.textBox("txtDescription").enterText("d3");
		fixture.comboBox("comboBoxCategory").enterText("c3");
		fixture.textBox("txtPrice").enterText("33");
		fixture.textBox("txtQuantity").enterText("33");

		fixture.button("buttonSave").click();

		ArgumentCaptor<Day> argument = ArgumentCaptor.forClass(Day.class);

		verify(timetableDao).createTimetable(argument.capture());

		Day savedDay = argument.getValue();

		assertEquals("Ensure the ID was saved", "p3", savedDay.getProductID());
		assertEquals("Ensure the name was saved", "n3", savedDay.getName());
		assertEquals("ensure the description was saved", "d3", savedDay.getDescription());
		assertEquals("Ensure the category was saved", "c3", savedDay.getCategory());
		assertEquals("Ensure the price was saved", new BigDecimal(33), savedDay.getPrice());
		assertEquals("Ensure the quantity was saved", new Integer(33), saved.getQuantity());
	}
	
	@Test
	public void testEditDay() {
	}

}
