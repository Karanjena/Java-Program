package Exception;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int Balance=sc.nextInt();
		
		
		if(Balance<=2000) {
			System.out.println("Successful Ckeck Balance");
		}else {
			try {
				throw new Invalid("insufficient Balance");
			}
			catch(Invalid e) {
				System.out.println(e.getBalance());
			}
		}

	}

}
