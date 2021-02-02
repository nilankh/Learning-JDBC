//Java DataBase Connectivity 

import java.sql.*;
/*
 * 1. import --> java.sql
 * 2. Load and register the driver --> mysql(com.mysql.jdbc.Driver)
 * 3. Create connection  -->Connection
 * 4. Create a statement -->Statement
 * 5. Execute the query
 * 6. Process the results
 * 7. Close
 */
public class DemoClass {

	public static void main(String[] args) throws Exception{
		String url = "";
		String uname = "";
		String pass = "";
		
		Class.forName("com.mysql.jdbc.Driver");//Class forname telusko u can watch
		Connection con = DriverManager.getConnection(url, uname, pass);
	}

}
