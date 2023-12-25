package HierarchicalInheritance;

public class Kids extends Meshoo {

	int age =12;
	
	
	void amount() {
		System.out.println("Under 500");
	}
	
	public static void main(String[] args) {
		Kids k=new Kids();
		
		System.out.println(k.number);
		System.out.println(k.age);
		k.buy();
		k.amount();
		
	}
}
