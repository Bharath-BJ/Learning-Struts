package action;

import com.opensymphony.xwork2.ActionSupport;
import pojo.LoginInfo;
import dao.LoginDAO;

public class LoginAction extends ActionSupport {

	String userName;
	String password;
	

	@Override
	public String execute() throws Exception {
		String statusCode="";
		boolean isUserValid = LoginDAO.isUserValid(new LoginInfo(userName,password)); // pojo obj passed to the dao to verify tghe user
		statusCode = isUserValid? "success":"input";
//		System.out.println("Statuscode "+statusCode);
	return statusCode;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;  
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

/* Here as the params interceptor loads the input field values to the action class attribute
 * Using the pojo class, we create pojo obj and pass it to the LoginDAO to check if user is valid or not 
 * */
