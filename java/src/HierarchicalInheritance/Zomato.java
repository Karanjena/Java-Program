package HierarchicalInheritance;

public class Zomato extends Shopping {
	
	int id=9876098;
	String user="Karan";
	
	void add() {
		System.out.println("Add to Cart ");
	}
	
	void wishlist() {
		System.out.println("Add to Wishlist");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zomato z=new Zomato();
		System.out.println(z.id);
		System.out.println(z.user);
		System.out.println(z.Name);
		System.out.println(z.order);
		z.food();
		z.delivery();
		z.add();
		z.wishlist();
	}

}
