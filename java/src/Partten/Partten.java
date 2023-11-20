package Partten;

import java.util.Scanner;

public class Partten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1 ; i<=a; i++) {
			for(int j=1 ; j<=b ; j++) {
				if(i==j||j==i||i==1) { 
					System.out.println("* ");
				} else {
					System.out.println(" ");
				}
			} 
		}
	}
}
