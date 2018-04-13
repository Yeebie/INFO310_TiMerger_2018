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
        
        
	public void getTimetable(Timetable timetable) {
        }
        /*
        
        //Example from 202
	public Collection<Product> getProduct() {
		String sql = "select * from Product";

    try (
        // get a connection to the database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // execute the query
        ResultSet rs = stmt.executeQuery();
        // Using a List to preserve the order in which the data was returned from the query.
        List<Product> products = new ArrayList<>();

        // iterate through the query results
        while (rs.next()) {

            // get the data out of the query
            Integer id = rs.getInt("product_id");
            String name = rs.getString("name");
				String description = rs.getString("description");
				String category = rs.getString("category");
            BigDecimal price = rs.getBigDecimal("price");
				Integer quantity = rs.getInt("quantity_in_stock");

            // use the data to create a product object
				Product p = new Product(id, name, description, category, price, quantity);
        
            // and put it in the collection
            products.add(p);
		  }
        return products;
    } catch (SQLException ex) {
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
	}
        
        
   */
        
        public void addTimeTable(Timetable timetable){
            
        }
        /*
       @Override
	public void addProduct(Product product) {
		String sql="merge into product (Product_ID, name, description, category, price, quantity_in_stock) values (?,?,?,?,?,?)";

    try (
        // get connection to database
        Connection dbCon = JdbcConnection.getConnection(url);

        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // copy the data from the product domain object into the SQL parameters
        stmt.setInt(1, product.getProductID());
        stmt.setString(2, product.getName());
		  stmt.setString(3, product.getDescription());
		  stmt.setString(4, product.getCategory());
		  stmt.setBigDecimal(5, product.getPrice());
		  stmt.setInt(6, product.getQuantityInStock());

        stmt.executeUpdate();  // execute the statement

    } catch (SQLException ex) {  // we are forced to catch SQLException
        // don't let the SQLException leak from our DAO encapsulation
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
	}
        
        */
        
        
        public void editTimeTable(Timetable timetable){
            //this goes into the Timetable editor.java gui class
        }
        
        
        public void deleteTimeTable(Timetable timetable){
            String sql = "delete from Timetable where UserName = ?";
        }
        
        	/*@Override
	public void deleteProduct(Product product) {
		String sql = "delete from Product where Product_ID = ?";

	try (
        // get a connection to the database
        Connection dbCon = JdbcConnection.getConnection(url);
        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);){
			  
		  stmt.setString(1, product.getProductID().toString());
		  stmt.executeUpdate();
			 
			  
		} catch (SQLException ex) {
        //throw new RuntimeException(ex);
		  throw new DAOException(ex.getMessage(), ex);
    }
	}*/
        
        
        
        
        
        
        
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

