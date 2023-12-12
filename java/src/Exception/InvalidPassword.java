 package Exception;

public class InvalidPassword extends RuntimeException {

	 private String password;
	InvalidPassword(String password){
		this.password=password;
	}
	public InvalidPassword() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
		}
	
	public void Validate(String password) {
		if(this.password==password) {
			System.out.println("Login Done");
		}
		else {
			System.out.println("Invalid Password");
		}
	}

}
