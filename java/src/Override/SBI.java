package Override;

public class SBI extends Bank {
	@Override
	void Deposit() {
		System.out.println("Only Cash Deposit");
	}
	@Override
	void Transfer() {
		System.out.println("Only Bank Transfer");
	}
	@Override
	void Check_blance() {
		System.out.println("Put Otp then Blance Check");
	}
	@Override
	void Withdrawal() {
		System.out.println("Only Atm Withdrawal");
	}
	public static void main(String[] args) {
		SBI s=new SBI ();
		s.Deposit();
		s.Transfer();
		s.Check_blance();
		s.Withdrawal();
	}
}
