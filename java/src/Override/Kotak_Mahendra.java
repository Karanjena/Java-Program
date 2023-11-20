package Override;

public class Kotak_Mahendra extends Bank {
	@Override
	void Deposit() {
		System.out.println("No Deposit");
		System.out.println("Bank and ATM Deposit");
	}
	@Override
	void Transfer() {
		System.out.println("No Transfer");
		System.out.println("UPI and Wallet Transfer");
	}
	@Override
	void Check_blance() {
		System.out.println("Blance Is not Check");
		System.out.println("Direct Check the Blance");
	}
	@Override 
	void Withdrawal() {
		System.out.println("No Withdrawal");
		System.out.println("All Atm in the Withdrawal");
	}
	public static void main(String[] args) {
		Kotak_Mahendra k=new Kotak_Mahendra ();
		k.Deposit();
		k.Transfer();
		k.Check_blance();
		k.Withdrawal();
	}
}
