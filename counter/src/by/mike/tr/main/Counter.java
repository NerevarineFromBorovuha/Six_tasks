package by.mike.tr.main;

public class Counter {
	/*
	 * Опишите класс, реализующий десятичный счетчик, который может увеличиватьили
	 * уменьшать свое значение на единицу в заданном диапазоне.
	 * Предусмотритеинициализацию счетчика значениями по умолчанию и произвольными
	 * значениями.Счетчик имеет методы увеличения и уменьшения состояния, и метод
	 * позволяющееполучить его текущее состояние.
	 * 
	 * Написать код, демонстрирующий все возможности класса.
	 */

	private long counter;
	private boolean status;
	private long from;
	private long to;

	public Counter() {
		counter = 0;
		status = false;
		from = 0;
		to = 100;

	}

	public Counter(long from, long to) {
		this.from = from;
		this.to = to;

	}

	public Counter(long counter, long from, long to) {
		this.from = from;
		this.to = to;
		if ((counter > to) || (counter < from)) {
			System.out.println("Counter is more than the allowed value. Counter = " + from);
			this.counter = from;
		} else {
			this.counter = counter;
		}

	}

	public long increase() {
		counter++;

		if ((counter > to) || counter < from) {
			System.out.println("Counter is more or less than the allowed value. Counter = " + from);
			this.counter = from;
			
		}

		return counter;
	}
	
	public long decrease() {
		counter--;

		if ((counter > to) || counter < from) {
			System.out.println("Counter is more or less than the allowed value. Counter = " + from);
			this.counter = from;
			
		}

		return counter;
	}
	
	
	
	

	public long getCounter() {

		return counter;

	}

	public void setCounter(long counter) {
		if ((counter > to) || (counter < from)) {
			this.counter = from;
			System.out.println("Counter is more than the allowed value. Counter = " + from);
		} else {
			this.counter = counter;
		}
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getFrom() {
		return from;
	}

	public long getTo() {
		return to;
	}

}
