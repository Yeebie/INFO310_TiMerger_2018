package gui;

import dao.TimetableDAO;
import dao.UserDAO;
import dao.UserStorageDAO;
import domain.Day;
import domain.MergedDay;
import java.awt.CardLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author broma609
 */
public class EditTimetable extends javax.swing.JDialog { //Was javax.swing.JFrame

    private boolean userIDEditable = true;
    private final TimetableDAO timetableDAO;
    private final UserDAO userDAO;
    private final UserStorageDAO userStorageDAO;

    //private ArrayList<JCheckBox> weekDays1 = new ArrayList<JCheckBox>();
   // private ArrayList<JCheckBox> weekDays2 = new ArrayList<JCheckBox>();

    private Day mondayWeek1 = new Day();
    private Day tuesdayWeek1 = new Day();
    private Day wednesdayWeek1 = new Day();
    private Day thursdayWeek1 = new Day();
    private Day fridayWeek1 = new Day();
    private Day saturdayWeek1 = new Day();
    private Day sundayWeek1 = new Day();
    private Day mondayWeek2 = new Day();
    private Day tuesdayWeek2 = new Day();
    private Day wednesdayWeek2 = new Day();
    private Day thursdayWeek2 = new Day();
    private Day fridayWeek2 = new Day();
    private Day saturdayWeek2 = new Day();
    private Day sundayWeek2 = new Day();

    private MergedDay mondayWeek1Merged = new MergedDay();
    private MergedDay tuesdayWeek1Merged = new MergedDay();
    private MergedDay wednesdayWeek1Merged = new MergedDay();
    private MergedDay thursdayWeek1Merged = new MergedDay();
    private MergedDay fridayWeek1Merged = new MergedDay();
    private MergedDay saturdayWeek1Merged = new MergedDay();
    private MergedDay sundayWeek1Merged = new MergedDay();
    private MergedDay mondayWeek2Merged = new MergedDay();
    private MergedDay tuesdayWeek2Merged = new MergedDay();
    private MergedDay wednesdayWeek2Merged = new MergedDay();
    private MergedDay thursdayWeek2Merged = new MergedDay();
    private MergedDay fridayWeek2Merged = new MergedDay();
    private MergedDay saturdayWeek2Merged = new MergedDay();
    private MergedDay sundayWeek2Merged = new MergedDay();

    /**
     * Saves a new Timetable
     *
     * @param parent
     * @param modal
     * @param timetableDAO
     * @param userStorageDAO
     */
    public EditTimetable(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO,
            Day mondayWeek1, Day tuesdayWeek1, Day wednesdayWeek1, Day thursdayWeek1, Day fridayWeek1, Day saturdayWeek1,
            Day sundayWeek1, Day mondayWeek2, Day tuesdayWeek2, Day wednesdayWeek2, Day thursdayWeek2, Day fridayWeek2,
            Day saturdayWeek2, Day sundayWeek2) {

        super(parent);
        super.setModal(modal);
        this.timetableDAO = timetableDAO;
        this.userDAO = userDAO;
        this.userStorageDAO = userStorageDAO;
        this.setName("Edit Timetable");

        initComponents();

        this.mondayWeek1 = mondayWeek1;
        this.tuesdayWeek1 = tuesdayWeek1;
        this.wednesdayWeek1 = wednesdayWeek1;
        this.thursdayWeek1 = thursdayWeek1;
        this.fridayWeek1 = fridayWeek1;
        this.saturdayWeek1 = saturdayWeek1;
        this.sundayWeek1 = sundayWeek1;
        this.mondayWeek2 = mondayWeek2;
        this.tuesdayWeek2 = tuesdayWeek2;
        this.wednesdayWeek2 = wednesdayWeek2;
        this.thursdayWeek2 = thursdayWeek2;
        this.fridayWeek2 = fridayWeek2;
        this.saturdayWeek2 = saturdayWeek2;
        this.sundayWeek2 = sundayWeek2;

        //set checkbox values 
        mon8w1.setSelected(mondayWeek1.getEightAM());
        mon9w1.setSelected(mondayWeek1.getNineAM());
        mon10w1.setSelected(mondayWeek1.getTenAM());
        mon11w1.setSelected(mondayWeek1.getElevenAM());
        mon12w1.setSelected(mondayWeek1.getTwelvePM());
        mon13w1.setSelected(mondayWeek1.getOnePM());
        mon14w1.setSelected(mondayWeek1.getTwoPM());
        mon15w1.setSelected(mondayWeek1.getThreePM());
        mon16w1.setSelected(mondayWeek1.getFourPM());
        mon17w1.setSelected(mondayWeek1.getFivePM());
        mon18w1.setSelected(mondayWeek1.getSixPM());
        mon19w1.setSelected(mondayWeek1.getSevenPM());
        mon20w1.setSelected(mondayWeek1.getEightPM());
        mon21w1.setSelected(mondayWeek1.getNinePM());

        tue8w1.setSelected(tuesdayWeek1.getEightAM());
        tue9w1.setSelected(tuesdayWeek1.getNineAM());
        tue10w1.setSelected(tuesdayWeek1.getTenAM());
        tue11w1.setSelected(tuesdayWeek1.getElevenAM());
        tue12w1.setSelected(tuesdayWeek1.getTwelvePM());
        tue13w1.setSelected(tuesdayWeek1.getOnePM());
        tue14w1.setSelected(tuesdayWeek1.getTwoPM());
        tue15w1.setSelected(tuesdayWeek1.getThreePM());
        tue16w1.setSelected(tuesdayWeek1.getFourPM());
        tue17w1.setSelected(tuesdayWeek1.getFivePM());
        tue18w1.setSelected(tuesdayWeek1.getSixPM());
        tue19w1.setSelected(tuesdayWeek1.getSevenPM());
        tue20w1.setSelected(tuesdayWeek1.getEightPM());
        tue21w1.setSelected(tuesdayWeek1.getNinePM());

        wed8w1.setSelected(wednesdayWeek1.getEightAM());
        wed9w1.setSelected(wednesdayWeek1.getNineAM());
        wed10w1.setSelected(wednesdayWeek1.getTenAM());
        wed11w1.setSelected(wednesdayWeek1.getElevenAM());
        wed12w1.setSelected(wednesdayWeek1.getTwelvePM());
        wed13w1.setSelected(wednesdayWeek1.getOnePM());
        wed14w1.setSelected(wednesdayWeek1.getTwoPM());
        wed15w1.setSelected(wednesdayWeek1.getThreePM());
        wed16w1.setSelected(wednesdayWeek1.getFourPM());
        wed17w1.setSelected(wednesdayWeek1.getFivePM());
        wed18w1.setSelected(wednesdayWeek1.getSixPM());
        wed19w1.setSelected(wednesdayWeek1.getSevenPM());
        wed20w1.setSelected(wednesdayWeek1.getEightPM());
        wed21w1.setSelected(wednesdayWeek1.getNinePM());

        thu8w1.setSelected(thursdayWeek1.getEightAM());
        thu9w1.setSelected(thursdayWeek1.getNineAM());
        thu10w1.setSelected(thursdayWeek1.getTenAM());
        thu11w1.setSelected(thursdayWeek1.getElevenAM());
        thu12w1.setSelected(thursdayWeek1.getTwelvePM());
        thu13w1.setSelected(thursdayWeek1.getOnePM());
        thu14w1.setSelected(thursdayWeek1.getTwoPM());
        thu15w1.setSelected(thursdayWeek1.getThreePM());
        thu16w1.setSelected(thursdayWeek1.getFourPM());
        thu17w1.setSelected(thursdayWeek1.getFivePM());
        thu18w1.setSelected(thursdayWeek1.getSixPM());
        thu19w1.setSelected(thursdayWeek1.getSevenPM());
        thu20w1.setSelected(thursdayWeek1.getEightPM());
        thu21w1.setSelected(thursdayWeek1.getNinePM());

        fri8w1.setSelected(fridayWeek1.getEightAM());
        fri9w1.setSelected(fridayWeek1.getNineAM());
        fri10w1.setSelected(fridayWeek1.getTenAM());
        fri11w1.setSelected(fridayWeek1.getElevenAM());
        fri12w1.setSelected(fridayWeek1.getTwelvePM());
        fri13w1.setSelected(fridayWeek1.getOnePM());
        fri14w1.setSelected(fridayWeek1.getTwoPM());
        fri15w1.setSelected(fridayWeek1.getThreePM());
        fri16w1.setSelected(fridayWeek1.getFourPM());
        fri17w1.setSelected(fridayWeek1.getFivePM());
        fri18w1.setSelected(fridayWeek1.getSixPM());
        fri19w1.setSelected(fridayWeek1.getSevenPM());
        fri20w1.setSelected(fridayWeek1.getEightPM());
        fri21w1.setSelected(fridayWeek1.getNinePM());

        sat8w1.setSelected(saturdayWeek1.getEightAM());
        sat9w1.setSelected(saturdayWeek1.getNineAM());
        sat10w1.setSelected(saturdayWeek1.getTenAM());
        sat11w1.setSelected(saturdayWeek1.getElevenAM());
        sat12w1.setSelected(saturdayWeek1.getTwelvePM());
        sat13w1.setSelected(saturdayWeek1.getOnePM());
        sat14w1.setSelected(saturdayWeek1.getTwoPM());
        sat15w1.setSelected(saturdayWeek1.getThreePM());
        sat16w1.setSelected(saturdayWeek1.getFourPM());
        sat17w1.setSelected(saturdayWeek1.getFivePM());
        sat18w1.setSelected(saturdayWeek1.getSixPM());
        sat19w1.setSelected(saturdayWeek1.getSevenPM());
        sat20w1.setSelected(saturdayWeek1.getEightPM());
        sat21w1.setSelected(saturdayWeek1.getNinePM());

        sun8w1.setSelected(sundayWeek1.getEightAM());
        sun9w1.setSelected(sundayWeek1.getNineAM());
        sun10w1.setSelected(sundayWeek1.getTenAM());
        sun11w1.setSelected(sundayWeek1.getElevenAM());
        sun12w1.setSelected(sundayWeek1.getTwelvePM());
        sun13w1.setSelected(sundayWeek1.getOnePM());
        sun14w1.setSelected(sundayWeek1.getTwoPM());
        sun15w1.setSelected(sundayWeek1.getThreePM());
        sun16w1.setSelected(sundayWeek1.getFourPM());
        sun17w1.setSelected(sundayWeek1.getFivePM());
        sun18w1.setSelected(sundayWeek1.getSixPM());
        sun19w1.setSelected(sundayWeek1.getSevenPM());
        sun20w1.setSelected(sundayWeek1.getEightPM());
        sun21w1.setSelected(sundayWeek1.getNinePM());

        mon8w2.setSelected(mondayWeek2.getEightAM());
        mon9w2.setSelected(mondayWeek2.getNineAM());
        mon10w2.setSelected(mondayWeek2.getTenAM());
        mon11w2.setSelected(mondayWeek2.getElevenAM());
        mon12w2.setSelected(mondayWeek2.getTwelvePM());
        mon13w2.setSelected(mondayWeek2.getOnePM());
        mon14w2.setSelected(mondayWeek2.getTwoPM());
        mon15w2.setSelected(mondayWeek2.getThreePM());
        mon16w2.setSelected(mondayWeek2.getFourPM());
        mon17w2.setSelected(mondayWeek2.getFivePM());
        mon18w2.setSelected(mondayWeek2.getSixPM());
        mon19w2.setSelected(mondayWeek2.getSevenPM());
        mon20w2.setSelected(mondayWeek2.getEightPM());
        mon21w2.setSelected(mondayWeek2.getNinePM());

        tue8w2.setSelected(tuesdayWeek2.getEightAM());
        tue9w2.setSelected(tuesdayWeek2.getNineAM());
        tue10w2.setSelected(tuesdayWeek2.getTenAM());
        tue11w2.setSelected(tuesdayWeek2.getElevenAM());
        tue12w2.setSelected(tuesdayWeek2.getTwelvePM());
        tue13w2.setSelected(tuesdayWeek2.getOnePM());
        tue14w2.setSelected(tuesdayWeek2.getTwoPM());
        tue15w2.setSelected(tuesdayWeek2.getThreePM());
        tue16w2.setSelected(tuesdayWeek2.getFourPM());
        tue17w2.setSelected(tuesdayWeek2.getFivePM());
        tue18w2.setSelected(tuesdayWeek2.getSixPM());
        tue19w2.setSelected(tuesdayWeek2.getSevenPM());
        tue20w2.setSelected(tuesdayWeek2.getEightPM());
        tue21w2.setSelected(tuesdayWeek2.getNinePM());

        wed8w2.setSelected(wednesdayWeek2.getEightAM());
        wed9w2.setSelected(wednesdayWeek2.getNineAM());
        wed10w2.setSelected(wednesdayWeek2.getTenAM());
        wed11w2.setSelected(wednesdayWeek2.getElevenAM());
        wed12w2.setSelected(wednesdayWeek2.getTwelvePM());
        wed13w2.setSelected(wednesdayWeek2.getOnePM());
        wed14w2.setSelected(wednesdayWeek2.getTwoPM());
        wed15w2.setSelected(wednesdayWeek2.getThreePM());
        wed16w2.setSelected(wednesdayWeek2.getFourPM());
        wed17w2.setSelected(wednesdayWeek2.getFivePM());
        wed18w2.setSelected(wednesdayWeek2.getSixPM());
        wed19w2.setSelected(wednesdayWeek2.getSevenPM());
        wed20w2.setSelected(wednesdayWeek2.getEightPM());
        wed21w2.setSelected(wednesdayWeek2.getNinePM());

        thu8w2.setSelected(thursdayWeek2.getEightAM());
        thu9w2.setSelected(thursdayWeek2.getNineAM());
        thu10w2.setSelected(thursdayWeek2.getTenAM());
        thu11w2.setSelected(thursdayWeek2.getElevenAM());
        thu12w2.setSelected(thursdayWeek2.getTwelvePM());
        thu13w2.setSelected(thursdayWeek2.getOnePM());
        thu14w2.setSelected(thursdayWeek2.getTwoPM());
        thu15w2.setSelected(thursdayWeek2.getThreePM());
        thu16w2.setSelected(thursdayWeek2.getFourPM());
        thu17w2.setSelected(thursdayWeek2.getFivePM());
        thu18w2.setSelected(thursdayWeek2.getSixPM());
        thu19w2.setSelected(thursdayWeek2.getSevenPM());
        thu20w2.setSelected(thursdayWeek2.getEightPM());
        thu21w2.setSelected(thursdayWeek2.getNinePM());

        fri8w2.setSelected(fridayWeek2.getEightAM());
        fri9w2.setSelected(fridayWeek2.getNineAM());
        fri10w2.setSelected(fridayWeek2.getTenAM());
        fri11w2.setSelected(fridayWeek2.getElevenAM());
        fri12w2.setSelected(fridayWeek2.getTwelvePM());
        fri13w2.setSelected(fridayWeek2.getOnePM());
        fri14w2.setSelected(fridayWeek2.getTwoPM());
        fri15w2.setSelected(fridayWeek2.getThreePM());
        fri16w2.setSelected(fridayWeek2.getFourPM());
        fri17w2.setSelected(fridayWeek2.getFivePM());
        fri18w2.setSelected(fridayWeek2.getSixPM());
        fri19w2.setSelected(fridayWeek2.getSevenPM());
        fri20w2.setSelected(fridayWeek2.getEightPM());
        fri21w2.setSelected(fridayWeek2.getNinePM());

        sat8w2.setSelected(saturdayWeek2.getEightAM());
        sat9w2.setSelected(saturdayWeek2.getNineAM());
        sat10w2.setSelected(saturdayWeek2.getTenAM());
        sat11w2.setSelected(saturdayWeek2.getElevenAM());
        sat12w2.setSelected(saturdayWeek2.getTwelvePM());
        sat13w2.setSelected(saturdayWeek2.getOnePM());
        sat14w2.setSelected(saturdayWeek2.getTwoPM());
        sat15w2.setSelected(saturdayWeek2.getThreePM());
        sat16w2.setSelected(saturdayWeek2.getFourPM());
        sat17w2.setSelected(saturdayWeek2.getFivePM());
        sat18w2.setSelected(saturdayWeek2.getSixPM());
        sat19w2.setSelected(saturdayWeek2.getSevenPM());
        sat20w2.setSelected(saturdayWeek2.getEightPM());
        sat21w2.setSelected(saturdayWeek2.getNinePM());

        sun8w2.setSelected(sundayWeek2.getEightAM());
        sun9w2.setSelected(sundayWeek2.getNineAM());
        sun10w2.setSelected(sundayWeek2.getTenAM());
        sun11w2.setSelected(sundayWeek2.getElevenAM());
        sun12w2.setSelected(sundayWeek2.getTwelvePM());
        sun13w2.setSelected(sundayWeek2.getOnePM());
        sun14w2.setSelected(sundayWeek2.getTwoPM());
        sun15w2.setSelected(sundayWeek2.getThreePM());
        sun16w2.setSelected(sundayWeek2.getFourPM());
        sun17w2.setSelected(sundayWeek2.getFivePM());
        sun18w2.setSelected(sundayWeek2.getSixPM());
        sun19w2.setSelected(sundayWeek2.getSevenPM());
        sun20w2.setSelected(sundayWeek2.getEightPM());
        sun21w2.setSelected(sundayWeek2.getNinePM());

        /**add to ArrayList
        weekDays1.add(mon8w1);
        weekDays1.add(mon9w1);
        weekDays1.add(mon10w1);
        weekDays1.add(mon11w1);
        weekDays1.add(mon12w1);
        weekDays1.add(mon13w1);
        weekDays1.add(mon14w1);
        weekDays1.add(mon15w1);
        weekDays1.add(mon16w1);
        weekDays1.add(mon17w1);
        weekDays1.add(mon18w1);
        weekDays1.add(mon19w1);
        weekDays1.add(mon20w1);
        weekDays1.add(mon21w1);

        weekDays1.add(tue8w1);
        weekDays1.add(tue9w1);
        weekDays1.add(tue10w1);
        weekDays1.add(tue11w1);
        weekDays1.add(tue12w1);
        weekDays1.add(tue13w1);
        weekDays1.add(tue14w1);
        weekDays1.add(tue15w1);
        weekDays1.add(tue16w1);
        weekDays1.add(tue17w1);
        weekDays1.add(tue18w1);
        weekDays1.add(tue19w1);
        weekDays1.add(tue20w1);
        weekDays1.add(tue21w1);

        weekDays1.add(wed8w1);
        weekDays1.add(wed9w1);
        weekDays1.add(wed10w1);
        weekDays1.add(wed11w1);
        weekDays1.add(wed12w1);
        weekDays1.add(wed13w1);
        weekDays1.add(wed14w1);
        weekDays1.add(wed15w1);
        weekDays1.add(wed16w1);
        weekDays1.add(wed17w1);
        weekDays1.add(wed18w1);
        weekDays1.add(wed19w1);
        weekDays1.add(wed20w1);
        weekDays1.add(wed21w1);

        weekDays1.add(thu8w1);
        weekDays1.add(thu9w1);
        weekDays1.add(thu10w1);
        weekDays1.add(thu11w1);
        weekDays1.add(thu12w1);
        weekDays1.add(thu13w1);
        weekDays1.add(thu14w1);
        weekDays1.add(thu15w1);
        weekDays1.add(thu16w1);
        weekDays1.add(thu17w1);
        weekDays1.add(thu18w1);
        weekDays1.add(thu19w1);
        weekDays1.add(thu20w1);
        weekDays1.add(thu21w1);

        weekDays1.add(fri8w1);
        weekDays1.add(fri9w1);
        weekDays1.add(fri10w1);
        weekDays1.add(fri11w1);
        weekDays1.add(fri12w1);
        weekDays1.add(fri13w1);
        weekDays1.add(fri14w1);
        weekDays1.add(fri15w1);
        weekDays1.add(fri16w1);
        weekDays1.add(fri17w1);
        weekDays1.add(fri18w1);
        weekDays1.add(fri19w1);
        weekDays1.add(fri20w1);
        weekDays1.add(fri21w1);

        weekDays1.add(sat8w1);
        weekDays1.add(sat9w1);
        weekDays1.add(sat10w1);
        weekDays1.add(sat11w1);
        weekDays1.add(sat12w1);
        weekDays1.add(sat13w1);
        weekDays1.add(sat14w1);
        weekDays1.add(sat15w1);
        weekDays1.add(sat16w1);
        weekDays1.add(sat17w1);
        weekDays1.add(sat18w1);
        weekDays1.add(sat19w1);
        weekDays1.add(sat20w1);
        weekDays1.add(sat21w1);

        weekDays1.add(sun8w1);
        weekDays1.add(sun9w1);
        weekDays1.add(sun10w1);
        weekDays1.add(sun11w1);
        weekDays1.add(sun12w1);
        weekDays1.add(sun13w1);
        weekDays1.add(sun14w1);
        weekDays1.add(sun15w1);
        weekDays1.add(sun16w1);
        weekDays1.add(sun17w1);
        weekDays1.add(sun18w1);
        weekDays1.add(sun19w1);
        weekDays1.add(sun20w1);
        weekDays1.add(sun21w1);

        weekDays2.add(mon8w2);
        weekDays2.add(mon9w2);
        weekDays2.add(mon10w2);
        weekDays2.add(mon11w2);
        weekDays2.add(mon12w2);
        weekDays2.add(mon13w2);
        weekDays2.add(mon14w2);
        weekDays2.add(mon15w2);
        weekDays2.add(mon16w2);
        weekDays2.add(mon17w2);
        weekDays2.add(mon18w2);
        weekDays2.add(mon19w2);
        weekDays2.add(mon20w2);
        weekDays2.add(mon21w2);

        weekDays2.add(tue8w2);
        weekDays2.add(tue9w2);
        weekDays2.add(tue10w2);
        weekDays2.add(tue11w2);
        weekDays2.add(tue12w2);
        weekDays2.add(tue13w2);
        weekDays2.add(tue14w2);
        weekDays2.add(tue15w2);
        weekDays2.add(tue16w2);
        weekDays2.add(tue17w2);
        weekDays2.add(tue18w2);
        weekDays2.add(tue19w2);
        weekDays2.add(tue20w2);
        weekDays2.add(tue21w2);

        weekDays2.add(wed8w2);
        weekDays2.add(wed9w2);
        weekDays2.add(wed10w2);
        weekDays2.add(wed11w2);
        weekDays2.add(wed12w2);
        weekDays2.add(wed13w2);
        weekDays2.add(wed14w2);
        weekDays2.add(wed15w2);
        weekDays2.add(wed16w2);
        weekDays2.add(wed17w2);
        weekDays2.add(wed18w2);
        weekDays2.add(wed19w2);
        weekDays2.add(wed20w2);
        weekDays2.add(wed21w2);

        weekDays2.add(thu8w2);
        weekDays2.add(thu9w2);
        weekDays2.add(thu10w2);
        weekDays2.add(thu11w2);
        weekDays2.add(thu12w2);
        weekDays2.add(thu13w2);
        weekDays2.add(thu14w2);
        weekDays2.add(thu15w2);
        weekDays2.add(thu16w2);
        weekDays2.add(thu17w2);
        weekDays2.add(thu18w2);
        weekDays2.add(thu19w2);
        weekDays2.add(thu20w2);
        weekDays2.add(thu21w2);

        weekDays2.add(fri8w2);
        weekDays2.add(fri9w2);
        weekDays2.add(fri10w2);
        weekDays2.add(fri11w2);
        weekDays2.add(fri12w2);
        weekDays2.add(fri13w2);
        weekDays2.add(fri14w2);
        weekDays2.add(fri15w2);
        weekDays2.add(fri16w2);
        weekDays2.add(fri17w2);
        weekDays2.add(fri18w2);
        weekDays2.add(fri19w2);
        weekDays2.add(fri20w2);
        weekDays2.add(fri21w2);

        weekDays2.add(sat8w2);
        weekDays2.add(sat9w2);
        weekDays2.add(sat10w2);
        weekDays2.add(sat11w2);
        weekDays2.add(sat12w2);
        weekDays2.add(sat13w2);
        weekDays2.add(sat14w2);
        weekDays2.add(sat15w2);
        weekDays2.add(sat16w2);
        weekDays2.add(sat17w2);
        weekDays2.add(sat18w2);
        weekDays2.add(sat19w2);
        weekDays2.add(sat20w2);
        weekDays2.add(sat21w2);

        weekDays2.add(sun8w2);
        weekDays2.add(sun9w2);
        weekDays2.add(sun10w2);
        weekDays2.add(sun11w2);
        weekDays2.add(sun12w2);
        weekDays2.add(sun13w2);
        weekDays2.add(sun14w2);
        weekDays2.add(sun15w2);
        weekDays2.add(sun16w2);
        weekDays2.add(sun17w2);
        weekDays2.add(sun18w2);
        weekDays2.add(sun19w2);
        weekDays2.add(sun20w2);
        weekDays2.add(sun21w2);
		  */
    }

