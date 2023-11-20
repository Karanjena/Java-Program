 package Override;

public class Instgram2 extends Instgram {
	void Story() {
		System.out.println("Add Photo in Story");
		System.out.println("Add Video in Story");
	}
	void Post() {
		System.out.println("Post text");
		System.out.println("Post Photo");
	}
	void Message() {
		System.out.println("Text Massage");
		System.out.println("Photo Massage");
	}
	void Call() {
		System.out.println("Audio Call");
		System.out.println("Video Call");
		
	}
	void Reels() {
		System.out.println("Add New Reels");
	}
	public static void main(String[] args) {
		Instgram2 i=new Instgram2();
		i.Story();
		i.Post();
		i.Message();
		i.Call();
		i.Reels();
	}
}
