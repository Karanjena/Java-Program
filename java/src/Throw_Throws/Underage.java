package Throw_Throws;

public class Underage extends RuntimeException{
	private String massage;
	Underage(String massage){
		this.massage=massage;
		
	}
	public String getmassage() {
		return massage;
	}

	
}
