package by.mike.tr.main;

public class Main {
	public static void main(String[] args) {
		Counter ctr = new Counter(7, 7, 8);
		ctr.increase();
		ctr.decrease();
		ctr.decrease();

		System.out.println("Counter = " + ctr.getCounter() + "\nFrom = " + ctr.getFrom() + "\nTo = " + ctr.getTo());
	}

}
