/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Timetable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author claireduell
 */
public class TimetableDAO {
    
    private String URL = "jdbc:h2:tcp://localhost/~/test;IFEXISTS=TRUE";
	
	public TimetableDAO(){
	}
	
	public TimetableDAO(String URL) {
		this.URL = URL;
	}
    /*
        		public void saveTimetable(Timetable timetable) {
		String sql = "merge into Timetable (UserName, Password, FirstName, LastName, Email) values (?,?,?,?,?)";

		try (
				  Connection dbCon = JdbcConnection.getConnection(URL);
				  PreparedStatement stmt = dbCon.prepareStatement(sql);) {

			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getFirstName());
			stmt.setString(4, user.getLastName());
			stmt.setString(5, user.getEmail());

			stmt.executeUpdate();

		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
**/
}

