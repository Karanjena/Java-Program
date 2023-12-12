package Exception;

public class UnderAge extends RuntimeException{

		private String massage;
		UnderAge(String massage){
			this.massage=massage;
		}
		public String getMassage() {
			return massage;
		}
}
