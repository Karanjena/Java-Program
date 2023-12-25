package HierarchicalInheritance;

public class Phonepay extends SBI {

	
	long Number=9337671293l;
	String Upi="Karanjena@123";
	
	void Pay() {
		System.out.println("Pay Bank");
	}
	
	void CheckBalance() {
		System.out.println("Chack BAlance");
	}
	
	public static void main(String[] args) {
		Phonepay p=new Phonepay();
		System.out.println(p.Location);
		System.out.println(p.Branch);
		p.privateBank();
		p.GovBank();
		System.out.println(p.BankLocation);
		System.out.println(p.BranchCode);
		p.Balance();
		p.Passbook();
		System.out.println(p.Number);
		System.out.println(p.Upi);
		p.Pay();
		p.CheckBalance();
	}
}
