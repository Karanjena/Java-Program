package Type_casting;

public class Karnatak extends India {
	String CM="Siddhrsawmi";
	public static void main(String[] args) {
		//upcasting
		India i=new Karnatak ();
		System.out.println(i.PM);
		//downcasting
		Karnatak k=(Karnatak)i;
		System.out.println(k.PM);
		System.out.println(k.CM);
	}
}    
