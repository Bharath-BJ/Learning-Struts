package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ProductManagementDAO;

public class DeleteAction extends ActionSupport{
	String productId;
	
	public String execute()
	{
		String statusCode="";
		int recordAffected=ProductManagementDAO.deleteProduct(productId);
		statusCode= recordAffected==1 ? "success" : "error";
	return statusCode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}
