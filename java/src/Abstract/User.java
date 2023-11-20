package Abstract;

public class User {
	public static void main(String[] args) {
		//Upcasting
		
		Bank b1=new SBI();
		b1.Deposit();
		b1.Transfer();
		b1.Withdrawal();
		b1.Check_Balance();
		System.out.println("*************************");
		Bank b2=new Canara_Bank();
		b2.Deposit();
		b2.Transfer();
		b2.Withdrawal();
		b2.Check_Balance();
		System.out.println("*************************");
		Bank b3=new Syndicate_Bank();
		b3.Deposit();
		b3.Transfer();
		b3.Withdrawal();
		b3.Check_Balance();
		System.out.println("*************************");
		Bank b4=new icici_Bank();
		b4.Deposit();
		b4.Transfer();
		b4.Withdrawal();
		b4.Check_Balance();
	}
}
