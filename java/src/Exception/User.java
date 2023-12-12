package Exception;

import java.util.Scanner;

public class User {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Set your password");
		String pass =sc.next();
		InvalidPassword i = new InvalidPassword();
		i.setPassword(pass);
	
		System.out.println("Enter your password");
		String p = sc.next();
		if(pass==p) {
		i.Validate(pass);
			System.out.println("Login done successfully");
		}
		else {
			try {
				throw new InvalidPassword("Invalid password");
			}
			catch(InvalidPassword e) {
				System.out.println(e.getPassword());
			}
		}
		

	}

}
