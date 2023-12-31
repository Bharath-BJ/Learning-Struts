package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ProductManagementDAO;
import pojo.Product;

public class AddProductAction extends ActionSupport{

	String productId;
	String productName;
	String productCategory;
	Integer productPrice;
	
	public String execute()
	{
		String statusCode="";
		int recordAdded=ProductManagementDAO.addProduct(new Product(productId,productName,productCategory,productPrice));
		statusCode= recordAdded==1 ? "success" : "error" ;
	return statusCode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
}
