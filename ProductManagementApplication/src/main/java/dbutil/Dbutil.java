package dbutil;

import java.sql.*;

public class Dbutil {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductManagement","root","");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return con;
	}
	
	public static void closeConnection(Connection con)
	{
		try {
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
