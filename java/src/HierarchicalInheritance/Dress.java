package HierarchicalInheritance;

public class Dress extends Women{

	
int size=30;
	
	void order() {
		System.out.println("Buy ");
	}
	public static void main(String[] args) {
		Dress d=new Dress();
		System.out.println(d.number);
		System.out.println(d.age);
		System.out.println(d.size);
		d.buy();
		d.amount();
		d.order();
	}
}
