package Polymorphisum;

public class Bike extends Vehical{
	@Override
	void Start() {
		System.out.println("Bike is Started");
	}
	void Escalator() {
		System.out.println("Bike is Running");
	}
	void Gearup() {
		System.out.println("Bike is Slowing");
	}
	void Stop() {
		System.out.println("Bike is Stoped");
	}
}
