package by.mike.tr.main;

public class Main {

	public static void main(String[] args) {
		Time time1 = new Time(21, 23, 0);
		// time1.setHours(24);
		// time1.setMinutes(20);
		// time1.setSeconds(0);
		time1.add(1, 40, 140);

		System.out.println("Now " + time1.getHours() + " hours, " + time1.getMinutes() + " minutes, "
				+ time1.getSeconds() + " seconds.");

	}

}
