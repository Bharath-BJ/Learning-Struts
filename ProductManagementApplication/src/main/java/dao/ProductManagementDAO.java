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
	
	public static int addProduct(Product product)
	{
		int recordAdded=0;
		try {
			Connection con= Dbutil.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into products values (?,?,?,?)");
			pst.setString(1,product.getProductId());
			pst.setString(2,product.getProductName());
			pst.setString(3,product.getProductCategory());
			pst.setInt(4, product.getProductPrice());
			recordAdded=pst.executeUpdate();
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return recordAdded;
	}
	
	public static Product getProductById(String productId)
	{
		Product product=null;
		try {
			Connection con= Dbutil.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from products where prod_id=?");
			pst.setString(1,productId);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				product=new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return product;
	}
	
	public static int updateProduct(String productId,String productName,String productCategory,int productPrice)
	{
		int recordAdded=0;
		try {
			Connection con= Dbutil.getConnection();
			PreparedStatement pst = con.prepareStatement("update products set prod_name=?, prod_category=?, prod_price=? where prod_id= ?");
			pst.setString(1,productName);
			pst.setString(2,productCategory);
			pst.setInt(3,productPrice);
			pst.setString(4,productId);
			recordAdded=pst.executeUpdate();
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return recordAdded;
	}
	
	public static int deleteProduct(String productId)
	{
		int recordAffected=0;
		try {
			Connection con= Dbutil.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from products where prod_id=?");
			pst.setString(1,productId);
			recordAffected=pst.executeUpdate();
			System.out.println(recordAffected);
			Dbutil.closeConnection(con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return recordAffected;
	}
}
