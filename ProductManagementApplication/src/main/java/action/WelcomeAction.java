package action;

import java.util.*;

import dao.ProductManagementDAO;
import pojo.Product;

public class WelcomeAction {
	List<Product> products;
	
	public String execute()
	{
		initializeProducts();
		return "success";
	}
	
	public void initializeProducts()
	{
		products=ProductManagementDAO.getAllProducts();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
