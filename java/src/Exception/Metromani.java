package Exception;

import java.util.Scanner;

public class Metromani {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=23) {
			System.out.println("Eligeble for metromani");
		}else {
			try {
				throw new UnderAge("Age not Valid");
			}
			catch(UnderAge e) {
				System.out.println(e.getMassage());
			
			}
		}
	}

}
