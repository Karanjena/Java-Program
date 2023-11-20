package Polymorphisum;

public class User {
	public static void main(String[] args) {
		Instagram i=new Karan();
		i.login();
		i.Post();
		i.Story();
		Instagram i1=new Dillip();
		i1.login();
		i1.Post();
		i1.Story();
		Instagram i2=new Damayanti();
		i2.login();
		i2.Post();
		i2.Story();
	}
}
