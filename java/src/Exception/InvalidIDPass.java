package Exception;

public class InvalidIDPass extends RuntimeException{
	
	private String massage;
	
	InvalidIDPass(String massage){
		this.massage=massage;
		
	}
	public String getmassage() {
		return massage;
	}

}
