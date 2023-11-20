package Polymorphisum;

public class Car extends Vehical{
	@Override
	void Start() {
		System.out.println("Car is Starting");
	}
	void Escalator() {
		System.out.println("Car is Running");
	}
	void Gearup() {
		System.out.println("Car is Slowing");
	}
	void Stop() {
		System.out.println("Car is Stop");
	}
}
