package Type_casting;

public class Man extends Myntra {
	String Product_name="Shoes";
	int Cost=3000;
	void Buy() {
		System.out.println("Buy Only Shoes");
	}
	public static void main(String[] args) {
		//upcasting
		Myntra m=new Man();
		System.out.println(m.user_name);
		System.out.println(m.Password);
		m.Cart();  
		System.out.println("*******************");
		//downcasting
		Man z=(Man)m;
		System.out.println(z.user_name);
		System.out.println(z.Password);
		z.Cart();
		System.out.println(z.Product_name);
		System.out.println(z.Cost);
		z.Buy();
	}
}
