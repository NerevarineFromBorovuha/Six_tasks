package by.mike.tr.main;

import java.util.List;

public class AirlinePrint {

	public void printListAirline(List<Airline> air) {
		for (Airline a : air) {
			System.out.println("Destination: " + a.getDestination() + " , number flight : " + a.getNumberFlight()
					+ " , type plane : " + a.getTypePlane() + " , time starting flight : " + a.getTimeStartFlight()
					+ " , day flight : " + a.getDay());
		}

	}

}
