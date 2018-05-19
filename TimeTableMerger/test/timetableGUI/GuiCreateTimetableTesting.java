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
public class GuiCreateTimetableTesting {

    private TimetableDAO timetableDao = new TimetableDAO("jdbc:h2:tcp://localhost:9054/project-testing");
    private UserDAO userDao;
    private UserStorageDAO userStorageDao;
    private DialogFixture fixture;
    private Robot robot;
    private Day monday;
    private Day tuesday;

    public GuiCreateTimetableTesting() {
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

        //somehow need to capture username and day name in order to save day
        fixture.checkBox("mon8w1").check(true);
        fixture.checkBox("mon9w1").check(true);
        fixture.checkBox("mon10w1").check(false);
        fixture.checkBox("mon11w1").check(false);
        fixture.checkBox("mon12w1").check(true);
        fixture.checkBox("mon13w1").check(true);
        //fixture.checkBox("mon14w1").check(true);
        //fixture.checkBox("mon15w1").check(false);
        //fixture.checkBox("mon16w1").check(false);
        //fixture.checkBox("mon17w1").check(true);
        //fixture.checkBox("mon18w1").check(true);
        //fixture.checkBox("mon19w1").check(true);
        //fixture.checkBox("mon20w1").check(true);
        //fixture.checkBox("mon21w1").check(true);

        fixture.button("buttonSaveTimetable").click();
        System.out.println("testing" + "argument");
        ArgumentCaptor<Day> argument = ArgumentCaptor.forClass(Day.class);
        //      System.out.println(argument.capture() + "capture" ) ; 
        //    System.out.println(argument + "argument") ; 
        verify(timetableDao).saveDay(argument.capture());

        Day savedDay = argument.getValue();

        //assertEquals("Ensure the username was saved", "p3", savedDay.getProductID());
        //assertEquals("Ensure the name was saved", "n3", savedDay.getName());
        assertEquals("Ensure the eight AM was saved", true, savedDay.getEightAM());
        assertEquals("Ensure the nine AM was saved", true, savedDay.getNineAM());
        assertEquals("Ensure the ten AM was saved", false, savedDay.getTenAM());
        assertEquals("Ensure the eleven AM was saved", false, savedDay.getElevenAM());
        assertEquals("Ensure the twelve PM was saved", true, savedDay.getTwelvePM());
        assertEquals("Ensure the one PM was saved", true, savedDay.getOnePM());
        /*assertEquals("Ensure the two PM was saved", true, savedDay.getTwoPM());
		assertEquals("Ensure the three PM was saved", false, savedDay.getThreePM());
		assertEquals("Ensure the four PM was saved", false, savedDay.getFourPM());
		assertEquals("Ensure the five PM was saved", true, savedDay.getFivePM());
		assertEquals("Ensure the six PM was saved", true, savedDay.getSixPM());
		assertEquals("Ensure the seven PM was saved", true, savedDay.getSevenPM());
		assertEquals("Ensure the eight PM was saved", true, savedDay.getEightPM());
		assertEquals("Ensure the nine PM was saved", true, savedDay.getNinePM()); */
    }
}
