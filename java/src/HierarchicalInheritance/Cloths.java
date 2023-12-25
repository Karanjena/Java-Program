  package HierarchicalInheritance;

public class Cloths extends Men{

	String color="Black";
	
	void Shopping() {
		System.out.println("Shoping won choies");
	}
	
	public static void main(String[] args) {
		Cloths c=new Cloths();
		System.out.println(c.number);
		System.out.println(c.age);
		System.out.println(c.color);
		c.buy();
		c.amount();
		c.Shopping();
	}
}
