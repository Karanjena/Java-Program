package HierarchicalInheritance;



public class Bike extends Vechical {

	String color="Black";
	int cost=1090900;
	
	void ride() {
		System.out.println("Ride The Bike");
	}
	void Race() {
		System.out.println("Race The Bike");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		System.out.println(b.Brand);
		System.out.println(b.Avrageamount);
		b.start();
		b.stop();
		System.out.println(b.color);
		System.out.println(b.cost);
		b.ride();
		b.Race();
	}
}
