package by.mike.tr.main;

public class PrintUSA {

	public void printCapitalUSA(Country ctr) {
		System.out.println("Capital USA is " + ctr.getCapital());

	}

	public void printSquareUSA(Country ctr) {
		System.out.println("Square USA = " + ctr.getSquare());

	}

	public void printSumStates(Country ctr) {
		System.out.println("In USA " + ctr.getState().size() + " states");
	}

	public void printCapitalStates(Country ctr) {
		int count = 0;
		for (State s : ctr.getState()) {
			count++;
			System.out.println(count + " capital state is  " + s.getRegionalCenter());

		}

	}

}
