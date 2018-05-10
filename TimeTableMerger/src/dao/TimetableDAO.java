/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Day;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public Day getTimetable(String uName, String dName) {

		String sql = "select * from Day where UserName = ? AND DayName = ?";

		try (
				  Connection connection = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = connection.prepareStatement(sql);) {

			stmt.setString(1, uName);
			stmt.setString(2, dName);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// get the data out of the query				
				String userName = rs.getString("userName");
				String dayName = rs.getString("dayName");
				Boolean eightAM = rs.getBoolean("eightAM");
				Boolean nineAM = rs.getBoolean("nineAM");
				Boolean tenAM = rs.getBoolean("tenAM");
				Boolean elevenAM = rs.getBoolean("elevenAM");
				Boolean twelvePM = rs.getBoolean("twelvePM");
				Boolean onePM = rs.getBoolean("onePM");
				Boolean twoPM = rs.getBoolean("twoPM");
				Boolean threePM = rs.getBoolean("threePM");
				Boolean fourPM = rs.getBoolean("fourPM");
				Boolean fivePM = rs.getBoolean("fivePM");
				Boolean sixPM = rs.getBoolean("sixPM");
				Boolean sevenPM = rs.getBoolean("sevenPM");
				Boolean eightPM = rs.getBoolean("eightPM");
				Boolean ninePM = rs.getBoolean("ninePM");

				return new Day(userName, dayName, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM);
			} else {
				return null;
			}

		} catch (SQLException ex) {
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
	
		public void deleteDay(Day day) {
		String sql = "delete from Day where DayName = ?";

		try (
				  Connection connection = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = connection.prepareStatement(sql);) {

			stmt.setString(1, day.getDayName());

			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
}
