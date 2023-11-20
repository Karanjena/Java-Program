package Interface3;

public class L implements I,J{

	@Override
	public void phno() {
		// TODO Auto-generated method stub
		System.out.println("Put Alternet Number");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login Successful");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
	    System.out.println("Start Program");
	}

	@Override
	public void username() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Username");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout Successful");
	}
     
	@Override
	public void password() {
		// TODO Auto-generated method stub
		System.out.println("Enter Valid Password");
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println("Thanks");
	}

	@Override
	public void singup() {
		// TODO Auto-generated method stub
		System.out.println("Singup Successful");
	}

}
