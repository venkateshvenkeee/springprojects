package org.jsp.SpringAutowiring;

public class Ride {
	private Vehicle vehicle;

	public Ride() {

	}
	public Ride(Vehicle vehicle) {
		System.out.println("calling constructor");
		this.vehicle = vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		System.out.println("calling setter");
		this.vehicle = vehicle;
	}
}
