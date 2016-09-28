package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestDB {
	
	@Test(priority=0)
	public TestDB() throws ClassNotFoundException, SQLException
{
		
	String dbUrl = "jdbc:mysql://localhost:3306/test";					

		
	String username = "root";	
    
		
	String password = "admin";				

			
	String query = "select *  from mytable where name='xyz';";	
    
	    		
	    Class.forName("com.mysql.cj.jdbc.Driver");			

			
	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
   Statement stmt = con.createStatement();					

			
		ResultSet rs= stmt.executeQuery(query);							

		
	while (rs.next()){
        		String myName = rs.getString(1);								        
                String myAge = rs.getString(2);					                               
                System. out.println(myName+"  "+myAge);	
                Assert.assertEquals(myAge,"12");
        }		
	
	
		con.close();	
		
		
}
}

