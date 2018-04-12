package dao;

import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author duecl801
 */
public class UserDAO {
	
	private String URL = "jdbc:h2:tcp://localhost:9053/project;IFEXISTS=TRUE";
	
	public UserDAO(){
	}
	
	public UserDAO(String URL) {
		this.URL = URL;
	}
	
		public void saveUser(User user) {
		String sql = "merge into User (UserName, Password, FirstName, LastName, Email) values (?,?,?,?,?)";

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
		
			//public User findByUserName(String UserName) {

		//String sql = "select * from User where UserName = ?";

		//try (
				 //Connection connection = JdbcConnection.getConnection(URL);
				  //PreparedStatement stmt = connection.prepareStatement(sql);) {

			//stmt.setString(1, UserName);
			//ResultSet rs = stmt.executeQuery();

			//if (rs.next()) {
				//String userName = rs.getString("UserName");
				//String password = rs.getString("Password");
				//String firstName = rs.getString("FirstName");
				//String lastName = rs.getString("LastName");
				//String email = rs.getString("Email");

				//return new User(userName, password, firstName, lastName, email);
			//} else {
				//return null;
			//}

		//} catch (SQLException ex) {
			//throw new DAOException(ex.getMessage(), ex);
		//}
	//}
}
