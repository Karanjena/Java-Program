package Exception;

public class Invalid extends RuntimeException{
	
	private String Balance;
	Invalid (String Balance){
		this.Balance=Balance;
	}
	public String getBalance() {
		return Balance;
	}

}
