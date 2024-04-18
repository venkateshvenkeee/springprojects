package org.jsp.SpringAutowiring;

public class Bike implements Vehicle
{

	@Override
	public void startRide() {
		System.out.println("Bike ride started");
	}
}
