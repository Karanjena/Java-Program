package HierarchicalInheritance;

public class GooglePay extends SBI{

	

	long GNumber=9337671567l;
	String GUpi="Karanjena@879";
	
	void QRScan() {
		System.out.println("Pay Bank in QRScan");
	}
	
	void History() {
		System.out.println("Chack History");
	}
	
	public static void main(String[] args) {
		GooglePay g=new GooglePay();
		System.out.println(g.Location);
		System.out.println(g.Branch);
		g.privateBank();
		g.GovBank();
		System.out.println(g.BankLocation);
		System.out.println(g.BranchCode);
		g.Balance();
		g.Passbook();
		System.out.println(g.GNumber);
		System.out.println(g.GUpi);
		g.QRScan();
		g.History();
	}
}
