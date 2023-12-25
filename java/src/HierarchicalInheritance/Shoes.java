package HierarchicalInheritance;

public class Shoes extends Men {

String Brand="amiri";
	
	void cost() {
		System.out.println(" 120000");
	}
	public static void main(String[] args) {
		Shoes s=new Shoes();
		System.out.println(s.number);
		System.out.println(s.age);
		System.out.println(s.Brand);
		s.buy();
		s.amount();
		s.cost();;
	}
}
