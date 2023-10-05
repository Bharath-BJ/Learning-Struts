package action;

import com.opensymphony.xwork2.ActionSupport;
import pojo.Product;
import dao.ProductManagementDAO;

public class UpdateDataAction extends ActionSupport{

	String productId;
	String productName;
	String productCategory;
	Integer productPrice;
	
	public String execute() {
		Product product=ProductManagementDAO.getProductById(productId);
		productId=product.getProductId();
		productName=product.getProductName();
		productCategory=product.getProductCategory();
		productPrice=product.getProductPrice();
	return "success";
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