    public EditTimetable(Window parent, boolean modal, TimetableDAO timetableDAO, UserDAO userDAO, UserStorageDAO userStorageDAO,
            MergedDay mondayWeek1, MergedDay tuesdayWeek1, MergedDay wednesdayWeek1, MergedDay thursdayWeek1, MergedDay fridayWeek1, MergedDay saturdayWeek1,
            MergedDay sundayWeek1, MergedDay mondayWeek2, MergedDay tuesdayWeek2, MergedDay wednesdayWeek2, MergedDay thursdayWeek2, MergedDay fridayWeek2,
            MergedDay saturdayWeek2, MergedDay sundayWeek2) {

        super(parent);
        super.setModal(modal);
        this.timetableDAO = timetableDAO;
        this.userDAO = userDAO;
        this.userStorageDAO = userStorageDAO;
        this.setName("Edit Timetable");

        initComponents();

        this.mondayWeek1Merged = mondayWeek1;
        this.tuesdayWeek1Merged = tuesdayWeek1;
        this.wednesdayWeek1Merged = wednesdayWeek1;
        this.thursdayWeek1Merged = thursdayWeek1;
        this.fridayWeek1Merged = fridayWeek1;
        this.saturdayWeek1Merged = saturdayWeek1;
        this.sundayWeek1Merged = sundayWeek1;
        this.mondayWeek2Merged = mondayWeek2;
        this.tuesdayWeek2Merged = tuesdayWeek2;
        this.wednesdayWeek2Merged = wednesdayWeek2;
        this.thursdayWeek2Merged = thursdayWeek2;
        this.fridayWeek2Merged = fridayWeek2;
        this.saturdayWeek2Merged = saturdayWeek2;
        this.sundayWeek2Merged = sundayWeek2;

        //set checkbox values 
        mon8w1.setSelected(mondayWeek1.getEightAM());
        mon9w1.setSelected(mondayWeek1.getNineAM());
        mon10w1.setSelected(mondayWeek1.getTenAM());
        mon11w1.setSelected(mondayWeek1.getElevenAM());
        mon12w1.setSelected(mondayWeek1.getTwelvePM());
        mon13w1.setSelected(mondayWeek1.getOnePM());
        mon14w1.setSelected(mondayWeek1.getTwoPM());
        mon15w1.setSelected(mondayWeek1.getThreePM());
        mon16w1.setSelected(mondayWeek1.getFourPM());
        mon17w1.setSelected(mondayWeek1.getFivePM());
        mon18w1.setSelected(mondayWeek1.getSixPM());
        mon19w1.setSelected(mondayWeek1.getSevenPM());
        mon20w1.setSelected(mondayWeek1.getEightPM());
        mon21w1.setSelected(mondayWeek1.getNinePM());

        tue8w1.setSelected(tuesdayWeek1.getEightAM());
        tue9w1.setSelected(tuesdayWeek1.getNineAM());
        tue10w1.setSelected(tuesdayWeek1.getTenAM());
        tue11w1.setSelected(tuesdayWeek1.getElevenAM());
        tue12w1.setSelected(tuesdayWeek1.getTwelvePM());
        tue13w1.setSelected(tuesdayWeek1.getOnePM());
        tue14w1.setSelected(tuesdayWeek1.getTwoPM());
        tue15w1.setSelected(tuesdayWeek1.getThreePM());
        tue16w1.setSelected(tuesdayWeek1.getFourPM());
        tue17w1.setSelected(tuesdayWeek1.getFivePM());
        tue18w1.setSelected(tuesdayWeek1.getSixPM());
        tue19w1.setSelected(tuesdayWeek1.getSevenPM());
        tue20w1.setSelected(tuesdayWeek1.getEightPM());
        tue21w1.setSelected(tuesdayWeek1.getNinePM());

        wed8w1.setSelected(wednesdayWeek1.getEightAM());
        wed9w1.setSelected(wednesdayWeek1.getNineAM());
        wed10w1.setSelected(wednesdayWeek1.getTenAM());
        wed11w1.setSelected(wednesdayWeek1.getElevenAM());
        wed12w1.setSelected(wednesdayWeek1.getTwelvePM());
        wed13w1.setSelected(wednesdayWeek1.getOnePM());
        wed14w1.setSelected(wednesdayWeek1.getTwoPM());
        wed15w1.setSelected(wednesdayWeek1.getThreePM());
        wed16w1.setSelected(wednesdayWeek1.getFourPM());
        wed17w1.setSelected(wednesdayWeek1.getFivePM());
        wed18w1.setSelected(wednesdayWeek1.getSixPM());
        wed19w1.setSelected(wednesdayWeek1.getSevenPM());
        wed20w1.setSelected(wednesdayWeek1.getEightPM());
        wed21w1.setSelected(wednesdayWeek1.getNinePM());

        thu8w1.setSelected(thursdayWeek1.getEightAM());
        thu9w1.setSelected(thursdayWeek1.getNineAM());
        thu10w1.setSelected(thursdayWeek1.getTenAM());
        thu11w1.setSelected(thursdayWeek1.getElevenAM());
        thu12w1.setSelected(thursdayWeek1.getTwelvePM());
        thu13w1.setSelected(thursdayWeek1.getOnePM());
        thu14w1.setSelected(thursdayWeek1.getTwoPM());
        thu15w1.setSelected(thursdayWeek1.getThreePM());
        thu16w1.setSelected(thursdayWeek1.getFourPM());
        thu17w1.setSelected(thursdayWeek1.getFivePM());
        thu18w1.setSelected(thursdayWeek1.getSixPM());
        thu19w1.setSelected(thursdayWeek1.getSevenPM());
        thu20w1.setSelected(thursdayWeek1.getEightPM());
        thu21w1.setSelected(thursdayWeek1.getNinePM());

        fri8w1.setSelected(fridayWeek1.getEightAM());
        fri9w1.setSelected(fridayWeek1.getNineAM());
        fri10w1.setSelected(fridayWeek1.getTenAM());
        fri11w1.setSelected(fridayWeek1.getElevenAM());
        fri12w1.setSelected(fridayWeek1.getTwelvePM());
        fri13w1.setSelected(fridayWeek1.getOnePM());
        fri14w1.setSelected(fridayWeek1.getTwoPM());
        fri15w1.setSelected(fridayWeek1.getThreePM());
        fri16w1.setSelected(fridayWeek1.getFourPM());
        fri17w1.setSelected(fridayWeek1.getFivePM());
        fri18w1.setSelected(fridayWeek1.getSixPM());
        fri19w1.setSelected(fridayWeek1.getSevenPM());
        fri20w1.setSelected(fridayWeek1.getEightPM());
        fri21w1.setSelected(fridayWeek1.getNinePM());

        sat8w1.setSelected(saturdayWeek1.getEightAM());
        sat9w1.setSelected(saturdayWeek1.getNineAM());
        sat10w1.setSelected(saturdayWeek1.getTenAM());
        sat11w1.setSelected(saturdayWeek1.getElevenAM());
        sat12w1.setSelected(saturdayWeek1.getTwelvePM());
        sat13w1.setSelected(saturdayWeek1.getOnePM());
        sat14w1.setSelected(saturdayWeek1.getTwoPM());
        sat15w1.setSelected(saturdayWeek1.getThreePM());
        sat16w1.setSelected(saturdayWeek1.getFourPM());
        sat17w1.setSelected(saturdayWeek1.getFivePM());
        sat18w1.setSelected(saturdayWeek1.getSixPM());
        sat19w1.setSelected(saturdayWeek1.getSevenPM());
        sat20w1.setSelected(saturdayWeek1.getEightPM());
        sat21w1.setSelected(saturdayWeek1.getNinePM());

        sun8w1.setSelected(sundayWeek1.getEightAM());
        sun9w1.setSelected(sundayWeek1.getNineAM());
        sun10w1.setSelected(sundayWeek1.getTenAM());
        sun11w1.setSelected(sundayWeek1.getElevenAM());
        sun12w1.setSelected(sundayWeek1.getTwelvePM());
        sun13w1.setSelected(sundayWeek1.getOnePM());
        sun14w1.setSelected(sundayWeek1.getTwoPM());
        sun15w1.setSelected(sundayWeek1.getThreePM());
        sun16w1.setSelected(sundayWeek1.getFourPM());
        sun17w1.setSelected(sundayWeek1.getFivePM());
        sun18w1.setSelected(sundayWeek1.getSixPM());
        sun19w1.setSelected(sundayWeek1.getSevenPM());
        sun20w1.setSelected(sundayWeek1.getEightPM());
        sun21w1.setSelected(sundayWeek1.getNinePM());

        mon8w2.setSelected(mondayWeek2.getEightAM());
        mon9w2.setSelected(mondayWeek2.getNineAM());
        mon10w2.setSelected(mondayWeek2.getTenAM());
        mon11w2.setSelected(mondayWeek2.getElevenAM());
        mon12w2.setSelected(mondayWeek2.getTwelvePM());
        mon13w2.setSelected(mondayWeek2.getOnePM());
        mon14w2.setSelected(mondayWeek2.getTwoPM());
        mon15w2.setSelected(mondayWeek2.getThreePM());
        mon16w2.setSelected(mondayWeek2.getFourPM());
        mon17w2.setSelected(mondayWeek2.getFivePM());
        mon18w2.setSelected(mondayWeek2.getSixPM());
        mon19w2.setSelected(mondayWeek2.getSevenPM());
        mon20w2.setSelected(mondayWeek2.getEightPM());
        mon21w2.setSelected(mondayWeek2.getNinePM());

        tue8w2.setSelected(tuesdayWeek2.getEightAM());
        tue9w2.setSelected(tuesdayWeek2.getNineAM());
        tue10w2.setSelected(tuesdayWeek2.getTenAM());
        tue11w2.setSelected(tuesdayWeek2.getElevenAM());
        tue12w2.setSelected(tuesdayWeek2.getTwelvePM());
        tue13w2.setSelected(tuesdayWeek2.getOnePM());
        tue14w2.setSelected(tuesdayWeek2.getTwoPM());
        tue15w2.setSelected(tuesdayWeek2.getThreePM());
        tue16w2.setSelected(tuesdayWeek2.getFourPM());
        tue17w2.setSelected(tuesdayWeek2.getFivePM());
        tue18w2.setSelected(tuesdayWeek2.getSixPM());
        tue19w2.setSelected(tuesdayWeek2.getSevenPM());
        tue20w2.setSelected(tuesdayWeek2.getEightPM());
        tue21w2.setSelected(tuesdayWeek2.getNinePM());

        wed8w2.setSelected(wednesdayWeek2.getEightAM());
        wed9w2.setSelected(wednesdayWeek2.getNineAM());
        wed10w2.setSelected(wednesdayWeek2.getTenAM());
        wed11w2.setSelected(wednesdayWeek2.getElevenAM());
        wed12w2.setSelected(wednesdayWeek2.getTwelvePM());
        wed13w2.setSelected(wednesdayWeek2.getOnePM());
        wed14w2.setSelected(wednesdayWeek2.getTwoPM());
        wed15w2.setSelected(wednesdayWeek2.getThreePM());
        wed16w2.setSelected(wednesdayWeek2.getFourPM());
        wed17w2.setSelected(wednesdayWeek2.getFivePM());
        wed18w2.setSelected(wednesdayWeek2.getSixPM());
        wed19w2.setSelected(wednesdayWeek2.getSevenPM());
        wed20w2.setSelected(wednesdayWeek2.getEightPM());
        wed21w2.setSelected(wednesdayWeek2.getNinePM());

        thu8w2.setSelected(thursdayWeek2.getEightAM());
        thu9w2.setSelected(thursdayWeek2.getNineAM());
        thu10w2.setSelected(thursdayWeek2.getTenAM());
        thu11w2.setSelected(thursdayWeek2.getElevenAM());
        thu12w2.setSelected(thursdayWeek2.getTwelvePM());
        thu13w2.setSelected(thursdayWeek2.getOnePM());
        thu14w2.setSelected(thursdayWeek2.getTwoPM());
        thu15w2.setSelected(thursdayWeek2.getThreePM());
        thu16w2.setSelected(thursdayWeek2.getFourPM());
        thu17w2.setSelected(thursdayWeek2.getFivePM());
        thu18w2.setSelected(thursdayWeek2.getSixPM());
        thu19w2.setSelected(thursdayWeek2.getSevenPM());
        thu20w2.setSelected(thursdayWeek2.getEightPM());
        thu21w2.setSelected(thursdayWeek2.getNinePM());

        fri8w2.setSelected(fridayWeek2.getEightAM());
        fri9w2.setSelected(fridayWeek2.getNineAM());
        fri10w2.setSelected(fridayWeek2.getTenAM());
        fri11w2.setSelected(fridayWeek2.getElevenAM());
        fri12w2.setSelected(fridayWeek2.getTwelvePM());
        fri13w2.setSelected(fridayWeek2.getOnePM());
        fri14w2.setSelected(fridayWeek2.getTwoPM());
        fri15w2.setSelected(fridayWeek2.getThreePM());
        fri16w2.setSelected(fridayWeek2.getFourPM());
        fri17w2.setSelected(fridayWeek2.getFivePM());
        fri18w2.setSelected(fridayWeek2.getSixPM());
        fri19w2.setSelected(fridayWeek2.getSevenPM());
        fri20w2.setSelected(fridayWeek2.getEightPM());
        fri21w2.setSelected(fridayWeek2.getNinePM());

        sat8w2.setSelected(saturdayWeek2.getEightAM());
        sat9w2.setSelected(saturdayWeek2.getNineAM());
        sat10w2.setSelected(saturdayWeek2.getTenAM());
        sat11w2.setSelected(saturdayWeek2.getElevenAM());
        sat12w2.setSelected(saturdayWeek2.getTwelvePM());
        sat13w2.setSelected(saturdayWeek2.getOnePM());
        sat14w2.setSelected(saturdayWeek2.getTwoPM());
        sat15w2.setSelected(saturdayWeek2.getThreePM());
        sat16w2.setSelected(saturdayWeek2.getFourPM());
        sat17w2.setSelected(saturdayWeek2.getFivePM());
        sat18w2.setSelected(saturdayWeek2.getSixPM());
        sat19w2.setSelected(saturdayWeek2.getSevenPM());
        sat20w2.setSelected(saturdayWeek2.getEightPM());
        sat21w2.setSelected(saturdayWeek2.getNinePM());

        sun8w2.setSelected(sundayWeek2.getEightAM());
        sun9w2.setSelected(sundayWeek2.getNineAM());
        sun10w2.setSelected(sundayWeek2.getTenAM());
        sun11w2.setSelected(sundayWeek2.getElevenAM());
        sun12w2.setSelected(sundayWeek2.getTwelvePM());
        sun13w2.setSelected(sundayWeek2.getOnePM());
        sun14w2.setSelected(sundayWeek2.getTwoPM());
        sun15w2.setSelected(sundayWeek2.getThreePM());
        sun16w2.setSelected(sundayWeek2.getFourPM());
        sun17w2.setSelected(sundayWeek2.getFivePM());
        sun18w2.setSelected(sundayWeek2.getSixPM());
        sun19w2.setSelected(sundayWeek2.getSevenPM());
        sun20w2.setSelected(sundayWeek2.getEightPM());
        sun21w2.setSelected(sundayWeek2.getNinePM());
    }
	 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      secondaryPanel = new javax.swing.JPanel();
      week1Panel = new javax.swing.JPanel();
      week1Label = new javax.swing.JLabel();
      week2Panel = new javax.swing.JPanel();
      week2Label = new javax.swing.JLabel();
      mainPanel = new javax.swing.JPanel();
      week1 = new javax.swing.JPanel();
      mon8w1 = new javax.swing.JCheckBox();
      tue8w1 = new javax.swing.JCheckBox();
      wed8w1 = new javax.swing.JCheckBox();
      thu8w1 = new javax.swing.JCheckBox();
      fri8w1 = new javax.swing.JCheckBox();
      sat8w1 = new javax.swing.JCheckBox();
      sun8w1 = new javax.swing.JCheckBox();
      mon9w1 = new javax.swing.JCheckBox();
      tue9w1 = new javax.swing.JCheckBox();
      wed9w1 = new javax.swing.JCheckBox();
      thu9w1 = new javax.swing.JCheckBox();
      fri9w1 = new javax.swing.JCheckBox();
      sat9w1 = new javax.swing.JCheckBox();
      sun9w1 = new javax.swing.JCheckBox();
      mon10w1 = new javax.swing.JCheckBox();
      tue10w1 = new javax.swing.JCheckBox();
      wed10w1 = new javax.swing.JCheckBox();
      thu10w1 = new javax.swing.JCheckBox();
      fri10w1 = new javax.swing.JCheckBox();
      sat10w1 = new javax.swing.JCheckBox();
      sun10w1 = new javax.swing.JCheckBox();
      mon11w1 = new javax.swing.JCheckBox();
      tue11w1 = new javax.swing.JCheckBox();
      wed11w1 = new javax.swing.JCheckBox();
      thu11w1 = new javax.swing.JCheckBox();
      fri11w1 = new javax.swing.JCheckBox();
      sat11w1 = new javax.swing.JCheckBox();
      sun11w1 = new javax.swing.JCheckBox();
      mon12w1 = new javax.swing.JCheckBox();
      tue12w1 = new javax.swing.JCheckBox();
      wed12w1 = new javax.swing.JCheckBox();
      thu12w1 = new javax.swing.JCheckBox();
      fri12w1 = new javax.swing.JCheckBox();
      sat12w1 = new javax.swing.JCheckBox();
      sun12w1 = new javax.swing.JCheckBox();
      mon13w1 = new javax.swing.JCheckBox();
      tue13w1 = new javax.swing.JCheckBox();
      wed13w1 = new javax.swing.JCheckBox();
      thu13w1 = new javax.swing.JCheckBox();
      fri13w1 = new javax.swing.JCheckBox();
      sat13w1 = new javax.swing.JCheckBox();
      sun13w1 = new javax.swing.JCheckBox();
      mon14w1 = new javax.swing.JCheckBox();
      tue14w1 = new javax.swing.JCheckBox();
      wed14w1 = new javax.swing.JCheckBox();
      thu14w1 = new javax.swing.JCheckBox();
      fri14w1 = new javax.swing.JCheckBox();
      sat14w1 = new javax.swing.JCheckBox();
      sun14w1 = new javax.swing.JCheckBox();
      mon15w1 = new javax.swing.JCheckBox();
      tue15w1 = new javax.swing.JCheckBox();
      wed15w1 = new javax.swing.JCheckBox();
      thu15w1 = new javax.swing.JCheckBox();
      fri15w1 = new javax.swing.JCheckBox();
      sat15w1 = new javax.swing.JCheckBox();
      sun15w1 = new javax.swing.JCheckBox();
      mon16w1 = new javax.swing.JCheckBox();
      tue16w1 = new javax.swing.JCheckBox();
      wed16w1 = new javax.swing.JCheckBox();
      thu16w1 = new javax.swing.JCheckBox();
      fri16w1 = new javax.swing.JCheckBox();
      sat16w1 = new javax.swing.JCheckBox();
      sun16w1 = new javax.swing.JCheckBox();
      mon17w1 = new javax.swing.JCheckBox();
      tue17w1 = new javax.swing.JCheckBox();
      wed17w1 = new javax.swing.JCheckBox();
      thu17w1 = new javax.swing.JCheckBox();
      fri17w1 = new javax.swing.JCheckBox();
      sat17w1 = new javax.swing.JCheckBox();
      sun17w1 = new javax.swing.JCheckBox();
      mon18w1 = new javax.swing.JCheckBox();
      tue18w1 = new javax.swing.JCheckBox();
      wed18w1 = new javax.swing.JCheckBox();
      thu18w1 = new javax.swing.JCheckBox();
      fri18w1 = new javax.swing.JCheckBox();
      sat18w1 = new javax.swing.JCheckBox();
      sun18w1 = new javax.swing.JCheckBox();
      mon19w1 = new javax.swing.JCheckBox();
      tue19w1 = new javax.swing.JCheckBox();
      wed19w1 = new javax.swing.JCheckBox();
      thu19w1 = new javax.swing.JCheckBox();
      fri19w1 = new javax.swing.JCheckBox();
      sat19w1 = new javax.swing.JCheckBox();
      sun19w1 = new javax.swing.JCheckBox();
      mon20w1 = new javax.swing.JCheckBox();
      tue20w1 = new javax.swing.JCheckBox();
      wed20w1 = new javax.swing.JCheckBox();
      thu20w1 = new javax.swing.JCheckBox();
      fri20w1 = new javax.swing.JCheckBox();
      sat20w1 = new javax.swing.JCheckBox();
      sun20w1 = new javax.swing.JCheckBox();
      mon21w1 = new javax.swing.JCheckBox();
      tue21w1 = new javax.swing.JCheckBox();
      wed21w1 = new javax.swing.JCheckBox();
      thu21w1 = new javax.swing.JCheckBox();
      fri21w1 = new javax.swing.JCheckBox();
      sat21w1 = new javax.swing.JCheckBox();
      sun21w1 = new javax.swing.JCheckBox();
      timetableImage1 = new javax.swing.JLabel();
      week2 = new javax.swing.JPanel();
      mon8w2 = new javax.swing.JCheckBox();
      tue8w2 = new javax.swing.JCheckBox();
      wed8w2 = new javax.swing.JCheckBox();
      thu8w2 = new javax.swing.JCheckBox();
      fri8w2 = new javax.swing.JCheckBox();
      sat8w2 = new javax.swing.JCheckBox();
      sun8w2 = new javax.swing.JCheckBox();
      mon9w2 = new javax.swing.JCheckBox();
      tue9w2 = new javax.swing.JCheckBox();
      wed9w2 = new javax.swing.JCheckBox();
      thu9w2 = new javax.swing.JCheckBox();
      fri9w2 = new javax.swing.JCheckBox();
      sat9w2 = new javax.swing.JCheckBox();
      sun9w2 = new javax.swing.JCheckBox();
      mon10w2 = new javax.swing.JCheckBox();
      tue10w2 = new javax.swing.JCheckBox();
      wed10w2 = new javax.swing.JCheckBox();
      thu10w2 = new javax.swing.JCheckBox();
      fri10w2 = new javax.swing.JCheckBox();
      sat10w2 = new javax.swing.JCheckBox();
      sun10w2 = new javax.swing.JCheckBox();
      mon11w2 = new javax.swing.JCheckBox();
      tue11w2 = new javax.swing.JCheckBox();
      wed11w2 = new javax.swing.JCheckBox();
      thu11w2 = new javax.swing.JCheckBox();
      fri11w2 = new javax.swing.JCheckBox();
      sat11w2 = new javax.swing.JCheckBox();
      sun11w2 = new javax.swing.JCheckBox();
      mon12w2 = new javax.swing.JCheckBox();
      tue12w2 = new javax.swing.JCheckBox();
      wed12w2 = new javax.swing.JCheckBox();
      thu12w2 = new javax.swing.JCheckBox();
      fri12w2 = new javax.swing.JCheckBox();
      sat12w2 = new javax.swing.JCheckBox();
      sun12w2 = new javax.swing.JCheckBox();
      mon13w2 = new javax.swing.JCheckBox();
      tue13w2 = new javax.swing.JCheckBox();
      wed13w2 = new javax.swing.JCheckBox();
      thu13w2 = new javax.swing.JCheckBox();
      fri13w2 = new javax.swing.JCheckBox();
      sat13w2 = new javax.swing.JCheckBox();
      sun13w2 = new javax.swing.JCheckBox();
      mon14w2 = new javax.swing.JCheckBox();
      tue14w2 = new javax.swing.JCheckBox();
      wed14w2 = new javax.swing.JCheckBox();
      thu14w2 = new javax.swing.JCheckBox();
      fri14w2 = new javax.swing.JCheckBox();
      sat14w2 = new javax.swing.JCheckBox();
      sun14w2 = new javax.swing.JCheckBox();
      mon15w2 = new javax.swing.JCheckBox();
      tue15w2 = new javax.swing.JCheckBox();
      wed15w2 = new javax.swing.JCheckBox();
      thu15w2 = new javax.swing.JCheckBox();
      fri15w2 = new javax.swing.JCheckBox();
      sat15w2 = new javax.swing.JCheckBox();
      sun15w2 = new javax.swing.JCheckBox();
      mon16w2 = new javax.swing.JCheckBox();
      tue16w2 = new javax.swing.JCheckBox();
      wed16w2 = new javax.swing.JCheckBox();
      thu16w2 = new javax.swing.JCheckBox();
      fri16w2 = new javax.swing.JCheckBox();
      sat16w2 = new javax.swing.JCheckBox();
      sun16w2 = new javax.swing.JCheckBox();
      mon17w2 = new javax.swing.JCheckBox();
      tue17w2 = new javax.swing.JCheckBox();
      wed17w2 = new javax.swing.JCheckBox();
      thu17w2 = new javax.swing.JCheckBox();
      fri17w2 = new javax.swing.JCheckBox();
      sat17w2 = new javax.swing.JCheckBox();
      sun17w2 = new javax.swing.JCheckBox();
      mon18w2 = new javax.swing.JCheckBox();
      tue18w2 = new javax.swing.JCheckBox();
      wed18w2 = new javax.swing.JCheckBox();
      thu18w2 = new javax.swing.JCheckBox();
      fri18w2 = new javax.swing.JCheckBox();
      sat18w2 = new javax.swing.JCheckBox();
      sun18w2 = new javax.swing.JCheckBox();
      mon19w2 = new javax.swing.JCheckBox();
      tue19w2 = new javax.swing.JCheckBox();
      wed19w2 = new javax.swing.JCheckBox();
      thu19w2 = new javax.swing.JCheckBox();
      fri19w2 = new javax.swing.JCheckBox();
      sat19w2 = new javax.swing.JCheckBox();
      sun19w2 = new javax.swing.JCheckBox();
      mon20w2 = new javax.swing.JCheckBox();
      tue20w2 = new javax.swing.JCheckBox();
      wed20w2 = new javax.swing.JCheckBox();
      thu20w2 = new javax.swing.JCheckBox();
      fri20w2 = new javax.swing.JCheckBox();
      sat20w2 = new javax.swing.JCheckBox();
      sun20w2 = new javax.swing.JCheckBox();
      mon21w2 = new javax.swing.JCheckBox();
      tue21w2 = new javax.swing.JCheckBox();
      wed21w2 = new javax.swing.JCheckBox();
      thu21w2 = new javax.swing.JCheckBox();
      fri21w2 = new javax.swing.JCheckBox();
      sat21w2 = new javax.swing.JCheckBox();
      sun21w2 = new javax.swing.JCheckBox();
      timetableImage2 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      switchButton = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      titleLabel = new javax.swing.JLabel();
      buttonCancel = new javax.swing.JButton();
      buttonSaveTimetable = new javax.swing.JButton();

