package Dom;

public class User {
public static void main(String[] args) {
	Facebook f=new Facebook();
	f.setPhno(9337671293l);
	f.setPassword("Karan@000");
	f.setGmail("sonujena256@gmail.com");
	System.out.println(f.getPhno());
	System.out.println(f.getPassword());
	System.out.println(f.getGmail());
}
}
