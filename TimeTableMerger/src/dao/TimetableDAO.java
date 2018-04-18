/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Day;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author claireduell
 */
public class TimetableDAO {

    private String url = "jdbc:h2:tcp://localhost:9092/info310;IFEXISTS=TRUE";

    public TimetableDAO() {
        //Uses default URL
    }

    public TimetableDAO(String url) {
        this.url = url;
    }

    //Will this actually work? we'll probably have to revisit
    public Collection<Day> getTimetable(Day day) {
        String sql = "select * from Day where UserName = ?";

        try (
                Connection dbCon = JdbcConnection.getConnection(url);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {

            ResultSet rs = stmt.executeQuery();

            List<Day> days = new ArrayList<>();

            while (rs.next()) {

                // get the data out of the query				
                String userName = rs.getString("userName");
                String dayName = rs.getString("dayName");
                Boolean eightAM = rs.getBoolean("eightAM");
                Boolean nineAM = rs.getBoolean("nineAM");
                Boolean tenAM = rs.getBoolean("tenAM");
                Boolean elevenAM = rs.getBoolean("elevenAM");
                Boolean twelvePM = rs.getBoolean("twlevePM");
                Boolean onePM = rs.getBoolean("onePM");
                Boolean twoPM = rs.getBoolean("twoPM");
                Boolean threePM = rs.getBoolean("threePM");
                Boolean fourPM = rs.getBoolean("fourPM");
                Boolean fivePM = rs.getBoolean("fivePM");
                Boolean sixPM = rs.getBoolean("sixPM");
                Boolean sevenPM = rs.getBoolean("sevenPM");
                Boolean eightPM = rs.getBoolean("eightPM");
                Boolean ninePM = rs.getBoolean("ninePM");
                // use the data to create a product object
                Day d = new Day(userName, dayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM);

                // and put it in the collection
                days.add(d);
            }

            return days;

        } catch (SQLException ex) {
            //throw new RuntimeException(ex);
            throw new DAOException(ex.getMessage(), ex);
        }
    }

	 
    public void createTimetable(Day day) {
        String sql = "merge into day (UserName, DayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (
                // get connection to database
                Connection dbCon = JdbcConnection.getConnection(url);
                // create the statement
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            // copy the data from the product domain object into the SQL parameters
            stmt.setString(1, day.getUserName());
            stmt.setString(2, day.getDayName());
            stmt.setBoolean(3, day.getEightAM());
            stmt.setBoolean(4, day.getNineAM());
            stmt.setBoolean(5, day.getTenAM());
            stmt.setBoolean(6, day.getElevenAM());
            stmt.setBoolean(7, day.getTwelvePM());
            stmt.setBoolean(8, day.getOnePM());
            stmt.setBoolean(9, day.getTwoPM());
            stmt.setBoolean(10, day.getThreePM());
            stmt.setBoolean(11, day.getFourPM());
            stmt.setBoolean(12, day.getFivePM());
            stmt.setBoolean(13, day.getSixPM());
            stmt.setBoolean(14, day.getSevenPM());
            stmt.setBoolean(15, day.getEightPM());
            stmt.setBoolean(16, day.getNinePM());

            stmt.executeUpdate();  // execute the statement

        } catch (SQLException ex) {  // we are forced to catch SQLException
            // don't let the SQLException leak from our DAO encapsulation
            //throw new RuntimeException(ex);
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    /**
     * This is basically the save method, this definitely needs to change, how
     * can we make it so UserName and DayName are read only? Maybe we restrict
     * this while editing the timetable in the GUI? Surely we did something
     * similar in INFO202, but my Project is completely broken If we restrict it
     * so userName and DayName can't be edited via GUI, then we don't need this
     * method and can just use save. - James
     */
    //This goes into the Timetable editor.java GUI class
    public void editTimeTable(Day day) {

        String sql = "merge into day (UserName, DayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (
                // get connection to database
                Connection dbCon = JdbcConnection.getConnection(url);
                // create the statement
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            // copy the data from the product domain object into the SQL parameters
            stmt.setString(1, day.getUserName());
            stmt.setString(2, day.getDayName());
            stmt.setBoolean(3, day.getEightAM());
            stmt.setBoolean(4, day.getNineAM());
            stmt.setBoolean(5, day.getTenAM());
            stmt.setBoolean(6, day.getElevenAM());
            stmt.setBoolean(7, day.getTwelvePM());
            stmt.setBoolean(8, day.getOnePM());
            stmt.setBoolean(9, day.getTwoPM());
            stmt.setBoolean(10, day.getThreePM());
            stmt.setBoolean(11, day.getFourPM());
            stmt.setBoolean(12, day.getFivePM());
            stmt.setBoolean(13, day.getSixPM());
            stmt.setBoolean(14, day.getSevenPM());
            stmt.setBoolean(15, day.getEightPM());
            stmt.setBoolean(16, day.getNinePM());

            stmt.executeUpdate();  // execute the statement

        } catch (SQLException ex) {  // we are forced to catch SQLException
            // don't let the SQLException leak from our DAO encapsulation
            //throw new RuntimeException(ex);
            throw new DAOException(ex.getMessage(), ex);
        }
    }
	 
//do we need this method? we haven't given the user an option to delete their timetable anywhere in the program
    public void deleteTimeTable(Day day) {
        String sql = "delete from Day where UserName = ?";
        try (
                Connection dbCon = JdbcConnection.getConnection(url);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {

            stmt.setString(1, day.getUserName());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            //throw new RuntimeException(ex);
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    //need to update the values based on the values we are storing in the database
    //is this the same as addTimetable??
    //need to change
	 //can we delete this method? this is the same as createTimetable and isn't currently being used anywhere
    public void saveTimetable(Day day) {
        String sql = "merge into Day (UserName, DayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (
                Connection dbCon = JdbcConnection.getConnection(url);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {

            /*stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getFirstName());
            stmt.setString(4, user.getLastName());
            stmt.setString(5, user.getEmail());

            stmt.executeUpdate();*/
        } catch (SQLException ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
}
