package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

	public List<Airline> destinationLogic(List<Airline> list, String destination) {
		List<Airline> destinationList = new ArrayList<Airline>();
		for (Airline a : list) {
			if (a.getDestination().equals(destination)) {
				destinationList.add(a);
			}

		}

		return destinationList;

	}

	public List<Airline> dayFlightLogic(List<Airline> list, String dayFlight) {
		List<Airline> dayList = new ArrayList<Airline>();
		for (Airline a : list) {
			if (a.getDay().equals(dayFlight)) {
				dayList.add(a);
			}

		}

		return dayList;

	}

	public List<Airline> timeFlightLogic(List<Airline> list, String dayFlight, int time) {
		List<Airline> timeList = new ArrayList<Airline>();
		for (Airline a : list) {
			if ((a.getDay().equals(dayFlight)) && (a.getTimeStartFlight() >= time)) {
				timeList.add(a);
			}

		}

		return timeList;

	}

}
