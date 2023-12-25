package HierarchicalInheritance;

public class KFC extends Shopping{

	int id=78689;
	String user="Sonu";
	
	void pay() {
		System.out.println("pay for Online");
	}
	
	void Address() {
		System.out.println("Current Address");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KFC k=new KFC();
		System.out.println(k.id);
		System.out.println(k.user);
		System.out.println(k.Name);
		System.out.println(k.order);
		k.food();
		k.delivery();
		k.pay();
		k.Address();
	}

}
