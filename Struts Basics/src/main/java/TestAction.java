import com.opensymphony.xwork2.Action;
/* We can either implement the Action Interface or ActionSupport class which extends Action, 
 * Validatable, Serializable, ValidationAware, TextProvider, LocaleProvider Interfaces  to get 
 * access to the CODES for resulting jsp pages
 * */

public class TestAction implements Action{
	
	private String message;
 	private String fullName; // Here variable must be same as the name attribute of text from jsp page 
	
	public String execute()
	{
		System.out.println("Execute statement printed");
		message="Passing data from action class to jsp";
		System.out.println("Full Name : "+fullName);
		return "success";
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