      getContentPane().setLayout(null);

      secondaryPanel.setBackground(new java.awt.Color(255, 255, 255));
      secondaryPanel.setName("secondaryPanel"); // NOI18N
      secondaryPanel.setLayout(new java.awt.CardLayout());

      week1Panel.setBackground(new java.awt.Color(255, 255, 255));
      week1Panel.setName("week1Panel"); // NOI18N

      week1Label.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
      week1Label.setText("Week 1");
      week1Label.setName("week1Label"); // NOI18N

      javax.swing.GroupLayout week1PanelLayout = new javax.swing.GroupLayout(week1Panel);
      week1Panel.setLayout(week1PanelLayout);
      week1PanelLayout.setHorizontalGroup(
         week1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, week1PanelLayout.createSequentialGroup()
            .addGap(0, 286, Short.MAX_VALUE)
            .addComponent(week1Label))
      );
      week1PanelLayout.setVerticalGroup(
         week1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(week1PanelLayout.createSequentialGroup()
            .addComponent(week1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
            .addContainerGap())
      );

      secondaryPanel.add(week1Panel, "card2");

      week2Panel.setBackground(new java.awt.Color(255, 255, 255));
      week2Panel.setName("week2Panel"); // NOI18N
      week2Panel.setPreferredSize(new java.awt.Dimension(470, 48));

      week2Label.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
      week2Label.setText("Week 2");
      week2Label.setName("week2Label"); // NOI18N

      javax.swing.GroupLayout week2PanelLayout = new javax.swing.GroupLayout(week2Panel);
      week2Panel.setLayout(week2PanelLayout);
      week2PanelLayout.setHorizontalGroup(
         week2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, week2PanelLayout.createSequentialGroup()
            .addGap(0, 286, Short.MAX_VALUE)
            .addComponent(week2Label))
      );
      week2PanelLayout.setVerticalGroup(
         week2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(week2PanelLayout.createSequentialGroup()
            .addComponent(week2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
            .addContainerGap())
      );

      secondaryPanel.add(week2Panel, "card3");

      getContentPane().add(secondaryPanel);
      secondaryPanel.setBounds(0, 75, 380, 36);

      mainPanel.setName("mainPanel"); // NOI18N
      mainPanel.setLayout(new java.awt.CardLayout());

      week1.setBackground(new java.awt.Color(255, 255, 255));
      week1.setName("week1"); // NOI18N
      week1.setLayout(null);

      mon8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon8w1.setBorderPainted(true);
      mon8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon8w1.setIconTextGap(0);
      mon8w1.setName("mon8w1"); // NOI18N
      mon8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon8w1ActionPerformed(evt);
         }
      });
      week1.add(mon8w1);
      mon8w1.setBounds(70, 46, 88, 34);

      tue8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue8w1.setBorderPainted(true);
      tue8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue8w1.setIconTextGap(0);
      tue8w1.setName("tue8w1"); // NOI18N
      tue8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue8w1ActionPerformed(evt);
         }
      });
      week1.add(tue8w1);
      tue8w1.setBounds(158, 46, 88, 34);

      wed8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed8w1.setBorderPainted(true);
      wed8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed8w1.setIconTextGap(0);
      wed8w1.setName("wed8w1"); // NOI18N
      wed8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed8w1ActionPerformed(evt);
         }
      });
      week1.add(wed8w1);
      wed8w1.setBounds(246, 46, 88, 34);

      thu8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu8w1.setBorderPainted(true);
      thu8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu8w1.setIconTextGap(0);
      thu8w1.setName("thu8w1"); // NOI18N
      thu8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu8w1ActionPerformed(evt);
         }
      });
      week1.add(thu8w1);
      thu8w1.setBounds(334, 46, 88, 34);

      fri8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri8w1.setBorderPainted(true);
      fri8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri8w1.setIconTextGap(0);
      fri8w1.setName("fri8w1"); // NOI18N
      fri8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri8w1ActionPerformed(evt);
         }
      });
      week1.add(fri8w1);
      fri8w1.setBounds(422, 46, 88, 34);

      sat8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat8w1.setBorderPainted(true);
      sat8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat8w1.setIconTextGap(0);
      sat8w1.setName("sat8w1"); // NOI18N
      sat8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat8w1ActionPerformed(evt);
         }
      });
      week1.add(sat8w1);
      sat8w1.setBounds(510, 46, 88, 34);

      sun8w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun8w1.setBorderPainted(true);
      sun8w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun8w1.setIconTextGap(0);
      sun8w1.setName("sun8w1"); // NOI18N
      sun8w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun8w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun8w1ActionPerformed(evt);
         }
      });
      week1.add(sun8w1);
      sun8w1.setBounds(598, 46, 88, 34);

      mon9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon9w1.setBorderPainted(true);
      mon9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon9w1.setIconTextGap(0);
      mon9w1.setName("mon9w1"); // NOI18N
      mon9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon9w1ActionPerformed(evt);
         }
      });
      week1.add(mon9w1);
      mon9w1.setBounds(70, 80, 88, 34);

      tue9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue9w1.setBorderPainted(true);
      tue9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue9w1.setIconTextGap(0);
      tue9w1.setName("tue9w1"); // NOI18N
      tue9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue9w1ActionPerformed(evt);
         }
      });
      week1.add(tue9w1);
      tue9w1.setBounds(158, 80, 88, 34);

      wed9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed9w1.setBorderPainted(true);
      wed9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed9w1.setIconTextGap(0);
      wed9w1.setName("wed9w1"); // NOI18N
      wed9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed9w1ActionPerformed(evt);
         }
      });
      week1.add(wed9w1);
      wed9w1.setBounds(246, 80, 88, 34);

      thu9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu9w1.setBorderPainted(true);
      thu9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu9w1.setIconTextGap(0);
      thu9w1.setName("thu9w1"); // NOI18N
      thu9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu9w1ActionPerformed(evt);
         }
      });
      week1.add(thu9w1);
      thu9w1.setBounds(334, 80, 88, 34);

      fri9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri9w1.setBorderPainted(true);
      fri9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri9w1.setIconTextGap(0);
      fri9w1.setName("fri9w1"); // NOI18N
      fri9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri9w1ActionPerformed(evt);
         }
      });
      week1.add(fri9w1);
      fri9w1.setBounds(422, 80, 88, 34);

      sat9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat9w1.setBorderPainted(true);
      sat9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat9w1.setIconTextGap(0);
      sat9w1.setName("sat9w1"); // NOI18N
      sat9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat9w1ActionPerformed(evt);
         }
      });
      week1.add(sat9w1);
      sat9w1.setBounds(510, 80, 88, 34);

      sun9w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun9w1.setBorderPainted(true);
      sun9w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun9w1.setIconTextGap(0);
      sun9w1.setName("sun9w1"); // NOI18N
      sun9w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun9w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun9w1ActionPerformed(evt);
         }
      });
      week1.add(sun9w1);
      sun9w1.setBounds(598, 80, 88, 34);

      mon10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon10w1.setBorderPainted(true);
      mon10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon10w1.setIconTextGap(0);
      mon10w1.setName("mon10w1"); // NOI18N
      mon10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon10w1ActionPerformed(evt);
         }
      });
      week1.add(mon10w1);
      mon10w1.setBounds(70, 114, 88, 34);

      tue10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue10w1.setBorderPainted(true);
      tue10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue10w1.setIconTextGap(0);
      tue10w1.setName("tue10w1"); // NOI18N
      tue10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue10w1ActionPerformed(evt);
         }
      });
      week1.add(tue10w1);
      tue10w1.setBounds(158, 114, 88, 34);

      wed10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed10w1.setBorderPainted(true);
      wed10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed10w1.setIconTextGap(0);
      wed10w1.setName("wed10w1"); // NOI18N
      wed10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed10w1ActionPerformed(evt);
         }
      });
      week1.add(wed10w1);
      wed10w1.setBounds(246, 114, 88, 34);

      thu10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu10w1.setBorderPainted(true);
      thu10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu10w1.setIconTextGap(0);
      thu10w1.setName("thu10w1"); // NOI18N
      thu10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu10w1ActionPerformed(evt);
         }
      });
      week1.add(thu10w1);
      thu10w1.setBounds(334, 114, 88, 34);

      fri10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri10w1.setBorderPainted(true);
      fri10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri10w1.setIconTextGap(0);
      fri10w1.setName("fri10w1"); // NOI18N
      fri10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri10w1ActionPerformed(evt);
         }
      });
      week1.add(fri10w1);
      fri10w1.setBounds(422, 114, 88, 34);

      sat10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat10w1.setBorderPainted(true);
      sat10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat10w1.setIconTextGap(0);
      sat10w1.setName("sat10w1"); // NOI18N
      sat10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat10w1ActionPerformed(evt);
         }
      });
      week1.add(sat10w1);
      sat10w1.setBounds(510, 114, 88, 34);

      sun10w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun10w1.setBorderPainted(true);
      sun10w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun10w1.setIconTextGap(0);
      sun10w1.setName("sun10w1"); // NOI18N
      sun10w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun10w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun10w1ActionPerformed(evt);
         }
      });
      week1.add(sun10w1);
      sun10w1.setBounds(598, 114, 88, 34);

      mon11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon11w1.setBorderPainted(true);
      mon11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon11w1.setIconTextGap(0);
      mon11w1.setName("mon11w1"); // NOI18N
      mon11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon11w1ActionPerformed(evt);
         }
      });
      week1.add(mon11w1);
      mon11w1.setBounds(70, 148, 88, 34);

      tue11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue11w1.setBorderPainted(true);
      tue11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue11w1.setIconTextGap(0);
      tue11w1.setName("tue11w1"); // NOI18N
      tue11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue11w1ActionPerformed(evt);
         }
      });
      week1.add(tue11w1);
      tue11w1.setBounds(158, 148, 88, 34);

      wed11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed11w1.setBorderPainted(true);
      wed11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed11w1.setIconTextGap(0);
      wed11w1.setName("wed11w1"); // NOI18N
      wed11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed11w1ActionPerformed(evt);
         }
      });
      week1.add(wed11w1);
      wed11w1.setBounds(246, 148, 88, 34);

      thu11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu11w1.setBorderPainted(true);
      thu11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu11w1.setIconTextGap(0);
      thu11w1.setName("thu11w1"); // NOI18N
      thu11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu11w1ActionPerformed(evt);
         }
      });
      week1.add(thu11w1);
      thu11w1.setBounds(334, 148, 88, 34);

      fri11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri11w1.setBorderPainted(true);
      fri11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri11w1.setIconTextGap(0);
      fri11w1.setName("fri11w1"); // NOI18N
      fri11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri11w1ActionPerformed(evt);
         }
      });
      week1.add(fri11w1);
      fri11w1.setBounds(422, 148, 88, 34);

      sat11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat11w1.setBorderPainted(true);
      sat11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat11w1.setIconTextGap(0);
      sat11w1.setName("sat11w1"); // NOI18N
      sat11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat11w1ActionPerformed(evt);
         }
      });
      week1.add(sat11w1);
      sat11w1.setBounds(510, 148, 88, 34);

      sun11w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun11w1.setBorderPainted(true);
      sun11w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun11w1.setIconTextGap(0);
      sun11w1.setName("sun11w1"); // NOI18N
      sun11w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun11w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun11w1ActionPerformed(evt);
         }
      });
      week1.add(sun11w1);
      sun11w1.setBounds(598, 148, 88, 34);

      mon12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon12w1.setBorderPainted(true);
      mon12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon12w1.setIconTextGap(0);
      mon12w1.setName("mon12w1"); // NOI18N
      mon12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon12w1ActionPerformed(evt);
         }
      });
      week1.add(mon12w1);
      mon12w1.setBounds(70, 182, 88, 34);

      tue12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue12w1.setBorderPainted(true);
      tue12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue12w1.setIconTextGap(0);
      tue12w1.setName("tue12w1"); // NOI18N
      tue12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue12w1ActionPerformed(evt);
         }
      });
      week1.add(tue12w1);
      tue12w1.setBounds(158, 182, 88, 34);

      wed12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed12w1.setBorderPainted(true);
      wed12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed12w1.setIconTextGap(0);
      wed12w1.setName("wed12w1"); // NOI18N
      wed12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed12w1ActionPerformed(evt);
         }
      });
      week1.add(wed12w1);
      wed12w1.setBounds(246, 182, 88, 34);

      thu12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu12w1.setBorderPainted(true);
      thu12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu12w1.setIconTextGap(0);
      thu12w1.setName("thu12w1"); // NOI18N
      thu12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu12w1ActionPerformed(evt);
         }
      });
      week1.add(thu12w1);
      thu12w1.setBounds(334, 182, 88, 34);

      fri12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri12w1.setBorderPainted(true);
      fri12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri12w1.setIconTextGap(0);
      fri12w1.setName("fri12w1"); // NOI18N
      fri12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri12w1ActionPerformed(evt);
         }
      });
      week1.add(fri12w1);
      fri12w1.setBounds(422, 182, 88, 34);

      sat12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat12w1.setBorderPainted(true);
      sat12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat12w1.setIconTextGap(0);
      sat12w1.setName("sat12w1"); // NOI18N
      sat12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat12w1ActionPerformed(evt);
         }
      });
      week1.add(sat12w1);
      sat12w1.setBounds(510, 182, 88, 34);

      sun12w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun12w1.setBorderPainted(true);
      sun12w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun12w1.setIconTextGap(0);
      sun12w1.setName("sun12w1"); // NOI18N
      sun12w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun12w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun12w1ActionPerformed(evt);
         }
      });
      week1.add(sun12w1);
      sun12w1.setBounds(598, 182, 88, 34);

      mon13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon13w1.setBorderPainted(true);
      mon13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon13w1.setIconTextGap(0);
      mon13w1.setName("mon13w1"); // NOI18N
      mon13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon13w1ActionPerformed(evt);
         }
      });
      week1.add(mon13w1);
      mon13w1.setBounds(70, 216, 88, 34);

      tue13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue13w1.setBorderPainted(true);
      tue13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue13w1.setIconTextGap(0);
      tue13w1.setName("tue13w1"); // NOI18N
      tue13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue13w1ActionPerformed(evt);
         }
      });
      week1.add(tue13w1);
      tue13w1.setBounds(158, 216, 88, 34);

      wed13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed13w1.setBorderPainted(true);
      wed13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed13w1.setIconTextGap(0);
      wed13w1.setName("wed13w1"); // NOI18N
      wed13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed13w1ActionPerformed(evt);
         }
      });
      week1.add(wed13w1);
      wed13w1.setBounds(246, 216, 88, 34);

      thu13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu13w1.setBorderPainted(true);
      thu13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu13w1.setIconTextGap(0);
      thu13w1.setName("thu13w1"); // NOI18N
      thu13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu13w1ActionPerformed(evt);
         }
      });
      week1.add(thu13w1);
      thu13w1.setBounds(334, 216, 88, 34);

      fri13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri13w1.setBorderPainted(true);
      fri13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri13w1.setIconTextGap(0);
      fri13w1.setName("fri13w1"); // NOI18N
      fri13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri13w1ActionPerformed(evt);
         }
      });
      week1.add(fri13w1);
      fri13w1.setBounds(422, 216, 88, 34);

      sat13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat13w1.setBorderPainted(true);
      sat13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat13w1.setIconTextGap(0);
      sat13w1.setName("sat13w1"); // NOI18N
      sat13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat13w1ActionPerformed(evt);
         }
      });
      week1.add(sat13w1);
      sat13w1.setBounds(510, 216, 88, 34);

      sun13w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun13w1.setBorderPainted(true);
      sun13w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun13w1.setIconTextGap(0);
      sun13w1.setName("sun13w1"); // NOI18N
      sun13w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun13w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun13w1ActionPerformed(evt);
         }
      });
      week1.add(sun13w1);
      sun13w1.setBounds(598, 216, 88, 34);

      mon14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon14w1.setBorderPainted(true);
      mon14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon14w1.setIconTextGap(0);
      mon14w1.setName("mon14w1"); // NOI18N
      mon14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon14w1ActionPerformed(evt);
         }
      });
      week1.add(mon14w1);
      mon14w1.setBounds(70, 250, 88, 34);

      tue14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue14w1.setBorderPainted(true);
      tue14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue14w1.setIconTextGap(0);
      tue14w1.setName("tue14w1"); // NOI18N
      tue14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue14w1ActionPerformed(evt);
         }
      });
      week1.add(tue14w1);
      tue14w1.setBounds(158, 250, 88, 34);

      wed14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed14w1.setBorderPainted(true);
      wed14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed14w1.setIconTextGap(0);
      wed14w1.setName("wed14w1"); // NOI18N
      wed14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed14w1ActionPerformed(evt);
         }
      });
      week1.add(wed14w1);
      wed14w1.setBounds(246, 250, 88, 34);

      thu14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu14w1.setBorderPainted(true);
      thu14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu14w1.setIconTextGap(0);
      thu14w1.setName("thu14w1"); // NOI18N
      thu14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu14w1ActionPerformed(evt);
         }
      });
      week1.add(thu14w1);
      thu14w1.setBounds(334, 250, 88, 34);

      fri14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri14w1.setBorderPainted(true);
      fri14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri14w1.setIconTextGap(0);
      fri14w1.setName("fri14w1"); // NOI18N
      fri14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri14w1ActionPerformed(evt);
         }
      });
      week1.add(fri14w1);
      fri14w1.setBounds(422, 250, 88, 34);

      sat14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat14w1.setBorderPainted(true);
      sat14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat14w1.setIconTextGap(0);
      sat14w1.setName("sat14w1"); // NOI18N
      sat14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat14w1ActionPerformed(evt);
         }
      });
      week1.add(sat14w1);
      sat14w1.setBounds(510, 250, 88, 34);

      sun14w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun14w1.setBorderPainted(true);
      sun14w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun14w1.setIconTextGap(0);
      sun14w1.setName("sun14w1"); // NOI18N
      sun14w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun14w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun14w1ActionPerformed(evt);
         }
      });
      week1.add(sun14w1);
      sun14w1.setBounds(598, 250, 88, 34);

      mon15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon15w1.setBorderPainted(true);
      mon15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon15w1.setIconTextGap(0);
      mon15w1.setName("mon15w1"); // NOI18N
      mon15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon15w1ActionPerformed(evt);
         }
      });
      week1.add(mon15w1);
      mon15w1.setBounds(70, 284, 88, 34);

      tue15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue15w1.setBorderPainted(true);
      tue15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue15w1.setIconTextGap(0);
      tue15w1.setName("tue15w1"); // NOI18N
      tue15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue15w1ActionPerformed(evt);
         }
      });
      week1.add(tue15w1);
      tue15w1.setBounds(158, 284, 88, 34);

      wed15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed15w1.setBorderPainted(true);
      wed15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed15w1.setIconTextGap(0);
      wed15w1.setName("wed15w1"); // NOI18N
      wed15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed15w1ActionPerformed(evt);
         }
      });
      week1.add(wed15w1);
      wed15w1.setBounds(246, 284, 88, 34);

      thu15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu15w1.setBorderPainted(true);
      thu15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu15w1.setIconTextGap(0);
      thu15w1.setName("thu15w1"); // NOI18N
      thu15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu15w1ActionPerformed(evt);
         }
      });
      week1.add(thu15w1);
      thu15w1.setBounds(334, 284, 88, 34);

      fri15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri15w1.setBorderPainted(true);
      fri15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri15w1.setIconTextGap(0);
      fri15w1.setName("fri15w1"); // NOI18N
      fri15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri15w1ActionPerformed(evt);
         }
      });
      week1.add(fri15w1);
      fri15w1.setBounds(422, 284, 88, 34);

      sat15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat15w1.setBorderPainted(true);
      sat15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat15w1.setIconTextGap(0);
      sat15w1.setName("sat15w1"); // NOI18N
      sat15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat15w1ActionPerformed(evt);
         }
      });
      week1.add(sat15w1);
      sat15w1.setBounds(510, 284, 88, 34);

      sun15w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun15w1.setBorderPainted(true);
      sun15w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun15w1.setIconTextGap(0);
      sun15w1.setName("sun15w1"); // NOI18N
      sun15w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun15w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun15w1ActionPerformed(evt);
         }
      });
      week1.add(sun15w1);
      sun15w1.setBounds(598, 284, 88, 34);

      mon16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon16w1.setBorderPainted(true);
      mon16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon16w1.setIconTextGap(0);
      mon16w1.setName("mon16w1"); // NOI18N
      mon16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon16w1ActionPerformed(evt);
         }
      });
      week1.add(mon16w1);
      mon16w1.setBounds(70, 318, 88, 34);

      tue16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue16w1.setBorderPainted(true);
      tue16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue16w1.setIconTextGap(0);
      tue16w1.setName("tue16w1"); // NOI18N
      tue16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue16w1ActionPerformed(evt);
         }
      });
      week1.add(tue16w1);
      tue16w1.setBounds(158, 318, 88, 34);

      wed16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed16w1.setBorderPainted(true);
      wed16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed16w1.setIconTextGap(0);
      wed16w1.setName("wed16w1"); // NOI18N
      wed16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed16w1ActionPerformed(evt);
         }
      });
      week1.add(wed16w1);
      wed16w1.setBounds(246, 318, 88, 34);

      thu16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu16w1.setBorderPainted(true);
      thu16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu16w1.setIconTextGap(0);
      thu16w1.setName("thu16w1"); // NOI18N
      thu16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu16w1ActionPerformed(evt);
         }
      });
      week1.add(thu16w1);
      thu16w1.setBounds(334, 318, 88, 34);

      fri16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri16w1.setBorderPainted(true);
      fri16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri16w1.setIconTextGap(0);
      fri16w1.setName("fri16w1"); // NOI18N
      fri16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri16w1ActionPerformed(evt);
         }
      });
      week1.add(fri16w1);
      fri16w1.setBounds(422, 318, 88, 34);

      sat16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat16w1.setBorderPainted(true);
      sat16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat16w1.setIconTextGap(0);
      sat16w1.setName("sat16w1"); // NOI18N
      sat16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat16w1ActionPerformed(evt);
         }
      });
      week1.add(sat16w1);
      sat16w1.setBounds(510, 318, 88, 34);

      sun16w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun16w1.setBorderPainted(true);
      sun16w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun16w1.setIconTextGap(0);
      sun16w1.setName("sun16w1"); // NOI18N
      sun16w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun16w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun16w1ActionPerformed(evt);
         }
      });
      week1.add(sun16w1);
      sun16w1.setBounds(598, 318, 88, 34);

      mon17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon17w1.setBorderPainted(true);
      mon17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon17w1.setIconTextGap(0);
      mon17w1.setName("mon17w1"); // NOI18N
      mon17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon17w1ActionPerformed(evt);
         }
      });
      week1.add(mon17w1);
      mon17w1.setBounds(70, 352, 88, 34);

      tue17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue17w1.setBorderPainted(true);
      tue17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue17w1.setIconTextGap(0);
      tue17w1.setName("tue17w1"); // NOI18N
      tue17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue17w1ActionPerformed(evt);
         }
      });
      week1.add(tue17w1);
      tue17w1.setBounds(158, 352, 88, 34);

      wed17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed17w1.setBorderPainted(true);
      wed17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed17w1.setIconTextGap(0);
      wed17w1.setName("wed17w1"); // NOI18N
      wed17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed17w1ActionPerformed(evt);
         }
      });
      week1.add(wed17w1);
      wed17w1.setBounds(246, 352, 88, 34);

      thu17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu17w1.setBorderPainted(true);
      thu17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu17w1.setIconTextGap(0);
      thu17w1.setName("thu17w1"); // NOI18N
      thu17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu17w1ActionPerformed(evt);
         }
      });
      week1.add(thu17w1);
      thu17w1.setBounds(334, 352, 88, 34);

      fri17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri17w1.setBorderPainted(true);
      fri17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri17w1.setIconTextGap(0);
      fri17w1.setName("fri17w1"); // NOI18N
      fri17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri17w1ActionPerformed(evt);
         }
      });
      week1.add(fri17w1);
      fri17w1.setBounds(422, 352, 88, 34);

      sat17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat17w1.setBorderPainted(true);
      sat17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat17w1.setIconTextGap(0);
      sat17w1.setName("sat17w1"); // NOI18N
      sat17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat17w1ActionPerformed(evt);
         }
      });
      week1.add(sat17w1);
      sat17w1.setBounds(510, 352, 88, 34);

      sun17w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun17w1.setBorderPainted(true);
      sun17w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun17w1.setIconTextGap(0);
      sun17w1.setName("sun17w1"); // NOI18N
      sun17w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun17w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun17w1ActionPerformed(evt);
         }
      });
      week1.add(sun17w1);
      sun17w1.setBounds(598, 352, 88, 34);

      mon18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon18w1.setBorderPainted(true);
      mon18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon18w1.setIconTextGap(0);
      mon18w1.setName("mon18w1"); // NOI18N
      mon18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon18w1ActionPerformed(evt);
         }
      });
      week1.add(mon18w1);
      mon18w1.setBounds(70, 386, 88, 34);

      tue18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue18w1.setBorderPainted(true);
      tue18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue18w1.setIconTextGap(0);
      tue18w1.setName("tue18w1"); // NOI18N
      tue18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue18w1ActionPerformed(evt);
         }
      });
      week1.add(tue18w1);
      tue18w1.setBounds(158, 386, 88, 34);

      wed18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed18w1.setBorderPainted(true);
      wed18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed18w1.setIconTextGap(0);
      wed18w1.setName("wed18w1"); // NOI18N
      wed18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed18w1ActionPerformed(evt);
         }
      });
      week1.add(wed18w1);
      wed18w1.setBounds(246, 386, 88, 34);

      thu18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu18w1.setBorderPainted(true);
      thu18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu18w1.setIconTextGap(0);
      thu18w1.setName("thu18w1"); // NOI18N
      thu18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu18w1ActionPerformed(evt);
         }
      });
      week1.add(thu18w1);
      thu18w1.setBounds(334, 386, 88, 34);

      fri18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri18w1.setBorderPainted(true);
      fri18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri18w1.setIconTextGap(0);
      fri18w1.setName("fri18w1"); // NOI18N
      fri18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri18w1ActionPerformed(evt);
         }
      });
      week1.add(fri18w1);
      fri18w1.setBounds(422, 386, 88, 34);

      sat18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat18w1.setBorderPainted(true);
      sat18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat18w1.setIconTextGap(0);
      sat18w1.setName("sat18w1"); // NOI18N
      sat18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat18w1ActionPerformed(evt);
         }
      });
      week1.add(sat18w1);
      sat18w1.setBounds(510, 386, 88, 34);

      sun18w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun18w1.setBorderPainted(true);
      sun18w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun18w1.setIconTextGap(0);
      sun18w1.setName("sun18w1"); // NOI18N
      sun18w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun18w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun18w1ActionPerformed(evt);
         }
      });
      week1.add(sun18w1);
      sun18w1.setBounds(598, 386, 88, 34);

      mon19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon19w1.setBorderPainted(true);
      mon19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon19w1.setIconTextGap(0);
      mon19w1.setName("mon19w1"); // NOI18N
      mon19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon19w1ActionPerformed(evt);
         }
      });
      week1.add(mon19w1);
      mon19w1.setBounds(70, 420, 88, 34);

      tue19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue19w1.setBorderPainted(true);
      tue19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue19w1.setIconTextGap(0);
      tue19w1.setName("tue19w1"); // NOI18N
      tue19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue19w1ActionPerformed(evt);
         }
      });
      week1.add(tue19w1);
      tue19w1.setBounds(158, 420, 88, 34);

      wed19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed19w1.setBorderPainted(true);
      wed19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed19w1.setIconTextGap(0);
      wed19w1.setName("wed19w1"); // NOI18N
      wed19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed19w1ActionPerformed(evt);
         }
      });
      week1.add(wed19w1);
      wed19w1.setBounds(246, 420, 88, 34);

      thu19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu19w1.setBorderPainted(true);
      thu19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu19w1.setIconTextGap(0);
      thu19w1.setName("thu19w1"); // NOI18N
      thu19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu19w1ActionPerformed(evt);
         }
      });
      week1.add(thu19w1);
      thu19w1.setBounds(334, 420, 88, 34);

      fri19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri19w1.setBorderPainted(true);
      fri19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri19w1.setIconTextGap(0);
      fri19w1.setName("fri19w1"); // NOI18N
      fri19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri19w1ActionPerformed(evt);
         }
      });
      week1.add(fri19w1);
      fri19w1.setBounds(422, 420, 88, 34);

      sat19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat19w1.setBorderPainted(true);
      sat19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat19w1.setIconTextGap(0);
      sat19w1.setName("sat19w1"); // NOI18N
      sat19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat19w1ActionPerformed(evt);
         }
      });
      week1.add(sat19w1);
      sat19w1.setBounds(510, 420, 88, 34);

      sun19w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun19w1.setBorderPainted(true);
      sun19w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun19w1.setIconTextGap(0);
      sun19w1.setName("sun19w1"); // NOI18N
      sun19w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun19w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun19w1ActionPerformed(evt);
         }
      });
      week1.add(sun19w1);
      sun19w1.setBounds(598, 420, 88, 34);

      mon20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon20w1.setBorderPainted(true);
      mon20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon20w1.setIconTextGap(0);
      mon20w1.setName("mon20w1"); // NOI18N
      mon20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon20w1ActionPerformed(evt);
         }
      });
      week1.add(mon20w1);
      mon20w1.setBounds(70, 454, 88, 34);

      tue20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue20w1.setBorderPainted(true);
      tue20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue20w1.setIconTextGap(0);
      tue20w1.setName("tue20w1"); // NOI18N
      tue20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue20w1ActionPerformed(evt);
         }
      });
      week1.add(tue20w1);
      tue20w1.setBounds(158, 454, 88, 34);

      wed20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed20w1.setBorderPainted(true);
      wed20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed20w1.setIconTextGap(0);
      wed20w1.setName("wed20w1"); // NOI18N
      wed20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed20w1ActionPerformed(evt);
         }
      });
      week1.add(wed20w1);
      wed20w1.setBounds(246, 454, 88, 34);

      thu20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu20w1.setBorderPainted(true);
      thu20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu20w1.setIconTextGap(0);
      thu20w1.setName("thu20w1"); // NOI18N
      thu20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu20w1ActionPerformed(evt);
         }
      });
      week1.add(thu20w1);
      thu20w1.setBounds(334, 454, 88, 34);

      fri20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri20w1.setBorderPainted(true);
      fri20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri20w1.setIconTextGap(0);
      fri20w1.setName("fri20w1"); // NOI18N
      fri20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri20w1ActionPerformed(evt);
         }
      });
      week1.add(fri20w1);
      fri20w1.setBounds(422, 454, 88, 34);

      sat20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat20w1.setBorderPainted(true);
      sat20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat20w1.setIconTextGap(0);
      sat20w1.setName("sat20w1"); // NOI18N
      sat20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat20w1ActionPerformed(evt);
         }
      });
      week1.add(sat20w1);
      sat20w1.setBounds(510, 454, 88, 34);

      sun20w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun20w1.setBorderPainted(true);
      sun20w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun20w1.setIconTextGap(0);
      sun20w1.setName("sun20w1"); // NOI18N
      sun20w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun20w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun20w1ActionPerformed(evt);
         }
      });
      week1.add(sun20w1);
      sun20w1.setBounds(598, 454, 88, 34);

      mon21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon21w1.setBorderPainted(true);
      mon21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon21w1.setIconTextGap(0);
      mon21w1.setName("mon21w1"); // NOI18N
      mon21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon21w1ActionPerformed(evt);
         }
      });
      week1.add(mon21w1);
      mon21w1.setBounds(70, 488, 88, 34);

      tue21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue21w1.setBorderPainted(true);
      tue21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue21w1.setIconTextGap(0);
      tue21w1.setName("tue21w1"); // NOI18N
      tue21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue21w1ActionPerformed(evt);
         }
      });
      week1.add(tue21w1);
      tue21w1.setBounds(158, 488, 88, 34);

      wed21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed21w1.setBorderPainted(true);
      wed21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed21w1.setIconTextGap(0);
      wed21w1.setName("wed21w1"); // NOI18N
      wed21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed21w1ActionPerformed(evt);
         }
      });
      week1.add(wed21w1);
      wed21w1.setBounds(246, 488, 88, 34);

      thu21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu21w1.setBorderPainted(true);
      thu21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu21w1.setIconTextGap(0);
      thu21w1.setName("thu21w1"); // NOI18N
      thu21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu21w1ActionPerformed(evt);
         }
      });
      week1.add(thu21w1);
      thu21w1.setBounds(334, 488, 88, 34);

      fri21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri21w1.setBorderPainted(true);
      fri21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri21w1.setIconTextGap(0);
      fri21w1.setName("fri21w1"); // NOI18N
      fri21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri21w1ActionPerformed(evt);
         }
      });
      week1.add(fri21w1);
      fri21w1.setBounds(422, 488, 88, 34);

      sat21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat21w1.setBorderPainted(true);
      sat21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat21w1.setIconTextGap(0);
      sat21w1.setName("sat21w1"); // NOI18N
      sat21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat21w1ActionPerformed(evt);
         }
      });
      week1.add(sat21w1);
      sat21w1.setBounds(510, 488, 88, 34);

      sun21w1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun21w1.setBorderPainted(true);
      sun21w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun21w1.setIconTextGap(0);
      sun21w1.setName("sun21w1"); // NOI18N
      sun21w1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun21w1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun21w1ActionPerformed(evt);
         }
      });
      week1.add(sun21w1);
      sun21w1.setBounds(598, 488, 88, 34);

      timetableImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timetableNew.PNG"))); // NOI18N
      timetableImage1.setName("timetableImage1"); // NOI18N
      timetableImage1.setPreferredSize(new java.awt.Dimension(505, 660));
      week1.add(timetableImage1);
      timetableImage1.setBounds(10, 7, 690, 520);

      mainPanel.add(week1, "card2");

      week2.setBackground(new java.awt.Color(255, 255, 255));
      week2.setName("week2"); // NOI18N
      week2.setLayout(null);

      mon8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon8w2.setBorderPainted(true);
      mon8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon8w2.setIconTextGap(0);
      mon8w2.setName("mon8w2"); // NOI18N
      mon8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon8w2ActionPerformed(evt);
         }
      });
      week2.add(mon8w2);
      mon8w2.setBounds(70, 46, 88, 34);

      tue8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue8w2.setBorderPainted(true);
      tue8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue8w2.setIconTextGap(0);
      tue8w2.setName("tue8w2"); // NOI18N
      tue8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue8w2ActionPerformed(evt);
         }
      });
      week2.add(tue8w2);
      tue8w2.setBounds(158, 46, 88, 34);

      wed8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed8w2.setBorderPainted(true);
      wed8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed8w2.setIconTextGap(0);
      wed8w2.setName("wed8w2"); // NOI18N
      wed8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed8w2ActionPerformed(evt);
         }
      });
      week2.add(wed8w2);
      wed8w2.setBounds(246, 46, 88, 34);

      thu8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu8w2.setBorderPainted(true);
      thu8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu8w2.setIconTextGap(0);
      thu8w2.setName("thu8w2"); // NOI18N
      thu8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu8w2ActionPerformed(evt);
         }
      });
      week2.add(thu8w2);
      thu8w2.setBounds(334, 46, 88, 34);

      fri8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri8w2.setBorderPainted(true);
      fri8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri8w2.setIconTextGap(0);
      fri8w2.setName("fri8w2"); // NOI18N
      fri8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri8w2ActionPerformed(evt);
         }
      });
      week2.add(fri8w2);
      fri8w2.setBounds(422, 46, 88, 34);

      sat8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat8w2.setBorderPainted(true);
      sat8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat8w2.setIconTextGap(0);
      sat8w2.setName("sat8w2"); // NOI18N
      sat8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat8w2ActionPerformed(evt);
         }
      });
      week2.add(sat8w2);
      sat8w2.setBounds(510, 46, 88, 34);

      sun8w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun8w2.setBorderPainted(true);
      sun8w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun8w2.setIconTextGap(0);
      sun8w2.setName("sun8w2"); // NOI18N
      sun8w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun8w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun8w2ActionPerformed(evt);
         }
      });
      week2.add(sun8w2);
      sun8w2.setBounds(598, 46, 88, 34);

      mon9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon9w2.setBorderPainted(true);
      mon9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon9w2.setIconTextGap(0);
      mon9w2.setName("mon9w2"); // NOI18N
      mon9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon9w2ActionPerformed(evt);
         }
      });
      week2.add(mon9w2);
      mon9w2.setBounds(70, 80, 88, 34);

      tue9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue9w2.setBorderPainted(true);
      tue9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue9w2.setIconTextGap(0);
      tue9w2.setName("tue9w2"); // NOI18N
      tue9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue9w2ActionPerformed(evt);
         }
      });
      week2.add(tue9w2);
      tue9w2.setBounds(158, 80, 88, 34);

      wed9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed9w2.setBorderPainted(true);
      wed9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed9w2.setIconTextGap(0);
      wed9w2.setName("wed9w2"); // NOI18N
      wed9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed9w2ActionPerformed(evt);
         }
      });
      week2.add(wed9w2);
      wed9w2.setBounds(246, 80, 88, 34);

      thu9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu9w2.setBorderPainted(true);
      thu9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu9w2.setIconTextGap(0);
      thu9w2.setName("thu9w2"); // NOI18N
      thu9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu9w2ActionPerformed(evt);
         }
      });
      week2.add(thu9w2);
      thu9w2.setBounds(334, 80, 88, 34);

      fri9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri9w2.setBorderPainted(true);
      fri9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri9w2.setIconTextGap(0);
      fri9w2.setName("fri9w2"); // NOI18N
      fri9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri9w2ActionPerformed(evt);
         }
      });
      week2.add(fri9w2);
      fri9w2.setBounds(422, 80, 88, 34);

      sat9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat9w2.setBorderPainted(true);
      sat9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat9w2.setIconTextGap(0);
      sat9w2.setName("sat9w2"); // NOI18N
      sat9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat9w2ActionPerformed(evt);
         }
      });
      week2.add(sat9w2);
      sat9w2.setBounds(510, 80, 88, 34);

      sun9w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun9w2.setBorderPainted(true);
      sun9w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun9w2.setIconTextGap(0);
      sun9w2.setName("sun9w2"); // NOI18N
      sun9w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun9w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun9w2ActionPerformed(evt);
         }
      });
      week2.add(sun9w2);
      sun9w2.setBounds(598, 80, 88, 34);

      mon10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon10w2.setBorderPainted(true);
      mon10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon10w2.setIconTextGap(0);
      mon10w2.setName("mon10w2"); // NOI18N
      mon10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon10w2ActionPerformed(evt);
         }
      });
      week2.add(mon10w2);
      mon10w2.setBounds(70, 114, 88, 34);

      tue10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue10w2.setBorderPainted(true);
      tue10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue10w2.setIconTextGap(0);
      tue10w2.setName("tue10w2"); // NOI18N
      tue10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue10w2ActionPerformed(evt);
         }
      });
      week2.add(tue10w2);
      tue10w2.setBounds(158, 114, 88, 34);

      wed10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed10w2.setBorderPainted(true);
      wed10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed10w2.setIconTextGap(0);
      wed10w2.setName("wed10w2"); // NOI18N
      wed10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed10w2ActionPerformed(evt);
         }
      });
      week2.add(wed10w2);
      wed10w2.setBounds(246, 114, 88, 34);

      thu10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu10w2.setBorderPainted(true);
      thu10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu10w2.setIconTextGap(0);
      thu10w2.setName("thu10w2"); // NOI18N
      thu10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu10w2ActionPerformed(evt);
         }
      });
      week2.add(thu10w2);
      thu10w2.setBounds(334, 114, 88, 34);

      fri10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri10w2.setBorderPainted(true);
      fri10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri10w2.setIconTextGap(0);
      fri10w2.setName("fri10w2"); // NOI18N
      fri10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri10w2ActionPerformed(evt);
         }
      });
      week2.add(fri10w2);
      fri10w2.setBounds(422, 114, 88, 34);

      sat10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat10w2.setBorderPainted(true);
      sat10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat10w2.setIconTextGap(0);
      sat10w2.setName("sat10w2"); // NOI18N
      sat10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat10w2ActionPerformed(evt);
         }
      });
      week2.add(sat10w2);
      sat10w2.setBounds(510, 114, 88, 34);

      sun10w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun10w2.setBorderPainted(true);
      sun10w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun10w2.setIconTextGap(0);
      sun10w2.setName("sun10w2"); // NOI18N
      sun10w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun10w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun10w2ActionPerformed(evt);
         }
      });
      week2.add(sun10w2);
      sun10w2.setBounds(598, 114, 88, 34);

      mon11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon11w2.setBorderPainted(true);
      mon11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon11w2.setIconTextGap(0);
      mon11w2.setName("mon11w2"); // NOI18N
      mon11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon11w2ActionPerformed(evt);
         }
      });
      week2.add(mon11w2);
      mon11w2.setBounds(70, 148, 88, 34);

      tue11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue11w2.setBorderPainted(true);
      tue11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue11w2.setIconTextGap(0);
      tue11w2.setName("tue11w2"); // NOI18N
      tue11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue11w2ActionPerformed(evt);
         }
      });
      week2.add(tue11w2);
      tue11w2.setBounds(158, 148, 88, 34);

      wed11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed11w2.setBorderPainted(true);
      wed11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed11w2.setIconTextGap(0);
      wed11w2.setName("wed11w2"); // NOI18N
      wed11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed11w2ActionPerformed(evt);
         }
      });
      week2.add(wed11w2);
      wed11w2.setBounds(246, 148, 88, 34);

      thu11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu11w2.setBorderPainted(true);
      thu11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu11w2.setIconTextGap(0);
      thu11w2.setName("thu11w2"); // NOI18N
      thu11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu11w2ActionPerformed(evt);
         }
      });
      week2.add(thu11w2);
      thu11w2.setBounds(334, 148, 88, 34);

      fri11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri11w2.setBorderPainted(true);
      fri11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri11w2.setIconTextGap(0);
      fri11w2.setName("fri11w2"); // NOI18N
      fri11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri11w2ActionPerformed(evt);
         }
      });
      week2.add(fri11w2);
      fri11w2.setBounds(422, 148, 88, 34);

      sat11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat11w2.setBorderPainted(true);
      sat11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat11w2.setIconTextGap(0);
      sat11w2.setName("sat11w2"); // NOI18N
      sat11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat11w2ActionPerformed(evt);
         }
      });
      week2.add(sat11w2);
      sat11w2.setBounds(510, 148, 88, 34);

      sun11w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun11w2.setBorderPainted(true);
      sun11w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun11w2.setIconTextGap(0);
      sun11w2.setName("sun11w2"); // NOI18N
      sun11w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun11w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun11w2ActionPerformed(evt);
         }
      });
      week2.add(sun11w2);
      sun11w2.setBounds(598, 148, 88, 34);

      mon12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon12w2.setBorderPainted(true);
      mon12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon12w2.setIconTextGap(0);
      mon12w2.setName("mon12w2"); // NOI18N
      mon12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon12w2ActionPerformed(evt);
         }
      });
      week2.add(mon12w2);
      mon12w2.setBounds(70, 182, 88, 34);

      tue12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue12w2.setBorderPainted(true);
      tue12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue12w2.setIconTextGap(0);
      tue12w2.setName("tue12w2"); // NOI18N
      tue12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue12w2ActionPerformed(evt);
         }
      });
      week2.add(tue12w2);
      tue12w2.setBounds(158, 182, 88, 34);

      wed12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed12w2.setBorderPainted(true);
      wed12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed12w2.setIconTextGap(0);
      wed12w2.setName("wed12w2"); // NOI18N
      wed12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed12w2ActionPerformed(evt);
         }
      });
      week2.add(wed12w2);
      wed12w2.setBounds(246, 182, 88, 34);

      thu12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu12w2.setBorderPainted(true);
      thu12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu12w2.setIconTextGap(0);
      thu12w2.setName("thu12w2"); // NOI18N
      thu12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu12w2ActionPerformed(evt);
         }
      });
      week2.add(thu12w2);
      thu12w2.setBounds(334, 182, 88, 34);

      fri12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri12w2.setBorderPainted(true);
      fri12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri12w2.setIconTextGap(0);
      fri12w2.setName("fri12w2"); // NOI18N
      fri12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri12w2ActionPerformed(evt);
         }
      });
      week2.add(fri12w2);
      fri12w2.setBounds(422, 182, 88, 34);

      sat12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat12w2.setBorderPainted(true);
      sat12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat12w2.setIconTextGap(0);
      sat12w2.setName("sat12w2"); // NOI18N
      sat12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat12w2ActionPerformed(evt);
         }
      });
      week2.add(sat12w2);
      sat12w2.setBounds(510, 182, 88, 34);

      sun12w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun12w2.setBorderPainted(true);
      sun12w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun12w2.setIconTextGap(0);
      sun12w2.setName("sun12w2"); // NOI18N
      sun12w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun12w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun12w2ActionPerformed(evt);
         }
      });
      week2.add(sun12w2);
      sun12w2.setBounds(598, 182, 88, 34);

      mon13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon13w2.setBorderPainted(true);
      mon13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon13w2.setIconTextGap(0);
      mon13w2.setName("mon13w2"); // NOI18N
      mon13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon13w2ActionPerformed(evt);
         }
      });
      week2.add(mon13w2);
      mon13w2.setBounds(70, 216, 88, 34);

      tue13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue13w2.setBorderPainted(true);
      tue13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue13w2.setIconTextGap(0);
      tue13w2.setName("tue13w2"); // NOI18N
      tue13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue13w2ActionPerformed(evt);
         }
      });
      week2.add(tue13w2);
      tue13w2.setBounds(158, 216, 88, 34);

      wed13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed13w2.setBorderPainted(true);
      wed13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed13w2.setIconTextGap(0);
      wed13w2.setName("wed13w2"); // NOI18N
      wed13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed13w2ActionPerformed(evt);
         }
      });
      week2.add(wed13w2);
      wed13w2.setBounds(246, 216, 88, 34);

      thu13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu13w2.setBorderPainted(true);
      thu13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu13w2.setIconTextGap(0);
      thu13w2.setName("thu13w2"); // NOI18N
      thu13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu13w2ActionPerformed(evt);
         }
      });
      week2.add(thu13w2);
      thu13w2.setBounds(334, 216, 88, 34);

      fri13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri13w2.setBorderPainted(true);
      fri13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri13w2.setIconTextGap(0);
      fri13w2.setName("fri13w2"); // NOI18N
      fri13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri13w2ActionPerformed(evt);
         }
      });
      week2.add(fri13w2);
      fri13w2.setBounds(422, 216, 88, 34);

      sat13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat13w2.setBorderPainted(true);
      sat13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat13w2.setIconTextGap(0);
      sat13w2.setName("sat13w2"); // NOI18N
      sat13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat13w2ActionPerformed(evt);
         }
      });
      week2.add(sat13w2);
      sat13w2.setBounds(510, 216, 88, 34);

      sun13w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun13w2.setBorderPainted(true);
      sun13w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun13w2.setIconTextGap(0);
      sun13w2.setName("sun13w2"); // NOI18N
      sun13w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun13w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun13w2ActionPerformed(evt);
         }
      });
      week2.add(sun13w2);
      sun13w2.setBounds(598, 216, 88, 34);

      mon14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon14w2.setBorderPainted(true);
      mon14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon14w2.setIconTextGap(0);
      mon14w2.setName("mon14w2"); // NOI18N
      mon14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon14w2ActionPerformed(evt);
         }
      });
      week2.add(mon14w2);
      mon14w2.setBounds(70, 250, 88, 34);

      tue14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue14w2.setBorderPainted(true);
      tue14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue14w2.setIconTextGap(0);
      tue14w2.setName("tue14w2"); // NOI18N
      tue14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue14w2ActionPerformed(evt);
         }
      });
      week2.add(tue14w2);
      tue14w2.setBounds(158, 250, 88, 34);

      wed14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed14w2.setBorderPainted(true);
      wed14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed14w2.setIconTextGap(0);
      wed14w2.setName("wed14w2"); // NOI18N
      wed14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed14w2ActionPerformed(evt);
         }
      });
      week2.add(wed14w2);
      wed14w2.setBounds(246, 250, 88, 34);

      thu14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu14w2.setBorderPainted(true);
      thu14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu14w2.setIconTextGap(0);
      thu14w2.setName("thu14w2"); // NOI18N
      thu14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu14w2ActionPerformed(evt);
         }
      });
      week2.add(thu14w2);
      thu14w2.setBounds(334, 250, 88, 34);

      fri14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri14w2.setBorderPainted(true);
      fri14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri14w2.setIconTextGap(0);
      fri14w2.setName("fri14w2"); // NOI18N
      fri14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri14w2ActionPerformed(evt);
         }
      });
      week2.add(fri14w2);
      fri14w2.setBounds(422, 250, 88, 34);

      sat14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat14w2.setBorderPainted(true);
      sat14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat14w2.setIconTextGap(0);
      sat14w2.setName("sat14w2"); // NOI18N
      sat14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat14w2ActionPerformed(evt);
         }
      });
      week2.add(sat14w2);
      sat14w2.setBounds(510, 250, 88, 34);

      sun14w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun14w2.setBorderPainted(true);
      sun14w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun14w2.setIconTextGap(0);
      sun14w2.setName("sun14w2"); // NOI18N
      sun14w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun14w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun14w2ActionPerformed(evt);
         }
      });
      week2.add(sun14w2);
      sun14w2.setBounds(598, 250, 88, 34);

      mon15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon15w2.setBorderPainted(true);
      mon15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon15w2.setIconTextGap(0);
      mon15w2.setName("mon15w2"); // NOI18N
      mon15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon15w2ActionPerformed(evt);
         }
      });
      week2.add(mon15w2);
      mon15w2.setBounds(70, 284, 88, 34);

      tue15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue15w2.setBorderPainted(true);
      tue15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue15w2.setIconTextGap(0);
      tue15w2.setName("tue15w2"); // NOI18N
      tue15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue15w2ActionPerformed(evt);
         }
      });
      week2.add(tue15w2);
      tue15w2.setBounds(158, 284, 88, 34);

      wed15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed15w2.setBorderPainted(true);
      wed15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed15w2.setIconTextGap(0);
      wed15w2.setName("wed15w2"); // NOI18N
      wed15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed15w2ActionPerformed(evt);
         }
      });
      week2.add(wed15w2);
      wed15w2.setBounds(246, 284, 88, 34);

      thu15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu15w2.setBorderPainted(true);
      thu15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu15w2.setIconTextGap(0);
      thu15w2.setName("thu15w2"); // NOI18N
      thu15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu15w2ActionPerformed(evt);
         }
      });
      week2.add(thu15w2);
      thu15w2.setBounds(334, 284, 88, 34);

      fri15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri15w2.setBorderPainted(true);
      fri15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri15w2.setIconTextGap(0);
      fri15w2.setName("fri15w2"); // NOI18N
      fri15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri15w2ActionPerformed(evt);
         }
      });
      week2.add(fri15w2);
      fri15w2.setBounds(422, 284, 88, 34);

      sat15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat15w2.setBorderPainted(true);
      sat15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat15w2.setIconTextGap(0);
      sat15w2.setName("sat15w2"); // NOI18N
      sat15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat15w2ActionPerformed(evt);
         }
      });
      week2.add(sat15w2);
      sat15w2.setBounds(510, 284, 88, 34);

      sun15w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun15w2.setBorderPainted(true);
      sun15w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun15w2.setIconTextGap(0);
      sun15w2.setName("sun15w2"); // NOI18N
      sun15w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun15w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun15w2ActionPerformed(evt);
         }
      });
      week2.add(sun15w2);
      sun15w2.setBounds(598, 284, 88, 34);

      mon16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon16w2.setBorderPainted(true);
      mon16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon16w2.setIconTextGap(0);
      mon16w2.setName("mon16w2"); // NOI18N
      mon16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon16w2ActionPerformed(evt);
         }
      });
      week2.add(mon16w2);
      mon16w2.setBounds(70, 318, 88, 34);

      tue16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue16w2.setBorderPainted(true);
      tue16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue16w2.setIconTextGap(0);
      tue16w2.setName("tue16w2"); // NOI18N
      tue16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue16w2ActionPerformed(evt);
         }
      });
      week2.add(tue16w2);
      tue16w2.setBounds(158, 318, 88, 34);

      wed16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed16w2.setBorderPainted(true);
      wed16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed16w2.setIconTextGap(0);
      wed16w2.setName("wed16w2"); // NOI18N
      wed16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed16w2ActionPerformed(evt);
         }
      });
      week2.add(wed16w2);
      wed16w2.setBounds(246, 318, 88, 34);

      thu16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu16w2.setBorderPainted(true);
      thu16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu16w2.setIconTextGap(0);
      thu16w2.setName("thu16w2"); // NOI18N
      thu16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu16w2ActionPerformed(evt);
         }
      });
      week2.add(thu16w2);
      thu16w2.setBounds(334, 318, 88, 34);

      fri16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri16w2.setBorderPainted(true);
      fri16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri16w2.setIconTextGap(0);
      fri16w2.setName("fri16w2"); // NOI18N
      fri16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri16w2ActionPerformed(evt);
         }
      });
      week2.add(fri16w2);
      fri16w2.setBounds(422, 318, 88, 34);

      sat16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat16w2.setBorderPainted(true);
      sat16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat16w2.setIconTextGap(0);
      sat16w2.setName("sat16w2"); // NOI18N
      sat16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat16w2ActionPerformed(evt);
         }
      });
      week2.add(sat16w2);
      sat16w2.setBounds(510, 318, 88, 34);

      sun16w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun16w2.setBorderPainted(true);
      sun16w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun16w2.setIconTextGap(0);
      sun16w2.setName("sun16w2"); // NOI18N
      sun16w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun16w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun16w2ActionPerformed(evt);
         }
      });
      week2.add(sun16w2);
      sun16w2.setBounds(598, 318, 88, 34);

      mon17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon17w2.setBorderPainted(true);
      mon17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon17w2.setIconTextGap(0);
      mon17w2.setName("mon17w2"); // NOI18N
      mon17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon17w2ActionPerformed(evt);
         }
      });
      week2.add(mon17w2);
      mon17w2.setBounds(70, 352, 88, 34);

      tue17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue17w2.setBorderPainted(true);
      tue17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue17w2.setIconTextGap(0);
      tue17w2.setName("tue17w2"); // NOI18N
      tue17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue17w2ActionPerformed(evt);
         }
      });
      week2.add(tue17w2);
      tue17w2.setBounds(158, 352, 88, 34);

      wed17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed17w2.setBorderPainted(true);
      wed17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed17w2.setIconTextGap(0);
      wed17w2.setName("wed17w2"); // NOI18N
      wed17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed17w2ActionPerformed(evt);
         }
      });
      week2.add(wed17w2);
      wed17w2.setBounds(246, 352, 88, 34);

      thu17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu17w2.setBorderPainted(true);
      thu17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu17w2.setIconTextGap(0);
      thu17w2.setName("thu17w2"); // NOI18N
      thu17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu17w2ActionPerformed(evt);
         }
      });
      week2.add(thu17w2);
      thu17w2.setBounds(334, 352, 88, 34);

      fri17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri17w2.setBorderPainted(true);
      fri17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri17w2.setIconTextGap(0);
      fri17w2.setName("fri17w2"); // NOI18N
      fri17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri17w2ActionPerformed(evt);
         }
      });
      week2.add(fri17w2);
      fri17w2.setBounds(422, 352, 88, 34);

      sat17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat17w2.setBorderPainted(true);
      sat17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat17w2.setIconTextGap(0);
      sat17w2.setName("sat17w2"); // NOI18N
      sat17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat17w2ActionPerformed(evt);
         }
      });
      week2.add(sat17w2);
      sat17w2.setBounds(510, 352, 88, 34);

      sun17w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun17w2.setBorderPainted(true);
      sun17w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun17w2.setIconTextGap(0);
      sun17w2.setName("sun17w2"); // NOI18N
      sun17w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun17w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun17w2ActionPerformed(evt);
         }
      });
      week2.add(sun17w2);
      sun17w2.setBounds(598, 352, 88, 34);

      mon18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon18w2.setBorderPainted(true);
      mon18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon18w2.setIconTextGap(0);
      mon18w2.setName("mon18w2"); // NOI18N
      mon18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon18w2ActionPerformed(evt);
         }
      });
      week2.add(mon18w2);
      mon18w2.setBounds(70, 386, 88, 34);

      tue18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue18w2.setBorderPainted(true);
      tue18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue18w2.setIconTextGap(0);
      tue18w2.setName("tue18w2"); // NOI18N
      tue18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue18w2ActionPerformed(evt);
         }
      });
      week2.add(tue18w2);
      tue18w2.setBounds(158, 386, 88, 34);

      wed18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed18w2.setBorderPainted(true);
      wed18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed18w2.setIconTextGap(0);
      wed18w2.setName("wed18w2"); // NOI18N
      wed18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed18w2ActionPerformed(evt);
         }
      });
      week2.add(wed18w2);
      wed18w2.setBounds(246, 386, 88, 34);

      thu18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu18w2.setBorderPainted(true);
      thu18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu18w2.setIconTextGap(0);
      thu18w2.setName("thu18w2"); // NOI18N
      thu18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu18w2ActionPerformed(evt);
         }
      });
      week2.add(thu18w2);
      thu18w2.setBounds(334, 386, 88, 34);

      fri18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri18w2.setBorderPainted(true);
      fri18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri18w2.setIconTextGap(0);
      fri18w2.setName("fri18w2"); // NOI18N
      fri18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri18w2ActionPerformed(evt);
         }
      });
      week2.add(fri18w2);
      fri18w2.setBounds(422, 386, 88, 34);

      sat18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat18w2.setBorderPainted(true);
      sat18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat18w2.setIconTextGap(0);
      sat18w2.setName("sat18w2"); // NOI18N
      sat18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat18w2ActionPerformed(evt);
         }
      });
      week2.add(sat18w2);
      sat18w2.setBounds(510, 386, 88, 34);

      sun18w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun18w2.setBorderPainted(true);
      sun18w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun18w2.setIconTextGap(0);
      sun18w2.setName("sun18w2"); // NOI18N
      sun18w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun18w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun18w2ActionPerformed(evt);
         }
      });
      week2.add(sun18w2);
      sun18w2.setBounds(598, 386, 88, 34);

      mon19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon19w2.setBorderPainted(true);
      mon19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon19w2.setIconTextGap(0);
      mon19w2.setName("mon19w2"); // NOI18N
      mon19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon19w2ActionPerformed(evt);
         }
      });
      week2.add(mon19w2);
      mon19w2.setBounds(70, 420, 88, 34);

      tue19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue19w2.setBorderPainted(true);
      tue19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue19w2.setIconTextGap(0);
      tue19w2.setName("tue19w2"); // NOI18N
      tue19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue19w2ActionPerformed(evt);
         }
      });
      week2.add(tue19w2);
      tue19w2.setBounds(158, 420, 88, 34);

      wed19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed19w2.setBorderPainted(true);
      wed19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed19w2.setIconTextGap(0);
      wed19w2.setName("wed19w2"); // NOI18N
      wed19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed19w2ActionPerformed(evt);
         }
      });
      week2.add(wed19w2);
      wed19w2.setBounds(246, 420, 88, 34);

      thu19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu19w2.setBorderPainted(true);
      thu19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu19w2.setIconTextGap(0);
      thu19w2.setName("thu19w2"); // NOI18N
      thu19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu19w2ActionPerformed(evt);
         }
      });
      week2.add(thu19w2);
      thu19w2.setBounds(334, 420, 88, 34);

      fri19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri19w2.setBorderPainted(true);
      fri19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri19w2.setIconTextGap(0);
      fri19w2.setName("fri19w2"); // NOI18N
      fri19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri19w2ActionPerformed(evt);
         }
      });
      week2.add(fri19w2);
      fri19w2.setBounds(422, 420, 88, 34);

      sat19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat19w2.setBorderPainted(true);
      sat19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat19w2.setIconTextGap(0);
      sat19w2.setName("sat19w2"); // NOI18N
      sat19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat19w2ActionPerformed(evt);
         }
      });
      week2.add(sat19w2);
      sat19w2.setBounds(510, 420, 88, 34);

      sun19w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun19w2.setBorderPainted(true);
      sun19w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun19w2.setIconTextGap(0);
      sun19w2.setName("sun19w2"); // NOI18N
      sun19w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun19w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun19w2ActionPerformed(evt);
         }
      });
      week2.add(sun19w2);
      sun19w2.setBounds(598, 420, 88, 34);

      mon20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon20w2.setBorderPainted(true);
      mon20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon20w2.setIconTextGap(0);
      mon20w2.setName("mon20w2"); // NOI18N
      mon20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon20w2ActionPerformed(evt);
         }
      });
      week2.add(mon20w2);
      mon20w2.setBounds(70, 454, 88, 34);

      tue20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue20w2.setBorderPainted(true);
      tue20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue20w2.setIconTextGap(0);
      tue20w2.setName("tue20w2"); // NOI18N
      tue20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue20w2ActionPerformed(evt);
         }
      });
      week2.add(tue20w2);
      tue20w2.setBounds(158, 454, 88, 34);

      wed20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed20w2.setBorderPainted(true);
      wed20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed20w2.setIconTextGap(0);
      wed20w2.setName("wed20w2"); // NOI18N
      wed20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed20w2ActionPerformed(evt);
         }
      });
      week2.add(wed20w2);
      wed20w2.setBounds(246, 454, 88, 34);

      thu20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu20w2.setBorderPainted(true);
      thu20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu20w2.setIconTextGap(0);
      thu20w2.setName("thu20w2"); // NOI18N
      thu20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu20w2ActionPerformed(evt);
         }
      });
      week2.add(thu20w2);
      thu20w2.setBounds(334, 454, 88, 34);

      fri20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri20w2.setBorderPainted(true);
      fri20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri20w2.setIconTextGap(0);
      fri20w2.setName("fri20w2"); // NOI18N
      fri20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri20w2ActionPerformed(evt);
         }
      });
      week2.add(fri20w2);
      fri20w2.setBounds(422, 454, 88, 34);

      sat20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat20w2.setBorderPainted(true);
      sat20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat20w2.setIconTextGap(0);
      sat20w2.setName("sat20w2"); // NOI18N
      sat20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat20w2ActionPerformed(evt);
         }
      });
      week2.add(sat20w2);
      sat20w2.setBounds(510, 454, 88, 34);

      sun20w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun20w2.setBorderPainted(true);
      sun20w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun20w2.setIconTextGap(0);
      sun20w2.setName("sun20w2"); // NOI18N
      sun20w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun20w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun20w2ActionPerformed(evt);
         }
      });
      week2.add(sun20w2);
      sun20w2.setBounds(598, 454, 88, 34);

      mon21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      mon21w2.setBorderPainted(true);
      mon21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      mon21w2.setIconTextGap(0);
      mon21w2.setName("mon21w2"); // NOI18N
      mon21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      mon21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            mon21w2ActionPerformed(evt);
         }
      });
      week2.add(mon21w2);
      mon21w2.setBounds(70, 488, 88, 34);

      tue21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      tue21w2.setBorderPainted(true);
      tue21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      tue21w2.setIconTextGap(0);
      tue21w2.setName("tue21w2"); // NOI18N
      tue21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      tue21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tue21w2ActionPerformed(evt);
         }
      });
      week2.add(tue21w2);
      tue21w2.setBounds(158, 488, 88, 34);

      wed21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      wed21w2.setBorderPainted(true);
      wed21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      wed21w2.setIconTextGap(0);
      wed21w2.setName("wed21w2"); // NOI18N
      wed21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      wed21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            wed21w2ActionPerformed(evt);
         }
      });
      week2.add(wed21w2);
      wed21w2.setBounds(246, 488, 88, 34);

      thu21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      thu21w2.setBorderPainted(true);
      thu21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      thu21w2.setIconTextGap(0);
      thu21w2.setName("thu21w2"); // NOI18N
      thu21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      thu21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            thu21w2ActionPerformed(evt);
         }
      });
      week2.add(thu21w2);
      thu21w2.setBounds(334, 488, 88, 34);

      fri21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      fri21w2.setBorderPainted(true);
      fri21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      fri21w2.setIconTextGap(0);
      fri21w2.setName("fri21w2"); // NOI18N
      fri21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      fri21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fri21w2ActionPerformed(evt);
         }
      });
      week2.add(fri21w2);
      fri21w2.setBounds(422, 488, 88, 34);

      sat21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sat21w2.setBorderPainted(true);
      sat21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sat21w2.setIconTextGap(0);
      sat21w2.setName("sat21w2"); // NOI18N
      sat21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sat21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sat21w2ActionPerformed(evt);
         }
      });
      week2.add(sat21w2);
      sat21w2.setBounds(510, 488, 88, 34);

      sun21w2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
      sun21w2.setBorderPainted(true);
      sun21w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenTile.png"))); // NOI18N
      sun21w2.setIconTextGap(0);
      sun21w2.setName("sun21w2"); // NOI18N
      sun21w2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redTile.png"))); // NOI18N
      sun21w2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            sun21w2ActionPerformed(evt);
         }
      });
      week2.add(sun21w2);
      sun21w2.setBounds(598, 488, 88, 34);

      timetableImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timetableNew.PNG"))); // NOI18N
      timetableImage2.setName("timetableImage2"); // NOI18N
      timetableImage2.setPreferredSize(new java.awt.Dimension(505, 660));
      week2.add(timetableImage2);
      timetableImage2.setBounds(10, 7, 690, 520);

      mainPanel.add(week2, "card2");

      getContentPane().add(mainPanel);
      mainPanel.setBounds(0, 111, 700, 700);

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setName("jPanel1"); // NOI18N

      switchButton.setBackground(new java.awt.Color(255, 255, 255));
      switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switchWeek.png"))); // NOI18N
      switchButton.setBorder(null);
      switchButton.setContentAreaFilled(false);
      switchButton.setName("switchButton"); // NOI18N
      switchButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            switchButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 284, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(switchButton)
            .addGap(0, 9, Short.MAX_VALUE))
      );

      getContentPane().add(jPanel1);
      jPanel1.setBounds(380, 75, 320, 40);

      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
      jPanel2.setName("jPanel2"); // NOI18N

      titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
      titleLabel.setText("Edit Timetable");
      titleLabel.setName("titleLabel"); // NOI18N

      buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      buttonCancel.setText("Cancel");
      buttonCancel.setName("buttonCancel"); // NOI18N
      buttonCancel.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonCancelActionPerformed(evt);
         }
      });

      buttonSaveTimetable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      buttonSaveTimetable.setText("Save");
      buttonSaveTimetable.setName("buttonSaveTimetable"); // NOI18N
      buttonSaveTimetable.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonSaveTimetableActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(buttonSaveTimetable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
            .addComponent(titleLabel)
            .addGap(63, 63, 63)
            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(45, 45, 45))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(3, 3, 3))
               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(titleLabel)
                  .addComponent(buttonSaveTimetable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      getContentPane().add(jPanel2);
      jPanel2.setBounds(0, 0, 700, 75);

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void mon8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon8w1ActionPerformed

   private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
       CardLayout cl = (CardLayout) (mainPanel.getLayout());
       cl.next(mainPanel);
       CardLayout cl2 = (CardLayout) (secondaryPanel.getLayout());
       cl2.next(secondaryPanel);
   }//GEN-LAST:event_switchButtonActionPerformed

   private void tue8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue8w1ActionPerformed

   private void wed8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed8w1ActionPerformed

   private void thu8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu8w1ActionPerformed

   private void fri8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri8w1ActionPerformed

   private void sat8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat8w1ActionPerformed

   private void sun8w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun8w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun8w1ActionPerformed

   private void sun9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun9w1ActionPerformed

   private void sat9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat9w1ActionPerformed

   private void fri9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri9w1ActionPerformed

   private void thu9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu9w1ActionPerformed

   private void wed9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed9w1ActionPerformed

   private void tue9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue9w1ActionPerformed

   private void mon9w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon9w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon9w1ActionPerformed

   private void mon10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon10w1ActionPerformed

   private void tue10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue10w1ActionPerformed

   private void wed10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed10w1ActionPerformed

   private void thu10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu10w1ActionPerformed

   private void fri10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri10w1ActionPerformed

   private void sat10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat10w1ActionPerformed

   private void sun10w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun10w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun10w1ActionPerformed

   private void mon11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon11w1ActionPerformed

   private void tue11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue11w1ActionPerformed

   private void wed11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed11w1ActionPerformed

   private void thu11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu11w1ActionPerformed

   private void fri11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri11w1ActionPerformed

   private void sat11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat11w1ActionPerformed

   private void sun11w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun11w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun11w1ActionPerformed

   private void mon12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon12w1ActionPerformed

   private void tue12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue12w1ActionPerformed

   private void wed12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed12w1ActionPerformed

   private void thu12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu12w1ActionPerformed

   private void fri12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri12w1ActionPerformed

   private void sat12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat12w1ActionPerformed

   private void sun12w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun12w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun12w1ActionPerformed

   private void mon13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon13w1ActionPerformed

   private void tue13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue13w1ActionPerformed

   private void wed13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed13w1ActionPerformed

   private void thu13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu13w1ActionPerformed

   private void fri13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri13w1ActionPerformed

   private void sat13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat13w1ActionPerformed

   private void sun13w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun13w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun13w1ActionPerformed

   private void mon14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon14w1ActionPerformed

   private void tue14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue14w1ActionPerformed

   private void wed14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed14w1ActionPerformed

   private void thu14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu14w1ActionPerformed

   private void fri14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri14w1ActionPerformed

   private void sat14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat14w1ActionPerformed

   private void sun14w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun14w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun14w1ActionPerformed

   private void mon15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon15w1ActionPerformed

   private void tue15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue15w1ActionPerformed

   private void wed15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed15w1ActionPerformed

   private void thu15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu15w1ActionPerformed

   private void fri15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri15w1ActionPerformed

   private void sat15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat15w1ActionPerformed

   private void sun15w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun15w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun15w1ActionPerformed

   private void mon16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon16w1ActionPerformed

   private void tue16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue16w1ActionPerformed

   private void wed16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed16w1ActionPerformed

   private void thu16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu16w1ActionPerformed

   private void fri16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri16w1ActionPerformed

   private void sat16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat16w1ActionPerformed

   private void sun16w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun16w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun16w1ActionPerformed

   private void mon17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon17w1ActionPerformed

   private void tue17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue17w1ActionPerformed

   private void wed17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed17w1ActionPerformed

   private void thu17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu17w1ActionPerformed

   private void fri17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri17w1ActionPerformed

   private void sat17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat17w1ActionPerformed

   private void sun17w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun17w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun17w1ActionPerformed

   private void mon18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon18w1ActionPerformed

   private void tue18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue18w1ActionPerformed

   private void wed18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed18w1ActionPerformed

   private void thu18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu18w1ActionPerformed

   private void fri18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri18w1ActionPerformed

   private void sat18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat18w1ActionPerformed

   private void sun18w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun18w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun18w1ActionPerformed

   private void mon19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon19w1ActionPerformed

   private void tue19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue19w1ActionPerformed

   private void wed19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed19w1ActionPerformed

   private void thu19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu19w1ActionPerformed

   private void fri19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri19w1ActionPerformed

   private void sat19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat19w1ActionPerformed

   private void sun19w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun19w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun19w1ActionPerformed

   private void mon20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon20w1ActionPerformed

   private void tue20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue20w1ActionPerformed

   private void wed20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed20w1ActionPerformed

   private void thu20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu20w1ActionPerformed

   private void fri20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri20w1ActionPerformed

   private void sat20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat20w1ActionPerformed

   private void sun20w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun20w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun20w1ActionPerformed

   private void mon21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon21w1ActionPerformed

   private void tue21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue21w1ActionPerformed

   private void wed21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed21w1ActionPerformed

   private void thu21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu21w1ActionPerformed

   private void fri21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri21w1ActionPerformed

   private void sat21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat21w1ActionPerformed

   private void sun21w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun21w1ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun21w1ActionPerformed

   private void mon8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon8w2ActionPerformed

   private void tue8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue8w2ActionPerformed

   private void wed8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed8w2ActionPerformed

   private void thu8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu8w2ActionPerformed

   private void fri8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri8w2ActionPerformed

   private void sat8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat8w2ActionPerformed

   private void sun8w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun8w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun8w2ActionPerformed

   private void mon9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon9w2ActionPerformed

   private void tue9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue9w2ActionPerformed

   private void wed9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed9w2ActionPerformed

   private void thu9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu9w2ActionPerformed

   private void fri9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri9w2ActionPerformed

   private void sat9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat9w2ActionPerformed

   private void sun9w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun9w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun9w2ActionPerformed

   private void mon10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon10w2ActionPerformed

   private void tue10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue10w2ActionPerformed

   private void wed10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed10w2ActionPerformed

   private void thu10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu10w2ActionPerformed

   private void fri10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri10w2ActionPerformed

   private void sat10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat10w2ActionPerformed

   private void sun10w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun10w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun10w2ActionPerformed

   private void mon11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon11w2ActionPerformed

   private void tue11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue11w2ActionPerformed

   private void wed11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed11w2ActionPerformed

   private void thu11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu11w2ActionPerformed

   private void fri11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri11w2ActionPerformed

   private void sat11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat11w2ActionPerformed

   private void sun11w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun11w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun11w2ActionPerformed

   private void mon12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon12w2ActionPerformed

   private void tue12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue12w2ActionPerformed

   private void wed12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed12w2ActionPerformed

   private void thu12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu12w2ActionPerformed

   private void fri12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri12w2ActionPerformed

   private void sat12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat12w2ActionPerformed

   private void sun12w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun12w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun12w2ActionPerformed

   private void mon13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon13w2ActionPerformed

   private void tue13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue13w2ActionPerformed

   private void wed13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed13w2ActionPerformed

   private void thu13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu13w2ActionPerformed

   private void fri13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri13w2ActionPerformed

   private void sat13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat13w2ActionPerformed

   private void sun13w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun13w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun13w2ActionPerformed

   private void mon14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon14w2ActionPerformed

   private void tue14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue14w2ActionPerformed

   private void wed14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed14w2ActionPerformed

   private void thu14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu14w2ActionPerformed

   private void fri14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri14w2ActionPerformed

   private void sat14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat14w2ActionPerformed

   private void sun14w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun14w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun14w2ActionPerformed

   private void mon15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon15w2ActionPerformed

   private void tue15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue15w2ActionPerformed

   private void wed15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed15w2ActionPerformed

   private void thu15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu15w2ActionPerformed

   private void fri15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri15w2ActionPerformed

   private void sat15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat15w2ActionPerformed

   private void sun15w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun15w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun15w2ActionPerformed

   private void mon16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon16w2ActionPerformed

   private void tue16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue16w2ActionPerformed

   private void wed16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed16w2ActionPerformed

   private void thu16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu16w2ActionPerformed

   private void fri16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri16w2ActionPerformed

   private void sat16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat16w2ActionPerformed

   private void sun16w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun16w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun16w2ActionPerformed

   private void mon17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon17w2ActionPerformed

   private void tue17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue17w2ActionPerformed

   private void wed17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed17w2ActionPerformed

   private void thu17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu17w2ActionPerformed

   private void fri17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri17w2ActionPerformed

   private void sat17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat17w2ActionPerformed

   private void sun17w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun17w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun17w2ActionPerformed

   private void mon18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon18w2ActionPerformed

   private void tue18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue18w2ActionPerformed

   private void wed18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed18w2ActionPerformed

   private void thu18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu18w2ActionPerformed

   private void fri18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri18w2ActionPerformed

   private void sat18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat18w2ActionPerformed

   private void sun18w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun18w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun18w2ActionPerformed

   private void mon19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon19w2ActionPerformed

   private void tue19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue19w2ActionPerformed

   private void wed19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed19w2ActionPerformed

   private void thu19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu19w2ActionPerformed

   private void fri19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri19w2ActionPerformed

   private void sat19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat19w2ActionPerformed

   private void sun19w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun19w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun19w2ActionPerformed

   private void mon20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon20w2ActionPerformed

   private void tue20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue20w2ActionPerformed

   private void wed20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed20w2ActionPerformed

   private void thu20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu20w2ActionPerformed

   private void fri20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri20w2ActionPerformed

   private void sat20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat20w2ActionPerformed

   private void sun20w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun20w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun20w2ActionPerformed

   private void mon21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mon21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_mon21w2ActionPerformed

   private void tue21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tue21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_tue21w2ActionPerformed

   private void wed21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wed21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_wed21w2ActionPerformed

   private void thu21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thu21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_thu21w2ActionPerformed

   private void fri21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fri21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_fri21w2ActionPerformed

   private void sat21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sat21w2ActionPerformed

   private void sun21w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sun21w2ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_sun21w2ActionPerformed

   private void buttonSaveTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveTimetableActionPerformed

		/** 
       ArrayList<Boolean> week1 = new ArrayList<Boolean>();
       ArrayList<Boolean> week2 = new ArrayList<Boolean>();

       for (JCheckBox element : this.weekDays1) {
           //System.out.println(element);
           week1.add(element.isSelected());
       }
       Boolean value = true;
       for (JCheckBox element : this.weekDays2) {
           week2.add(element.isSelected());
           if (element.isSelected() == false) {
               value = false;
           }
       }
		 
		 Day mondayWeek1 = new Day(userName, "Week 1 Monday", new ArrayList<Boolean>(week1.subList(0, 14)));

       Day tuesdayWeek1 = new Day(userName, "Week 1 Tuesday", new ArrayList<Boolean>(week1.subList(14, 28)));

       Day wednesdayWeek1 = new Day(userName, "Week 1 Wednesday", new ArrayList<Boolean>(week1.subList(28, 42)));

       Day thursdayWeek1 = new Day(userName, "Week 1 Thursday", new ArrayList<Boolean>(week1.subList(42, 56)));

       Day fridayWeek1 = new Day(userName, "Week 1 Friday", new ArrayList<Boolean>(week1.subList(56, 70)));

       Day saturdayWeek1 = new Day(userName, "Week 1 Saturday", new ArrayList<Boolean>(week1.subList(70, 84)));

       Day sundayWeek1 = new Day(userName, "Week 1 Sunday", new ArrayList<Boolean>(week1.subList(84, 98)));

       Day mondayWeek2 = new Day(userName, "Week 2 Monday", new ArrayList<Boolean>(week1.subList(0, 14)));

       Day tuesdayWeek2 = new Day(userName, "Week 2 Tuesday", new ArrayList<Boolean>(week1.subList(14, 28)));

       Day wednesdayWeek2 = new Day(userName, "Week 2 Wednesday", new ArrayList<Boolean>(week1.subList(28, 42)));

       Day thursdayWeek2 = new Day(userName, "Week 2 Thursday", new ArrayList<Boolean>(week1.subList(42, 56)));

       Day fridayWeek2 = new Day(userName, "Week 2 Friday", new ArrayList<Boolean>(week1.subList(56, 70)));

       Day saturdayWeek2 = new Day(userName, "Week 2 Saturday", new ArrayList<Boolean>(week1.subList(70, 84)));

       Day sundayWeek2 = new Day(userName, "Week 2 Sunday", new ArrayList<Boolean>(week1.subList(84, 98)));
		 
		 if (value == false) {
		     mondayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(0, 14)));
           mondayWeek2.setDayName("Week 2 Monday");
			  tuesdayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(14, 28)));
           tuesdayWeek2.setDayName("Week 2 Tuesday");
			  wednesdayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(28, 42)));
           wednesdayWeek2.setDayName("Week 2 Wednesday");
			  thursdayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(42, 56)));
           thursdayWeek2.setDayName("Week 2 Thursday");
			  fridayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(56, 70)));
           fridayWeek2.setDayName("Week 2 Friday");
			  saturdayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(70, 84)));
           saturdayWeek2.setDayName("Week 2 Saturday");
			  sundayWeek2.SetArrayList(new ArrayList<Boolean>(week1.subList(84, 98)));
           sundayWeek2.setDayName("Week 2 Sunday");
		 */
		
      /**
      * Can we turn this into a loop? Probably, wouldn't be suprised This code
      * will be temporary, it'll probably be turned into a loop
      */
      Boolean storeMon8w1 = mon8w1.isSelected();
      Boolean storeMon9w1 = mon9w1.isSelected();
      Boolean storeMon10w1 = mon10w1.isSelected();
      Boolean storeMon11w1 = mon11w1.isSelected();
      Boolean storeMon12w1 = mon12w1.isSelected();
      Boolean storeMon13w1 = mon13w1.isSelected();
      Boolean storeMon14w1 = mon14w1.isSelected();
      Boolean storeMon15w1 = mon15w1.isSelected();
      Boolean storeMon16w1 = mon16w1.isSelected();
      Boolean storeMon17w1 = mon17w1.isSelected();
      Boolean storeMon18w1 = mon18w1.isSelected();
      Boolean storeMon19w1 = mon19w1.isSelected();
      Boolean storeMon20w1 = mon20w1.isSelected();
      Boolean storeMon21w1 = mon21w1.isSelected();

      Boolean storeTue8w1 = tue8w1.isSelected();
      Boolean storeTue9w1 = tue9w1.isSelected();
      Boolean storeTue10w1 = tue10w1.isSelected();
      Boolean storeTue11w1 = tue11w1.isSelected();
      Boolean storeTue12w1 = tue12w1.isSelected();
      Boolean storeTue13w1 = tue13w1.isSelected();
      Boolean storeTue14w1 = tue14w1.isSelected();
      Boolean storeTue15w1 = tue15w1.isSelected();
      Boolean storeTue16w1 = tue16w1.isSelected();
      Boolean storeTue17w1 = tue17w1.isSelected();
      Boolean storeTue18w1 = tue18w1.isSelected();
      Boolean storeTue19w1 = tue19w1.isSelected();
      Boolean storeTue20w1 = tue20w1.isSelected();
      Boolean storeTue21w1 = tue21w1.isSelected();

      Boolean storeWed8w1 = wed8w1.isSelected();
      Boolean storeWed9w1 = wed9w1.isSelected();
      Boolean storeWed10w1 = wed10w1.isSelected();
      Boolean storeWed11w1 = wed11w1.isSelected();
      Boolean storeWed12w1 = wed12w1.isSelected();
      Boolean storeWed13w1 = wed13w1.isSelected();
      Boolean storeWed14w1 = wed14w1.isSelected();
      Boolean storeWed15w1 = wed15w1.isSelected();
      Boolean storeWed16w1 = wed16w1.isSelected();
      Boolean storeWed17w1 = wed17w1.isSelected();
      Boolean storeWed18w1 = wed18w1.isSelected();
      Boolean storeWed19w1 = wed19w1.isSelected();
      Boolean storeWed20w1 = wed20w1.isSelected();
      Boolean storeWed21w1 = wed21w1.isSelected();

      Boolean storeThu8w1 = thu8w1.isSelected();
      Boolean storeThu9w1 = thu9w1.isSelected();
      Boolean storeThu10w1 = thu10w1.isSelected();
      Boolean storeThu11w1 = thu11w1.isSelected();
      Boolean storeThu12w1 = thu12w1.isSelected();
      Boolean storeThu13w1 = thu13w1.isSelected();
      Boolean storeThu14w1 = thu14w1.isSelected();
      Boolean storeThu15w1 = thu15w1.isSelected();
      Boolean storeThu16w1 = thu16w1.isSelected();
      Boolean storeThu17w1 = thu17w1.isSelected();
      Boolean storeThu18w1 = thu18w1.isSelected();
      Boolean storeThu19w1 = thu19w1.isSelected();
      Boolean storeThu20w1 = thu20w1.isSelected();
      Boolean storeThu21w1 = thu21w1.isSelected();

      Boolean storeFri8w1 = fri8w1.isSelected();
      Boolean storeFri9w1 = fri9w1.isSelected();
      Boolean storeFri10w1 = fri10w1.isSelected();
      Boolean storeFri11w1 = fri11w1.isSelected();
      Boolean storeFri12w1 = fri12w1.isSelected();
      Boolean storeFri13w1 = fri13w1.isSelected();
      Boolean storeFri14w1 = fri14w1.isSelected();
      Boolean storeFri15w1 = fri15w1.isSelected();
      Boolean storeFri16w1 = fri16w1.isSelected();
      Boolean storeFri17w1 = fri17w1.isSelected();
      Boolean storeFri18w1 = fri18w1.isSelected();
      Boolean storeFri19w1 = fri19w1.isSelected();
      Boolean storeFri20w1 = fri20w1.isSelected();
      Boolean storeFri21w1 = fri21w1.isSelected();

      Boolean storeSat8w1 = sat8w1.isSelected();
      Boolean storeSat9w1 = sat9w1.isSelected();
      Boolean storeSat10w1 = sat10w1.isSelected();
      Boolean storeSat11w1 = sat11w1.isSelected();
      Boolean storeSat12w1 = sat12w1.isSelected();
      Boolean storeSat13w1 = sat13w1.isSelected();
      Boolean storeSat14w1 = sat14w1.isSelected();
      Boolean storeSat15w1 = sat15w1.isSelected();
      Boolean storeSat16w1 = sat16w1.isSelected();
      Boolean storeSat17w1 = sat17w1.isSelected();
      Boolean storeSat18w1 = sat18w1.isSelected();
      Boolean storeSat19w1 = sat19w1.isSelected();
      Boolean storeSat20w1 = sat20w1.isSelected();
      Boolean storeSat21w1 = sat21w1.isSelected();

      Boolean storeSun8w1 = sun8w1.isSelected();
      Boolean storeSun9w1 = sun9w1.isSelected();
      Boolean storeSun10w1 = sun10w1.isSelected();
      Boolean storeSun11w1 = sun11w1.isSelected();
      Boolean storeSun12w1 = sun12w1.isSelected();
      Boolean storeSun13w1 = sun13w1.isSelected();
      Boolean storeSun14w1 = sun14w1.isSelected();
      Boolean storeSun15w1 = sun15w1.isSelected();
      Boolean storeSun16w1 = sun16w1.isSelected();
      Boolean storeSun17w1 = sun17w1.isSelected();
      Boolean storeSun18w1 = sun18w1.isSelected();
      Boolean storeSun19w1 = sun19w1.isSelected();
      Boolean storeSun20w1 = sun20w1.isSelected();
      Boolean storeSun21w1 = sun21w1.isSelected();

      Boolean storeMon8w2 = mon8w2.isSelected();
      Boolean storeMon9w2 = mon9w2.isSelected();
      Boolean storeMon10w2 = mon10w2.isSelected();
      Boolean storeMon11w2 = mon11w2.isSelected();
      Boolean storeMon12w2 = mon12w2.isSelected();
      Boolean storeMon13w2 = mon13w2.isSelected();
      Boolean storeMon14w2 = mon14w2.isSelected();
      Boolean storeMon15w2 = mon15w2.isSelected();
      Boolean storeMon16w2 = mon16w2.isSelected();
      Boolean storeMon17w2 = mon17w2.isSelected();
      Boolean storeMon18w2 = mon18w2.isSelected();
      Boolean storeMon19w2 = mon19w2.isSelected();
      Boolean storeMon20w2 = mon20w2.isSelected();
      Boolean storeMon21w2 = mon21w2.isSelected();

      Boolean storeTue8w2 = tue8w2.isSelected();
      Boolean storeTue9w2 = tue9w2.isSelected();
      Boolean storeTue10w2 = tue10w2.isSelected();
      Boolean storeTue11w2 = tue11w2.isSelected();
      Boolean storeTue12w2 = tue12w2.isSelected();
      Boolean storeTue13w2 = tue13w2.isSelected();
      Boolean storeTue14w2 = tue14w2.isSelected();
      Boolean storeTue15w2 = tue15w2.isSelected();
      Boolean storeTue16w2 = tue16w2.isSelected();
      Boolean storeTue17w2 = tue17w2.isSelected();
      Boolean storeTue18w2 = tue18w2.isSelected();
      Boolean storeTue19w2 = tue19w2.isSelected();
      Boolean storeTue20w2 = tue20w2.isSelected();
      Boolean storeTue21w2 = tue21w2.isSelected();

      Boolean storeWed8w2 = wed8w2.isSelected();
      Boolean storeWed9w2 = wed9w2.isSelected();
      Boolean storeWed10w2 = wed10w2.isSelected();
      Boolean storeWed11w2 = wed11w2.isSelected();
      Boolean storeWed12w2 = wed12w2.isSelected();
      Boolean storeWed13w2 = wed13w2.isSelected();
      Boolean storeWed14w2 = wed14w2.isSelected();
      Boolean storeWed15w2 = wed15w2.isSelected();
      Boolean storeWed16w2 = wed16w2.isSelected();
      Boolean storeWed17w2 = wed17w2.isSelected();
      Boolean storeWed18w2 = wed18w2.isSelected();
      Boolean storeWed19w2 = wed19w2.isSelected();
      Boolean storeWed20w2 = wed20w2.isSelected();
      Boolean storeWed21w2 = wed21w2.isSelected();

      Boolean storeThu8w2 = thu8w2.isSelected();
      Boolean storeThu9w2 = thu9w2.isSelected();
      Boolean storeThu10w2 = thu10w2.isSelected();
      Boolean storeThu11w2 = thu11w2.isSelected();
      Boolean storeThu12w2 = thu12w2.isSelected();
      Boolean storeThu13w2 = thu13w2.isSelected();
      Boolean storeThu14w2 = thu14w2.isSelected();
      Boolean storeThu15w2 = thu15w2.isSelected();
      Boolean storeThu16w2 = thu16w2.isSelected();
      Boolean storeThu17w2 = thu17w2.isSelected();
      Boolean storeThu18w2 = thu18w2.isSelected();
      Boolean storeThu19w2 = thu19w2.isSelected();
      Boolean storeThu20w2 = thu20w2.isSelected();
      Boolean storeThu21w2 = thu21w2.isSelected();

      Boolean storeFri8w2 = fri8w2.isSelected();
      Boolean storeFri9w2 = fri9w2.isSelected();
      Boolean storeFri10w2 = fri10w2.isSelected();
      Boolean storeFri11w2 = fri11w2.isSelected();
      Boolean storeFri12w2 = fri12w2.isSelected();
      Boolean storeFri13w2 = fri13w2.isSelected();
      Boolean storeFri14w2 = fri14w2.isSelected();
      Boolean storeFri15w2 = fri15w2.isSelected();
      Boolean storeFri16w2 = fri16w2.isSelected();
      Boolean storeFri17w2 = fri17w2.isSelected();
      Boolean storeFri18w2 = fri18w2.isSelected();
      Boolean storeFri19w2 = fri19w2.isSelected();
      Boolean storeFri20w2 = fri20w2.isSelected();
      Boolean storeFri21w2 = fri21w2.isSelected();

      Boolean storeSat8w2 = sat8w2.isSelected();
      Boolean storeSat9w2 = sat9w2.isSelected();
      Boolean storeSat10w2 = sat10w2.isSelected();
      Boolean storeSat11w2 = sat11w2.isSelected();
      Boolean storeSat12w2 = sat12w2.isSelected();
      Boolean storeSat13w2 = sat13w2.isSelected();
      Boolean storeSat14w2 = sat14w2.isSelected();
      Boolean storeSat15w2 = sat15w2.isSelected();
      Boolean storeSat16w2 = sat16w2.isSelected();
      Boolean storeSat17w2 = sat17w2.isSelected();
      Boolean storeSat18w2 = sat18w2.isSelected();
      Boolean storeSat19w2 = sat19w2.isSelected();
      Boolean storeSat20w2 = sat20w2.isSelected();
      Boolean storeSat21w2 = sat21w2.isSelected();

      Boolean storeSun8w2 = sun8w2.isSelected();
      Boolean storeSun9w2 = sun9w2.isSelected();
      Boolean storeSun10w2 = sun10w2.isSelected();
      Boolean storeSun11w2 = sun11w2.isSelected();
      Boolean storeSun12w2 = sun12w2.isSelected();
      Boolean storeSun13w2 = sun13w2.isSelected();
      Boolean storeSun14w2 = sun14w2.isSelected();
      Boolean storeSun15w2 = sun15w2.isSelected();
      Boolean storeSun16w2 = sun16w2.isSelected();
      Boolean storeSun17w2 = sun17w2.isSelected();
      Boolean storeSun18w2 = sun18w2.isSelected();
      Boolean storeSun19w2 = sun19w2.isSelected();
      Boolean storeSun20w2 = sun20w2.isSelected();
      Boolean storeSun21w2 = sun21w2.isSelected();

       String userName = userStorageDAO.getUserName();

      Day mondayWeek1 = new Day(userName, "Week 1 Monday", storeMon8w1, storeMon9w1, storeMon10w1, storeMon11w1, storeMon12w1,
         storeMon13w1, storeMon14w1, storeMon15w1, storeMon16w1, storeMon17w1, storeMon18w1, storeMon19w1,
         storeMon20w1, storeMon21w1);

      Day tuesdayWeek1 = new Day(userName, "Week 1 Tuesday", storeTue8w1, storeTue9w1, storeTue10w1, storeTue11w1, storeTue12w1,
         storeTue13w1, storeTue14w1, storeTue15w1, storeTue16w1, storeTue17w1, storeTue18w1, storeTue19w1,
         storeTue20w1, storeTue21w1);

      Day wednesdayWeek1 = new Day(userName, "Week 1 Wednesday", storeWed8w1, storeWed9w1, storeWed10w1, storeWed11w1, storeWed12w1,
         storeWed13w1, storeWed14w1, storeWed15w1, storeWed16w1, storeWed17w1, storeWed18w1, storeWed19w1,
         storeWed20w1, storeWed21w1);

      Day thursdayWeek1 = new Day(userName, "Week 1 Thursday", storeThu8w1, storeThu9w1, storeThu10w1, storeThu11w1, storeThu12w1,
         storeThu13w1, storeThu14w1, storeThu15w1, storeThu16w1, storeThu17w1, storeThu18w1, storeThu19w1,
         storeThu20w1, storeThu21w1);

      Day fridayWeek1 = new Day(userName, "Week 1 Friday", storeFri8w1, storeFri9w1, storeFri10w1, storeFri11w1, storeFri12w1,
         storeFri13w1, storeFri14w1, storeFri15w1, storeFri16w1, storeFri17w1, storeFri18w1, storeFri19w1,
         storeFri20w1, storeFri21w1);

      Day saturdayWeek1 = new Day(userName, "Week 1 Saturday", storeSat8w1, storeSat9w1, storeSat10w1, storeSat11w1, storeSat12w1,
         storeSat13w1, storeSat14w1, storeSat15w1, storeSat16w1, storeSat17w1, storeSat18w1, storeSat19w1,
         storeSat20w1, storeSat21w1);

      Day sundayWeek1 = new Day(userName, "Week 1 Sunday", storeSun8w1, storeSun9w1, storeSun10w1, storeSun11w1, storeSun12w1,
         storeSun13w1, storeSun14w1, storeSun15w1, storeSun16w1, storeSun17w1, storeSun18w1, storeSun19w1,
         storeSun20w1, storeSun21w1);

      Day mondayWeek2 = new Day(userName, "Week 2 Monday", storeMon8w2, storeMon9w2, storeMon10w2, storeMon11w2, storeMon12w2,
         storeMon13w2, storeMon14w2, storeMon15w2, storeMon16w2, storeMon17w2, storeMon18w2, storeMon19w2,
         storeMon20w2, storeMon21w2);

      Day tuesdayWeek2 = new Day(userName, "Week 2 Tuesday", storeTue8w2, storeTue9w2, storeTue10w2, storeTue11w2, storeTue12w2,
         storeTue13w2, storeTue14w2, storeTue15w2, storeTue16w2, storeTue17w2, storeTue18w2, storeTue19w2,
         storeTue20w2, storeTue21w2);

      Day wednesdayWeek2 = new Day(userName, "Week 2 Wednesday", storeWed8w2, storeWed9w2, storeWed10w2, storeWed11w2, storeWed12w2,
         storeWed13w2, storeWed14w2, storeWed15w2, storeWed16w2, storeWed17w2, storeWed18w2, storeWed19w2,
         storeWed20w2, storeWed21w2);

      Day thursdayWeek2 = new Day(userName, "Week 2 Thursday", storeThu8w2, storeThu9w2, storeThu10w2, storeThu11w2, storeThu12w2,
         storeThu13w2, storeThu14w2, storeThu15w2, storeThu16w2, storeThu17w2, storeThu18w2, storeThu19w2,
         storeThu20w2, storeThu21w2);

      Day fridayWeek2 = new Day(userName, "Week 2 Friday", storeFri8w2, storeFri9w2, storeFri10w2, storeFri11w2, storeFri12w2,
         storeFri13w2, storeFri14w2, storeFri15w2, storeFri16w2, storeFri17w2, storeFri18w2, storeFri19w2,
         storeFri20w2, storeFri21w2);

      Day saturdayWeek2 = new Day(userName, "Week 2 Saturday", storeSat8w2, storeSat9w2, storeSat10w2, storeSat11w2, storeSat12w2,
         storeSat13w2, storeSat14w2, storeSat15w2, storeSat16w2, storeSat17w2, storeSat18w2, storeSat19w2,
         storeSat20w2, storeSat21w2);

      Day sundayWeek2 = new Day(userName, "Week 2 Sunday", storeSun8w2, storeSun9w2, storeSun10w2, storeSun11w2, storeSun12w2,
         storeSun13w2, storeSun14w2, storeSun15w2, storeSun16w2, storeSun17w2, storeSun18w2, storeSun19w2,
         storeSun20w2, storeSun21w2);
		
      if (storeMon8w2 == false && storeMon9w2 == false && storeMon10w2 == false && storeMon11w2 == false && storeMon12w2
         == false && storeMon13w2 == false && storeMon14w2 == false && storeMon15w2 == false && storeMon16w2 == false && storeMon17w2 == false && storeMon18w2 == false && storeMon19w2
         == false && storeMon20w2 == false && storeMon21w2 == false && storeTue8w2 == false && storeTue9w2 == false && storeTue10w2 == false && storeTue11w2 == false && storeTue12w2
         == false && storeTue13w2 == false && storeTue14w2 == false && storeTue15w2 == false && storeTue16w2 == false && storeTue17w2 == false && storeTue18w2 == false && storeTue19w2
         == false && storeTue20w2 == false && storeTue21w2 == false && storeWed8w2 == false && storeWed9w2 == false && storeWed10w2 == false && storeWed11w2 == false && storeWed12w2
         == false && storeWed13w2 == false && storeWed14w2 == false && storeWed15w2 == false && storeWed16w2 == false && storeWed17w2 == false && storeWed18w2 == false && storeWed19w2
         == false && storeWed20w2 == false && storeWed21w2 == false && storeThu8w2 == false && storeThu9w2 == false && storeThu10w2 == false && storeThu11w2 == false && storeThu12w2
         == false && storeThu13w2 == false && storeThu14w2 == false && storeThu15w2 == false && storeThu16w2 == false && storeThu17w2 == false && storeThu18w2 == false && storeThu19w2
         == false && storeThu20w2 == false && storeThu21w2 == false && storeFri8w2 == false && storeFri9w2 == false && storeFri10w2 == false && storeFri11w2 == false && storeFri12w2
         == false && storeFri13w2 == false && storeFri14w2 == false && storeFri15w2 == false && storeFri16w2 == false && storeFri17w2 == false && storeFri18w2 == false && storeFri19w2
         == false && storeFri20w2 == false && storeFri21w2 == false && storeSat8w2 == false && storeSat9w2 == false && storeSat10w2 == false && storeSat11w2 == false && storeSat12w2
         == false && storeSat13w2 == false && storeSat14w2 == false && storeSat15w2 == false && storeSat16w2 == false && storeSat17w2 == false && storeSat18w2 == false && storeSat19w2
         == false && storeSat20w2 == false && storeSat21w2 == false && storeSun8w2 == false && storeSun9w2 == false && storeSun10w2 == false && storeSun11w2 == false && storeSun12w2
         == false && storeSun13w2 == false && storeSun14w2 == false && storeSun15w2 == false && storeSun16w2 == false && storeSun17w2 == false && storeSun18w2 == false && storeSun19w2
         == false && storeSun20w2 == false && storeSun21w2 == false) {

         mondayWeek2.setEightAM(storeMon8w1);
         mondayWeek2.setNineAM(storeMon9w1);
         mondayWeek2.setTenAM(storeMon10w1);
         mondayWeek2.setElevenAM(storeMon11w1);
         mondayWeek2.setTwelvePM(storeMon12w1);
         mondayWeek2.setOnePM(storeMon13w1);
         mondayWeek2.setTwoPM(storeMon14w1);
         mondayWeek2.setThreePM(storeMon15w1);
         mondayWeek2.setFourPM(storeMon16w1);
         mondayWeek2.setFivePM(storeMon17w1);
         mondayWeek2.setSixPM(storeMon18w1);
         mondayWeek2.setSevenPM(storeMon19w1);
         mondayWeek2.setEightPM(storeMon20w1);
         mondayWeek2.setNinePM(storeMon21w1);
         mondayWeek2.setDayName("Week 2 Monday");

         tuesdayWeek2.setEightAM(storeTue8w1);
         tuesdayWeek2.setNineAM(storeTue9w1);
         tuesdayWeek2.setTenAM(storeTue10w1);
         tuesdayWeek2.setElevenAM(storeTue11w1);
         tuesdayWeek2.setTwelvePM(storeTue12w1);
         tuesdayWeek2.setOnePM(storeTue13w1);
         tuesdayWeek2.setTwoPM(storeTue14w1);
         tuesdayWeek2.setThreePM(storeTue15w1);
         tuesdayWeek2.setFourPM(storeTue16w1);
         tuesdayWeek2.setFivePM(storeTue17w1);
         tuesdayWeek2.setSixPM(storeTue18w1);
         tuesdayWeek2.setSevenPM(storeTue19w1);
         tuesdayWeek2.setEightPM(storeTue20w1);
         tuesdayWeek2.setNinePM(storeTue21w1);
         tuesdayWeek2.setDayName("Week 2 Tuesday");

         wednesdayWeek2.setEightAM(storeWed8w1);
         wednesdayWeek2.setNineAM(storeWed9w1);
         wednesdayWeek2.setTenAM(storeWed10w1);
         wednesdayWeek2.setElevenAM(storeWed11w1);
         wednesdayWeek2.setTwelvePM(storeWed12w1);
         wednesdayWeek2.setOnePM(storeWed13w1);
         wednesdayWeek2.setTwoPM(storeWed14w1);
         wednesdayWeek2.setThreePM(storeWed15w1);
         wednesdayWeek2.setFourPM(storeWed16w1);
         wednesdayWeek2.setFivePM(storeWed17w1);
         wednesdayWeek2.setSixPM(storeWed18w1);
         wednesdayWeek2.setSevenPM(storeWed19w1);
         wednesdayWeek2.setEightPM(storeWed20w1);
         wednesdayWeek2.setNinePM(storeWed21w1);
         wednesdayWeek2.setDayName("Week 2 Wednesday");

         thursdayWeek2.setEightAM(storeThu8w1);
         thursdayWeek2.setNineAM(storeThu9w1);
         thursdayWeek2.setTenAM(storeThu10w1);
         thursdayWeek2.setElevenAM(storeThu11w1);
         thursdayWeek2.setTwelvePM(storeThu12w1);
         thursdayWeek2.setOnePM(storeThu13w1);
         thursdayWeek2.setTwoPM(storeThu14w1);
         thursdayWeek2.setThreePM(storeThu15w1);
         thursdayWeek2.setFourPM(storeThu16w1);
         thursdayWeek2.setFivePM(storeThu17w1);
         thursdayWeek2.setSixPM(storeThu18w1);
         thursdayWeek2.setSevenPM(storeThu19w1);
         thursdayWeek2.setEightPM(storeThu20w1);
         thursdayWeek2.setNinePM(storeThu21w1);
			thursdayWeek2.setDayName("Week 2 Thursday");

         fridayWeek2.setEightAM(storeFri8w1);
         fridayWeek2.setNineAM(storeFri9w1);
         fridayWeek2.setTenAM(storeFri10w1);
         fridayWeek2.setElevenAM(storeFri11w1);
         fridayWeek2.setTwelvePM(storeFri12w1);
         fridayWeek2.setOnePM(storeFri13w1);
         fridayWeek2.setTwoPM(storeFri14w1);
         fridayWeek2.setThreePM(storeFri15w1);
         fridayWeek2.setFourPM(storeFri16w1);
         fridayWeek2.setFivePM(storeFri17w1);
         fridayWeek2.setSixPM(storeFri18w1);
         fridayWeek2.setSevenPM(storeFri19w1);
         fridayWeek2.setEightPM(storeFri20w1);
         fridayWeek2.setNinePM(storeFri21w1);
         fridayWeek2.setDayName("Week 2 Friday");

         saturdayWeek2.setEightAM(storeSat8w1);
         saturdayWeek2.setNineAM(storeSat9w1);
         saturdayWeek2.setTenAM(storeSat10w1);
         saturdayWeek2.setElevenAM(storeSat11w1);
         saturdayWeek2.setTwelvePM(storeSat12w1);
         saturdayWeek2.setOnePM(storeSat13w1);
         saturdayWeek2.setTwoPM(storeSat14w1);
         saturdayWeek2.setThreePM(storeSat15w1);
         saturdayWeek2.setFourPM(storeSat16w1);
         saturdayWeek2.setFivePM(storeSat17w1);
         saturdayWeek2.setSixPM(storeSat18w1);
         saturdayWeek2.setSevenPM(storeSat19w1);
         saturdayWeek2.setEightPM(storeSat20w1);
         saturdayWeek2.setNinePM(storeSat21w1);
         saturdayWeek2.setDayName("Week 2 Saturday");

         sundayWeek2.setEightAM(storeSun8w1);
         sundayWeek2.setNineAM(storeSun9w1);
         sundayWeek2.setTenAM(storeSun10w1);
         sundayWeek2.setElevenAM(storeSun11w1);
         sundayWeek2.setTwelvePM(storeSun12w1);
         sundayWeek2.setOnePM(storeSun13w1);
         sundayWeek2.setTwoPM(storeSun14w1);
         sundayWeek2.setThreePM(storeSun15w1);
         sundayWeek2.setFourPM(storeSun16w1);
         sundayWeek2.setFivePM(storeSun17w1);
         sundayWeek2.setSixPM(storeSun18w1);
         sundayWeek2.setSevenPM(storeSun19w1);
         sundayWeek2.setEightPM(storeSun20w1);
         sundayWeek2.setNinePM(storeSun21w1);
         sundayWeek2.setDayName("Week 2 Sunday");
		}

           saveTimetable(mondayWeek1);
           saveTimetable(tuesdayWeek1);
           saveTimetable(wednesdayWeek1);
           saveTimetable(thursdayWeek1);
           saveTimetable(fridayWeek1);
           saveTimetable(saturdayWeek1);
           saveTimetable(sundayWeek1);

           saveTimetable(mondayWeek2);
           saveTimetable(tuesdayWeek2);
           saveTimetable(wednesdayWeek2);
           saveTimetable(thursdayWeek2);
           saveTimetable(fridayWeek2);
           saveTimetable(saturdayWeek2);
           saveTimetable(sundayWeek2);

           dispose();

       HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userDAO, userStorageDAO);
       //centre the dialog on the parent window
       dialog.setLocationRelativeTo(this);
       //make the dialog visible
       dialog.setVisible(true);
   }//GEN-LAST:event_buttonSaveTimetableActionPerformed

    private void saveTimetable(Day day) {
        timetableDAO.saveDay(day);
    }

   private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
       // TODO add your handling code here:

       int result = JOptionPane.showConfirmDialog(
               this, "Are you sure you want to cancel without saving?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
       // did the user click the yes button?
       if (result == JOptionPane.YES_OPTION) {

           dispose();
           HomeMenu dialog = new HomeMenu(this, true, timetableDAO, userDAO, userStorageDAO);
           // centre the dialog on the parent window
           dialog.setLocationRelativeTo(this);
           // make the dialog visible
           dialog.setVisible(true);
       }
   }//GEN-LAST:event_buttonCancelActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton buttonCancel;
   private javax.swing.JButton buttonSaveTimetable;
   private javax.swing.JCheckBox fri10w1;
   private javax.swing.JCheckBox fri10w2;
   private javax.swing.JCheckBox fri11w1;
   private javax.swing.JCheckBox fri11w2;
   private javax.swing.JCheckBox fri12w1;
   private javax.swing.JCheckBox fri12w2;
   private javax.swing.JCheckBox fri13w1;
   private javax.swing.JCheckBox fri13w2;
   private javax.swing.JCheckBox fri14w1;
   private javax.swing.JCheckBox fri14w2;
   private javax.swing.JCheckBox fri15w1;
   private javax.swing.JCheckBox fri15w2;
   private javax.swing.JCheckBox fri16w1;
   private javax.swing.JCheckBox fri16w2;
   private javax.swing.JCheckBox fri17w1;
   private javax.swing.JCheckBox fri17w2;
   private javax.swing.JCheckBox fri18w1;
   private javax.swing.JCheckBox fri18w2;
   private javax.swing.JCheckBox fri19w1;
   private javax.swing.JCheckBox fri19w2;
   private javax.swing.JCheckBox fri20w1;
   private javax.swing.JCheckBox fri20w2;
   private javax.swing.JCheckBox fri21w1;
   private javax.swing.JCheckBox fri21w2;
   private javax.swing.JCheckBox fri8w1;
   private javax.swing.JCheckBox fri8w2;
   private javax.swing.JCheckBox fri9w1;
   private javax.swing.JCheckBox fri9w2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel mainPanel;
   private javax.swing.JCheckBox mon10w1;
   private javax.swing.JCheckBox mon10w2;
   private javax.swing.JCheckBox mon11w1;
   private javax.swing.JCheckBox mon11w2;
   private javax.swing.JCheckBox mon12w1;
   private javax.swing.JCheckBox mon12w2;
   private javax.swing.JCheckBox mon13w1;
   private javax.swing.JCheckBox mon13w2;
   private javax.swing.JCheckBox mon14w1;
   private javax.swing.JCheckBox mon14w2;
   private javax.swing.JCheckBox mon15w1;
   private javax.swing.JCheckBox mon15w2;
   private javax.swing.JCheckBox mon16w1;
   private javax.swing.JCheckBox mon16w2;
   private javax.swing.JCheckBox mon17w1;
   private javax.swing.JCheckBox mon17w2;
   private javax.swing.JCheckBox mon18w1;
   private javax.swing.JCheckBox mon18w2;
   private javax.swing.JCheckBox mon19w1;
   private javax.swing.JCheckBox mon19w2;
   private javax.swing.JCheckBox mon20w1;
   private javax.swing.JCheckBox mon20w2;
   private javax.swing.JCheckBox mon21w1;
   private javax.swing.JCheckBox mon21w2;
   private javax.swing.JCheckBox mon8w1;
   private javax.swing.JCheckBox mon8w2;
   private javax.swing.JCheckBox mon9w1;
   private javax.swing.JCheckBox mon9w2;
   private javax.swing.JCheckBox sat10w1;
   private javax.swing.JCheckBox sat10w2;
   private javax.swing.JCheckBox sat11w1;
   private javax.swing.JCheckBox sat11w2;
   private javax.swing.JCheckBox sat12w1;
   private javax.swing.JCheckBox sat12w2;
   private javax.swing.JCheckBox sat13w1;
   private javax.swing.JCheckBox sat13w2;
   private javax.swing.JCheckBox sat14w1;
   private javax.swing.JCheckBox sat14w2;
   private javax.swing.JCheckBox sat15w1;
   private javax.swing.JCheckBox sat15w2;
   private javax.swing.JCheckBox sat16w1;
   private javax.swing.JCheckBox sat16w2;
   private javax.swing.JCheckBox sat17w1;
   private javax.swing.JCheckBox sat17w2;
   private javax.swing.JCheckBox sat18w1;
   private javax.swing.JCheckBox sat18w2;
   private javax.swing.JCheckBox sat19w1;
   private javax.swing.JCheckBox sat19w2;
   private javax.swing.JCheckBox sat20w1;
   private javax.swing.JCheckBox sat20w2;
   private javax.swing.JCheckBox sat21w1;
   private javax.swing.JCheckBox sat21w2;
   private javax.swing.JCheckBox sat8w1;
   private javax.swing.JCheckBox sat8w2;
   private javax.swing.JCheckBox sat9w1;
   private javax.swing.JCheckBox sat9w2;
   private javax.swing.JPanel secondaryPanel;
   private javax.swing.JCheckBox sun10w1;
   private javax.swing.JCheckBox sun10w2;
   private javax.swing.JCheckBox sun11w1;
   private javax.swing.JCheckBox sun11w2;
   private javax.swing.JCheckBox sun12w1;
   private javax.swing.JCheckBox sun12w2;
   private javax.swing.JCheckBox sun13w1;
   private javax.swing.JCheckBox sun13w2;
   private javax.swing.JCheckBox sun14w1;
   private javax.swing.JCheckBox sun14w2;
   private javax.swing.JCheckBox sun15w1;
   private javax.swing.JCheckBox sun15w2;
   private javax.swing.JCheckBox sun16w1;
   private javax.swing.JCheckBox sun16w2;
   private javax.swing.JCheckBox sun17w1;
   private javax.swing.JCheckBox sun17w2;
   private javax.swing.JCheckBox sun18w1;
   private javax.swing.JCheckBox sun18w2;
   private javax.swing.JCheckBox sun19w1;
   private javax.swing.JCheckBox sun19w2;
   private javax.swing.JCheckBox sun20w1;
   private javax.swing.JCheckBox sun20w2;
   private javax.swing.JCheckBox sun21w1;
   private javax.swing.JCheckBox sun21w2;
   private javax.swing.JCheckBox sun8w1;
   private javax.swing.JCheckBox sun8w2;
   private javax.swing.JCheckBox sun9w1;
   private javax.swing.JCheckBox sun9w2;
   private javax.swing.JButton switchButton;
   private javax.swing.JCheckBox thu10w1;
   private javax.swing.JCheckBox thu10w2;
   private javax.swing.JCheckBox thu11w1;
   private javax.swing.JCheckBox thu11w2;
   private javax.swing.JCheckBox thu12w1;
   private javax.swing.JCheckBox thu12w2;
   private javax.swing.JCheckBox thu13w1;
   private javax.swing.JCheckBox thu13w2;
   private javax.swing.JCheckBox thu14w1;
   private javax.swing.JCheckBox thu14w2;
   private javax.swing.JCheckBox thu15w1;
   private javax.swing.JCheckBox thu15w2;
   private javax.swing.JCheckBox thu16w1;
   private javax.swing.JCheckBox thu16w2;
   private javax.swing.JCheckBox thu17w1;
   private javax.swing.JCheckBox thu17w2;
   private javax.swing.JCheckBox thu18w1;
   private javax.swing.JCheckBox thu18w2;
   private javax.swing.JCheckBox thu19w1;
   private javax.swing.JCheckBox thu19w2;
   private javax.swing.JCheckBox thu20w1;
   private javax.swing.JCheckBox thu20w2;
   private javax.swing.JCheckBox thu21w1;
   private javax.swing.JCheckBox thu21w2;
   private javax.swing.JCheckBox thu8w1;
   private javax.swing.JCheckBox thu8w2;
   private javax.swing.JCheckBox thu9w1;
   private javax.swing.JCheckBox thu9w2;
   private javax.swing.JLabel timetableImage1;
   private javax.swing.JLabel timetableImage2;
   private javax.swing.JLabel titleLabel;
   private javax.swing.JCheckBox tue10w1;
   private javax.swing.JCheckBox tue10w2;
   private javax.swing.JCheckBox tue11w1;
   private javax.swing.JCheckBox tue11w2;
   private javax.swing.JCheckBox tue12w1;
   private javax.swing.JCheckBox tue12w2;
   private javax.swing.JCheckBox tue13w1;
   private javax.swing.JCheckBox tue13w2;
   private javax.swing.JCheckBox tue14w1;
   private javax.swing.JCheckBox tue14w2;
   private javax.swing.JCheckBox tue15w1;
   private javax.swing.JCheckBox tue15w2;
   private javax.swing.JCheckBox tue16w1;
   private javax.swing.JCheckBox tue16w2;
   private javax.swing.JCheckBox tue17w1;
   private javax.swing.JCheckBox tue17w2;
   private javax.swing.JCheckBox tue18w1;
   private javax.swing.JCheckBox tue18w2;
   private javax.swing.JCheckBox tue19w1;
   private javax.swing.JCheckBox tue19w2;
   private javax.swing.JCheckBox tue20w1;
   private javax.swing.JCheckBox tue20w2;
   private javax.swing.JCheckBox tue21w1;
   private javax.swing.JCheckBox tue21w2;
   private javax.swing.JCheckBox tue8w1;
   private javax.swing.JCheckBox tue8w2;
   private javax.swing.JCheckBox tue9w1;
   private javax.swing.JCheckBox tue9w2;
   private javax.swing.JCheckBox wed10w1;
   private javax.swing.JCheckBox wed10w2;
   private javax.swing.JCheckBox wed11w1;
   private javax.swing.JCheckBox wed11w2;
   private javax.swing.JCheckBox wed12w1;
   private javax.swing.JCheckBox wed12w2;
   private javax.swing.JCheckBox wed13w1;
   private javax.swing.JCheckBox wed13w2;
   private javax.swing.JCheckBox wed14w1;
   private javax.swing.JCheckBox wed14w2;
   private javax.swing.JCheckBox wed15w1;
   private javax.swing.JCheckBox wed15w2;
   private javax.swing.JCheckBox wed16w1;
   private javax.swing.JCheckBox wed16w2;
   private javax.swing.JCheckBox wed17w1;
   private javax.swing.JCheckBox wed17w2;
   private javax.swing.JCheckBox wed18w1;
   private javax.swing.JCheckBox wed18w2;
   private javax.swing.JCheckBox wed19w1;
   private javax.swing.JCheckBox wed19w2;
   private javax.swing.JCheckBox wed20w1;
   private javax.swing.JCheckBox wed20w2;
   private javax.swing.JCheckBox wed21w1;
   private javax.swing.JCheckBox wed21w2;
   private javax.swing.JCheckBox wed8w1;
   private javax.swing.JCheckBox wed8w2;
   private javax.swing.JCheckBox wed9w1;
   private javax.swing.JCheckBox wed9w2;
   private javax.swing.JPanel week1;
   private javax.swing.JLabel week1Label;
   private javax.swing.JPanel week1Panel;
   private javax.swing.JPanel week2;
   private javax.swing.JLabel week2Label;
   private javax.swing.JPanel week2Panel;
   // End of variables declaration//GEN-END:variables
}
