package HierarchicalInheritance;

public class Cosmitres extends Women{

String Product="lipstic";
	
	void use() {
		System.out.println("Give me My friend");
	}
	public static void main(String[] args) {
		Cosmitres cs=new Cosmitres();
		System.out.println(cs.number);
		System.out.println(cs.age);
		System.out.println(cs.Product);
		cs.buy();
		cs.amount();
		cs.use();;
	}
}
