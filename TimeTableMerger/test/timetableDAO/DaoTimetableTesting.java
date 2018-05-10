package timetableDAO;

import dao.TimetableDAO;
import domain.Day;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duecl801
 */
public class DaoTimetableTesting {
	private TimetableDAO timetableDAO = new TimetableDAO("jdbc:h2:tcp://localhost:9053/project-testing");
	private Day monday;
	private Day tuesday;
	private Day wednesday;
	
	public DaoTimetableTesting() {
	}
	
	@Before
	public void setUp() {
		this.monday = new Day("test", "Monday", true, true, true, true, true, true, true, true, true, true, true, true, true, false);
		this.tuesday = new Day("test", "Tuesday", false, false, false, false, false, false, false, false, false, false, false, false, false, true);
		this.wednesday = new Day("test", "Wednesday", true, false, true, false, true, false, true, false, true, false, true, false, true, false);
		
		timetableDAO.createTimetable(monday);
		timetableDAO.createTimetable(tuesday);
	}
	
	@After
	public void tearDown() {
		timetableDAO.deleteDay(monday);
		timetableDAO.deleteDay(tuesday);
		timetableDAO.deleteDay(wednesday);
	}
	
		@Test
	public void testDaoCreate() {
		timetableDAO.createTimetable(wednesday);
		Day retrieved = timetableDAO.getTimetable("test","Wednesday");
		assertEquals("Retrieved day should be the same", wednesday, retrieved);
	}
	
		@Test
	public void testDaoDelete() {
		timetableDAO.deleteDay(monday);
		Day retrieved = timetableDAO.getTimetable("test","Monday");
		assertNull("Day should no longer exist", retrieved);
	}
	
	@Test
	public void testDaoFindDay() {
		Day retrieved = timetableDAO.getTimetable("test","Tuesday");
		assertEquals("Retrieved day should be the same", tuesday, retrieved);

		assertEquals("Retrieved username should be the same", tuesday.getUserName(), retrieved.getUserName());
		assertEquals("Retrieved day name should be the same", tuesday.getDayName(), retrieved.getDayName());
		assertEquals("Retrieved eightAM should be the same", tuesday.getEightAM(), retrieved.getEightAM());
		assertEquals("Retrieved nineAM should be the same", tuesday.getNineAM(), retrieved.getNineAM());
		assertEquals("Retrieved tenAM should be the same", tuesday.getTenAM(), retrieved.getTenAM());
		assertEquals("Retrieved elevenAM should be the same", tuesday.getElevenAM(), retrieved.getElevenAM());
		assertEquals("Retrieved twelvePM should be the same", tuesday.getTwelvePM(), retrieved.getTwelvePM());
		assertEquals("Retrieved onePM should be the same", tuesday.getOnePM(), retrieved.getOnePM());
		assertEquals("Retrieved twoPM should be the same", tuesday.getTwoPM(), retrieved.getTwoPM());
		assertEquals("Retrieved threePM should be the same", tuesday.getThreePM(), retrieved.getThreePM());
		assertEquals("Retrieved fourPM should be the same", tuesday.getFourPM(), retrieved.getFourPM());
		assertEquals("Retrieved fivePM should be the same", tuesday.getFivePM(), retrieved.getFivePM());
		assertEquals("Retrieved sixPM should be the same", tuesday.getSixPM(), retrieved.getSixPM());
		assertEquals("Retrieved sevenPM should be the same", tuesday.getSevenPM(), retrieved.getSevenPM());
		assertEquals("Retrieved eightPM should be the same", tuesday.getEightPM(), retrieved.getEightPM());
		assertEquals("Retrieved ninePM should be the same", tuesday.getNinePM(), retrieved.getNinePM());

		Day testDay = timetableDAO.getTimetable("test","thursday");

		assertNull("Day should not exist", testDay);
	}
	
		@Test
	public void testEdit() {
		Day dayToEdit = timetableDAO.getTimetable("test", "Monday");

		dayToEdit.setUser("test1");
		dayToEdit.setDayName("Friday");
		dayToEdit.setEightAM(false);
		dayToEdit.setNineAM(false);
		dayToEdit.setTenAM(false);
		dayToEdit.setElevenAM(false);
		dayToEdit.setTwelvePM(false);
		dayToEdit.setOnePM(false);
		dayToEdit.setTwoPM(false);
		dayToEdit.setThreePM(false);
		dayToEdit.setFourPM(false);
		dayToEdit.setFivePM(false);
		dayToEdit.setSixPM(false);
		dayToEdit.setSevenPM(false);
		dayToEdit.setEightPM(false);
		dayToEdit.setNinePM(true);

		timetableDAO.createTimetable(dayToEdit);

		Day retrieved = timetableDAO.getTimetable("test", "Monday");

		assertEquals("Retrieved username should be the same", tuesday.getUserName(), retrieved.getUserName());
		assertEquals("Retrieved day name should be the same", tuesday.getDayName(), retrieved.getDayName());
		assertEquals("Retrieved eightAM should be the same", tuesday.getEightAM(), retrieved.getEightAM());
		assertEquals("Retrieved nineAM should be the same", tuesday.getNineAM(), retrieved.getNineAM());
		assertEquals("Retrieved tenAM should be the same", tuesday.getTenAM(), retrieved.getTenAM());
		assertEquals("Retrieved elevenAM should be the same", tuesday.getElevenAM(), retrieved.getElevenAM());
		assertEquals("Retrieved twelvePM should be the same", tuesday.getTwelvePM(), retrieved.getTwelvePM());
		assertEquals("Retrieved onePM should be the same", tuesday.getOnePM(), retrieved.getOnePM());
		assertEquals("Retrieved twoPM should be the same", tuesday.getTwoPM(), retrieved.getTwoPM());
		assertEquals("Retrieved threePM should be the same", tuesday.getThreePM(), retrieved.getThreePM());
		assertEquals("Retrieved fourPM should be the same", tuesday.getFourPM(), retrieved.getFourPM());
		assertEquals("Retrieved fivePM should be the same", tuesday.getFivePM(), retrieved.getFivePM());
		assertEquals("Retrieved sixPM should be the same", tuesday.getSixPM(), retrieved.getSixPM());
		assertEquals("Retrieved sevenPM should be the same", tuesday.getSevenPM(), retrieved.getSevenPM());
		assertEquals("Retrieved eightPM should be the same", tuesday.getEightPM(), retrieved.getEightPM());
		assertEquals("Retrieved ninePM should be the same", tuesday.getNinePM(), retrieved.getNinePM());
	}
	
}
