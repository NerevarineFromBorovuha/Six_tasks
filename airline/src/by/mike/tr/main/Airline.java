package by.mike.tr.main;

import java.util.Objects;

public class Airline {
	/*
	 * 4. Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни
	 * недели. Найти и вывести: a) список рейсов для заданного пункта назначения; b)
	 * список рейсов для заданного дня недели; c) список рейсов для заданного дня
	 * недели, время вылета для которых больше заданного.
	 */
	private String destination;
	private int numberFlight;
	private String typePlane;
	private int timeStartFlight;
	private String day;

	public Airline() {
		destination = "";
		numberFlight = 0;
		typePlane = "";
		timeStartFlight = 0;
		day = "";
	}

	public Airline(String destination, int numberFlight, String typePlane, int timeStartFlight, String day) {
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typePlane = typePlane;
		if (timeStartFlight > 24 || timeStartFlight < 0) {
			System.out.println("time format wrong. Time = 0");
			this.timeStartFlight = 0;
		} else {
			this.timeStartFlight = timeStartFlight;
		}

		this.day = day;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public int getTimeStartFlight() {
		return timeStartFlight;
	}

	public void setTimeStartFlight(int timeStartFlight) {
		if (timeStartFlight > 24 || timeStartFlight < 0) {
			System.out.println("time format wrong. Time = 0");
			this.timeStartFlight = 0;
		} else {
			this.timeStartFlight = timeStartFlight;
		}
		this.timeStartFlight = timeStartFlight;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", typePlane=" + typePlane
				+ ", timeStartFlight=" + timeStartFlight + ", day=" + day + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, destination, numberFlight, timeStartFlight, typePlane);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(day, other.day) && Objects.equals(destination, other.destination)
				&& numberFlight == other.numberFlight && timeStartFlight == other.timeStartFlight
				&& Objects.equals(typePlane, other.typePlane);
	}

}
