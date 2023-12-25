package HierarchicalInheritance;

public class PanjabiHHotel extends Swigge{

	
	int itamNo=12;
	double rateing=4.4;
	
	void FastFood() {
		System.out.println("No Fastfood");
	}
	
	void Biriyani() {
		System.out.println("Biriyani Good Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PanjabiHHotel p=new PanjabiHHotel();
		System.out.println(p.id);
		System.out.println(p.user);
		System.out.println(p.Name);
		System.out.println(p.order);
		System.out.println(p.itamNo);
		System.out.println(p.rateing);
		p.food();
		p.delivery();
		p.add();
		p.wishlist();
		p.FastFood();
		p.Biriyani();
	}

}
