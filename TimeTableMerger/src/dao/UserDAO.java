package dao;

import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

        try (
                Connection dbCon = JdbcConnection.getConnection(url);
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

    public void searchByUserName(String UserName) {

    }
    //public User findByUserName(String UserName) {

    //String sql = "select * from User where UserName = ?";
    //try (
    //Connection connection = JdbcConnection.getConnection(url);
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
    /*
///
	String url = "jdbc:h2:tcp://localhost:9018/project;IFEXISTS=TRUE;";
	

	public ManageCustomersDAO() {
	}
	
	public ManageCustomersDAO(String url) {
		this.url = url;
	}
	
	public String getConnection(String url){
		this.url = url;
		return url; 
	}
	
	@Override
	public void save(Customer customer) {
		String sql="merge into customer (username, name, emailAddress, shippingAddress, creditCardDetails, password) values (?,?,?,?,?,?)";

    try (
        // get connection to database
        Connection dbCon = JdbcConnection.getConnection(url);

        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // copy the data from the product domain object into the SQL parameters
        stmt.setString(1, customer.getUsername());
        stmt.setString(2, customer.getName());
		  stmt.setString(3, customer.getEmailAddress());
		  stmt.setString(4, customer.getAddress());
		  stmt.setString(5, customer.getCreditCard());
		  stmt.setString(6, customer.getPassword());

        stmt.executeUpdate();  // execute the statement

    } catch (SQLException ex) {  // we are forced to catch SQLException
        // don't let the SQLException leak from our DAO encapsulation
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
	}
	
	@Override
	public Customer getCustomer(String userName) {
		String sql = "select * from Customer where username = ?";

    try (
        // get a connection to the database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // execute the query
		  stmt.setString(1, userName);
        ResultSet rs = stmt.executeQuery();

        // iterate through the query results
        if(rs.next()) {
            // get the data out of the query
            String username = rs.getString("username");
            String name = rs.getString("name");
				String emailAddress = rs.getString("emailAddress");
				String shippingAddress = rs.getString("shippingAddress");
            String creditCardDetails = rs.getString("creditCardDetails");
				String password = rs.getString("password");

            // use the data to create a customer object
				Customer c = new Customer(username, name, emailAddress, shippingAddress, creditCardDetails, password);
				return c;
        }else{
			  return null;
		  }
   
    } catch (SQLException ex) {
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
	}
	/*
		public Boolean validateCredentials(String userName, String password) {
		if (customers.containsKey(userName)) {
			return customers.get(userName).getPassword().equals(password);
		} else {
			return false;
		}
	}
	
     */
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

}

/*
	String sql = "select username, password from Customer";

    try (
        // get a connection to the database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // execute the query
		  stmt.setString(1, userName);
		  stmt.setString(6, passWord);
        ResultSet rs = stmt.executeQuery();

        // iterate through the query results
        if(rs.next()) {
            // get the data out of the query
            String username = rs.getString("username");
				String password = rs.getString("password");

				if(username.equals(userName) && password.equals(passWord)){
					return true;
				}else{
					return false;
				}
			}
   
    } catch (SQLException ex) {
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
		return null;
	}
}
 */
