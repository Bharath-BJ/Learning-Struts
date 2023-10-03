import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	
	
	public String execute()
	{
		System.out.println("Execute statement printed");
		return "success";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

/*	We can validate the form in two ways 
 *  1) Using validate() & addFieldError(fieldName,msg) methods from ActionSupport Class (As we insert many validation it may get messy so validation.xml is preferred)
 *  2) Using ActionClass-validation.xml in the given naming format
 * 
 * 
	@Override
	public void validate() {
		if(firstName.equals(""))
			addFieldError("firstName","First Name is required");  // addFieldError(fieldName,Error msg)
		if(lastName.equals(""))
			addFieldError("lastName","Last Name is required");
		if(gender==null)
			addFieldError("gender","Gender is required");
		if(age==null)
			addFieldError("age","Age is required");
		else if(age<18)
			addFieldError("age","Age must be higher than 18");
		if(email.equals(""))
			addFieldError("email","Email is required");
			
	}
	
*/	

}
