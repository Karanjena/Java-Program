package Exception;

import java.util.Scanner;

public class Instgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id");
		int id=sc.nextInt();
		System.out.println("Enter Your Password");
		int pass=sc.nextInt();
		
		if(id==12345) {
			if(pass==123) {
				System.out.println("Login Successful");
			}else {
				try {
					throw new InvalidIDPass("Invalid Password");
				}
				catch(InvalidIDPass e) {
					System.out.println(e.getmassage());
				}
			}
		}else {
			try {
				throw new InvalidIDPass("Invalid ID");
			}
			catch(InvalidIDPass e) {
				System.out.println(e.getmassage());
			}
		}

	}

}
