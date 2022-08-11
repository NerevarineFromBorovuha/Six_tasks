package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
	private String capital;
	private List<State> state;
	private int square;

	public Country() {
		capital = "";
		state = new ArrayList<State>();
		square = 0;

	}

	public Country(String capital, int square, List<State> regions) {
		this.capital = capital;
		this.square = square;
		state = new ArrayList<State>();
		state.addAll(regions);

	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, square, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(capital, other.capital) && square == other.square && Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "Country [capital=" + capital + ", state=" + state + ", square=" + square + "]";
	}

}
