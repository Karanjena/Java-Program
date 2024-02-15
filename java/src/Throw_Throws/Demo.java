package Throw_Throws;

public class Demo {

	void div() throws ArithmeticException {
		System.out.println(10 % 0);
	}

	void array() throws ArrayIndexOutOfBoundsException {
		int[] a = { 10, 20, 30, 40 };
		System.out.println(a[1000]);
	}

	void sleep() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}

	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("Karan");

		try {
			d.sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			d.div();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		try {
			d.array();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
