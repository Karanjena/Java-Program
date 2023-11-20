package Override;

public class HDFC extends Bank {
	@Override
	void Deposit() {
		System.out.println("No Deposit");
		System.out.println("Only Bank Deposit");
	}
	@Override
	void Transfer() {
		System.out.println("No Transfer");
		System.out.println("Only UPI Transfer");
	}
	@Override
	void Check_blance() {
		System.out.println("Blance Is not Check");
		System.out.println("Put Password then Check Blance");
	}
	@Override
	void Withdrawal() {
		System.out.println("No Withdrawal");
		System.out.println("Only HDFC Atm in Withdrawal");
	}
	public static void main(String[] args) {
		HDFC h=new HDFC ();
		h.Deposit();
		h.Transfer();
		h.Check_blance();
		h.Withdrawal();
	}
}
