package Type_casting;

public class Kids extends Myntra {
	String Product_name="Toys";
	int Cost=2000;
	void wishlist() {
		System.out.println("Add the Wishlist");
	}
	void Buy() {
		System.out.println("Buy Toys");
	}
	public static void main(String[] args) {
		//Upcasting
		Myntra m=new Kids();
		System.out.println(m.user_name);
		System.out.println(m.Password);
		m.Cart();  
		System.out.println("***************");
		//Downcasting
		Kids k=(Kids)m;
		System.out.println(k.user_name);
		System.out.println(k.Password);
		k.Cart();
		System.out.println(k.Product_name);
		System.out.println(k.Cost);
		k.wishlist();   
		k.Buy();
	}
}
