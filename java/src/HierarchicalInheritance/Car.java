package HierarchicalInheritance;

public class Car extends Vechical{

	String color="Black";
	int cost=1990998;
	
	void drive() {
		System.out.println("Drive The Car");
	}
	void TopSpeed() {
		System.out.println("TopSpeed The Car");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println(c.Brand);
		System.out.println(c.Avrageamount);
		c.start();
		c.stop();
		System.out.println(c.color);
		System.out.println(c.cost);
		c.drive();
		c.TopSpeed();
	}
}
