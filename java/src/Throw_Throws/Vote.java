package Throw_Throws;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		 
		if(age>=18) {
			System.out.println("Eligeble For Vote");
		}else {
			try {
				throw new Underage("Age Not Valid");
			} catch(Underage e) {
				System.out.println(e.getmassage());
			}
		}
	}
}
