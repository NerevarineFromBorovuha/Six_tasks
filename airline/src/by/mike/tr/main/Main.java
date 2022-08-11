package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Airline> listFlight = new ArrayList<Airline>();
		listFlight.add(new Airline("Minsk", 1488, "Boing", 1, "Monday"));
		listFlight.add(new Airline("Moscow", 1428, "Tupolev", 2, "Tuesday"));
		listFlight.add(new Airline("Praga", 4341, "Boing", 3, "Wednesday"));
		listFlight.add(new Airline("Vitebsk", 4312, "Airbus", 4, "Thursday"));
		listFlight.add(new Airline("Moscow", 4210, "Tupolev", 5, "Friday"));
		listFlight.add(new Airline("NewYork", 2280, "Airbus", 6, "Saturday"));
		listFlight.add(new Airline("Helsinki", 4123, "Boing", 7, "Sunday"));
		listFlight.add(new Airline("Moscow", 4232, "Airbus", 8, "Thursday"));
		listFlight.add(new Airline("Minsk", 4231, "Boing", 9, "Monday"));
		listFlight.add(new Airline("Vitebsk", 1245, "Airbus", 22, "Wednesday"));
		listFlight.add(new Airline("Praga", 9876, "Tupolev", 11, "Sunday"));

		AirlineLogic logic1 = new AirlineLogic();
		AirlinePrint print = new AirlinePrint();
		
		// a) список рейсов для заданного пункта назначения
		System.out.print("Enter destination city >");
		List<Airline> listByDestination = logic1.destinationLogic(listFlight, ScannerMethod());
		print.printListAirline(listByDestination);
		
		// b) список рейсов для заданного дня недели;
		System.out.print("Enter day flight >");
		List<Airline> listByDay = logic1.dayFlightLogic(listFlight, ScannerMethod());
		print.printListAirline(listByDay);
		
		// c) список рейсов для заданного дня недели, время вылета для которых больше
		// заданного.
		System.out.print("Enter day flight >");
		List<Airline> listByTime = logic1.timeFlightLogic(listFlight, ScannerMethod(), ScannerMethodInt());
		print.printListAirline(listByTime);

	}

	private static String ScannerMethod() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	private static int ScannerMethodInt() {
		System.out.print("Enter time flight >");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
