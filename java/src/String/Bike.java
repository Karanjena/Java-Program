package String;

public class Bike {
	int cost;
	String brand;
	 Bike(int cost,String brand){
		 this.cost=cost;
		 this.brand=brand;
	 }
	 @Override
	 public String toString() {
		 return"Bike cost is  " + cost + "  Bike brand is" + brand;
	 }
	 public static void main(String[] args) {
		Bike b=new Bike(1200000 , "Tvs");
		System.out.println(b);
		Bike b1=new Bike(12000290 , "KTM");
		System.out.println(b1);
		Bike b2=new Bike(12000356 , "BMW");
		System.out.println(b2);
	}
}
