package Array;

import java.util.Scanner;

public class Cricket_team {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of best player");
		int size=sc.nextInt();
		
		String[] s=new String[size];
		for(int i=0;i<=size-1;i++) {
			System.out.println("Enter player name");
			s[i]=sc.next();
		}
		for(int j=0;j<=s.length-1;j++) {
			System.out.println(s[j]);
		}
		System.out.println("**************");
		for(int k=s.length-1;k>=0;k--) {
			System.out.println(s[k]);
		}
	}
}
