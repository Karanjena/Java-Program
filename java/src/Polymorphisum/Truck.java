package Polymorphisum;

public class Truck extends Vehical{
	@Override
	void Start() {
		System.out.println("Truck is Starting");
	}
	void Escalator() {
		System.out.println("Truck is Running");
	}
	void Gearup() {
		System.out.println("Truck is Slowing");
	}
	void Stop() {
		System.out.println("Truck is Stop");
	}
}
