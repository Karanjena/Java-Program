package Exception;

public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println(10*2);
		System.out.println(10+10);
		try {
		
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("can not divid the zero");
		}
		System.out.println(10+100);

	}

}
