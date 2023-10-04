package dao;

import java.sql.*;
import pojo.LoginInfo;
import dbutil.Dbutil;


public class LoginDAO {

	public static boolean isUserValid(LoginInfo userDetails)
	{
		boolean validStatus=false;
		try {
			Connection con=Dbutil.getConnection(); // connection established through Dbutil class
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from login_info where username='"+userDetails.getUserName()+"' and password='"+userDetails.getPassword()+"'");
			while(rs.next())
			{
				validStatus=true;
			}
//			System.out.println("validstatus "+validStatus);
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return validStatus;
	}
}
