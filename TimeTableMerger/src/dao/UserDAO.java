package dao;

import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author duecl801
 */
public class UserDAO {

	private String url = "jdbc:h2:tcp://localhost:9092/info310;IFEXISTS=TRUE";

	public UserDAO() {
	}

	public UserDAO(String url) {
		this.url = url;
	}

	public void saveUser(User user) {
		String sql = "merge into User (UserName, Password, FirstName, LastName, Email) values (?,?,?,?,?)";
		//String sql2 = "merge into Contact (UserName) values (?)";

		try (
				  Connection dbCon = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = dbCon.prepareStatement(sql);
				  //PreparedStatement stmt2 = dbCon.prepareStatement(sql2)
				  ){

			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getFirstName());
			stmt.setString(4, user.getLastName());
			stmt.setString(5, user.getEmail());
			
			//stmt2.setString(1, user.getUserName());

			stmt.executeUpdate();
			//stmt2.executeUpdate(); 

		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}

	public User getUser(String userName) {
		String sql = "select * from user where username = ?";

		try (
				  // get connection to database
				  Connection connection = JdbcConnection.getConnection(this.url);
				  // create the statement
				  PreparedStatement stmt = connection.prepareStatement(sql);) {
			// set the parameter
			stmt.setString(1, userName);

			// execute the query
			ResultSet rs = stmt.executeQuery();

			// query only returns a single result, so use 'if' instead of 'while'
			if (rs.next()) {
				String username2 = rs.getString("username");
				String fname = rs.getString("firstname");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String lname = rs.getString("lastname");

				User c = new User(username2, fname, lname, password, email);
				return c;

			} else {
				// no student matches given ID so return null
				return null;
			}

		} catch (SQLException ex) {  // we are forced to catch SQLException
			// don't let the SQLException leak from our DAO encapsulation
			throw new DAOException(ex.getMessage(), ex);
		}
	}

	public Boolean validateCredentials(String userName, String password) {
		String sql = "select * from user where username = ? and password = ? ";

		try (
				  // get connection to database
				  Connection connection = JdbcConnection.getConnection(this.url);
				  // create the statement
				  PreparedStatement stmt = connection.prepareStatement(sql);) {
			// set the parameter
			stmt.setString(1, userName);
			stmt.setString(2, password);
			// execute the query
			ResultSet rs = stmt.executeQuery();

			// query only returns a single result, so use 'if' instead of 'while'
			if (rs.next()) {
				return true;
			} else {
				// no student matches given ID so return null
				return false;
			}

		} catch (SQLException ex) {  // we are forced to catch SQLException
			// don't let the SQLException leak from our DAO encapsulation
			throw new DAOException(ex.getMessage(), ex);
		}
	}

	public Set<User> getUserList() {
		String sql = "select * from User order by FirstName";

		try (
				  Connection dbCon = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = dbCon.prepareStatement(sql);) {

			ResultSet rs = stmt.executeQuery();
			Set<User> users = new HashSet<>();

			while (rs.next()) {
				String userName = rs.getString("UserName");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String email = rs.getString("Email");
				String password = rs.getString("Password");

				User u = new User(userName, firstName, lastName, email, password);

				users.add(u);
			}
			return users;

		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
	
	public Collection<String> getContactList(String currentUser) {
		String sql = "select * from contact where username = ? order by contactfirstname";

		try (Connection dbCon = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			
			stmt.setString(1, currentUser);

			ResultSet rs = stmt.executeQuery();
			ArrayList<String> contacts = new ArrayList<>();

			while (rs.next()) {
				String userName = rs.getString("contactList");
				String firstName = rs.getString("contactFirstName");
				String lastName = rs.getString("contactLastName");
				contacts.add(firstName + " " + lastName + "       UserName: " + userName);
				
			}
			return contacts;

		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
	

	
	public User searchByUserName(String userName) {
		String sql = "select * from user where username = ?";
		try (
				  // get connection to database
				  Connection connection = JdbcConnection.getConnection(this.url);
				  // create the statement
				  PreparedStatement stmt = connection.prepareStatement(sql);) {
			// set the parameter
			stmt.setString(1, userName);

			// execute the query
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
                String username = rs.getString("username");
                String fname = rs.getString("firstname");
					 String lname = rs.getString("lastname");
                String password = rs.getString("password");
					 String email = rs.getString("email");
				User u = new User(username, fname, lname, password, email);
				return u; 
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
	
	
	public Collection<User> searchByName(String firstName) {
		String sql = "select * from user where firstname = ?";
		try (
				  // get connection to database
				  Connection connection = JdbcConnection.getConnection(this.url);
				  // create the statement
				  PreparedStatement stmt = connection.prepareStatement(sql);) {
			// set the parameter
			stmt.setString(1, firstName);

			// execute the query
			ResultSet rs = stmt.executeQuery();
			ArrayList<User> userList = new ArrayList<>();


			while (rs.next()) {
                String username = rs.getString("username");
                String fname = rs.getString("firstname");
					 String lname = rs.getString("lastname");
                String password = rs.getString("password");
					 String email = rs.getString("email");
				User u = new User(username, fname, lname, password, email);
				userList.add(u);
			}
			return userList;
			
		} catch (SQLException ex) {
			throw new DAOException(ex.getMessage(), ex);
		}
	}
	/*
		public Set<String> getContactList(String currentUser) {
		String sql = "select * from contact where username = ?";

		try (Connection dbCon = JdbcConnection.getConnection(url);
				  PreparedStatement stmt = dbCon.prepareStatement(sql);) {
			
			stmt.setString(1, currentUser);

			ResultSet rs = stmt.executeQuery();
			Set<String> contacts = new HashSet<>();

			while (rs.next()) {
				String userName = rs.getString("contactList");
				contacts.add(userName);
				
			}
			return contacts;

		} catch (SQLException ex) {  // we are forced to catch SQLException
			// don't let the SQLException leak from our DAO encapsulation
			throw new DAOException(ex.getMessage(), ex);
		}
	}*/
		
	public void addContact(String userName, String contactUserName, String contactFirstName, String contactLastName) {
		//String sql= "merge into contact (username, firstname, lastname, contactlist) values (?, ?, ?, ?)";
      String sql= "merge into contact (username, contactlist, contactfirstname, contactlastname) values (?, ?, ?, ?)";
    try (
        // get connection to database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {        
		  stmt.setString(1, userName);
		  stmt.setString(2, contactUserName);
		  stmt.setString(3, contactFirstName);
		  stmt.setString(4, contactLastName);
		 
        stmt.executeUpdate();  // execute the statement

    } catch (SQLException ex) {  
		  throw new DAOException(ex.getMessage(), ex);
    }
	}

}
