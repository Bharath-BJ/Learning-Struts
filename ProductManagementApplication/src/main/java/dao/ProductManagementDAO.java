package dao;

import java.sql.*;
import java.util.*;

import dbutil.Dbutil;
import pojo.Product;

public class ProductManagementDAO {

	Connection con=null;
	public static List<Product> getAllProducts()
	{
		List<Product> productList=new ArrayList<>();
		try {
			Connection con= Dbutil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from products");
			while(rs.next())
			{
				Product product = new Product(rs.getString(1),rs.getString(2), rs.getString(3),rs.getInt(4));
				productList.add(product);
			}
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return productList;
	}
}
