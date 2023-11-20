package Type_casting;

public class Women extends Myntra {
	String Product_name="Kurti";
	int Cost=1500;
	void Buy() {
		System.out.println("Buy only Kurti");
	}
	public static void main(String[] args) {
		//upcastig
		Myntra m=new Women();
		System.out.println(m.user_name);
		System.out.println(m.Password);
		m.Cart();  
		System.out.println("***************");
		//Downcasting
		Women w=(Women)m;
		System.out.println(w.user_name);
		System.out.println(w.Password);
		w.Cart();
		System.out.println(w.Product_name);
		System.out.println(w.Cost);
		w.Buy();
	}
}
