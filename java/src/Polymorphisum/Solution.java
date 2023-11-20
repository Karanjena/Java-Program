package Polymorphisum;

public class Solution {
	public static void main(String[] args) {
		Vehical v=new Bike();
		v.Start();
		v.Escalator();
		v.Gearup();
		v.Stop();
		Vehical v1=new Car();
		v1.Start();
		v1.Escalator();
		v1.Gearup();
		v1.Stop();
		Vehical v2=new Truck();
		v2.Start();
		v2.Escalator();
		v2.Gearup();
		v2.Stop();
	}
}
