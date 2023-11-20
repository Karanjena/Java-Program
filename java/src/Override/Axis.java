package Override;

public class Axis extends Bank {
	@Override
	void Deposit() {
		System.out.println("No Deposit");
		System.out.println("Only ATM Deposit");
	}
	@Override
	void Transfer() {
		System.out.println("No Transfer");
		System.out.println("Only Wallet Transfer");
	}
	@Override
	void Check_blance() {
		System.out.println("Blance Is not Check");
		System.out.println("Give Biomatri then Check Blance");
	}
	@Override
	void Withdrawal() {
		System.out.println("No Withdrawal");
		System.out.println("Only HDFC and SBI Atm in Withdrawal");
	}
	public static void main(String[] args) {
		Axis a=new Axis ();
		a.Deposit();
		a.Transfer();
		a.Check_blance();
		a.Withdrawal();
	}
}
