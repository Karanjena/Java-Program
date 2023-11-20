package Array;
import java.util.*;
public class Mark {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int m=sc.nextInt();
		
		int [] a=new int [m];
		for(int i=0;i<=m-1;i++) {
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
	}
}
