package org.jsp.SpringAutowiring;

public class Car implements Vehicle{

	@Override
	public void startRide() {
		System.out.println("Car ride started");
	}

}
