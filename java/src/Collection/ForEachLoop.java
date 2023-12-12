package Collection;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l=new ArrayList();
		l.add(10);
		l.add("Karan");
		l.add(20);
		l.add(null);
		l.add(32.98);
		l.add(10);
		
		//For each Loop
		for( Object obj : l) {
			System.out.println(obj);
		}
	}

}
