package Abstract;

public class Canara_Bank extends Bank {
	@Override
	public void Deposit() {
		System.out.println("Deposit successful");
	}
	@Override
	public void Transfer() {
		System.out.println("Transfer Successful");
	}
	@Override
	public void Withdrawal() {
		System.out.println("Withdrawal Successful");
	}
	@Override
	public void Check_Balance() {
		System.out.println("Check Balance Successful");
	}
}
