package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private List<District> region;
	private String regionalCenter;

	public State() {
		region = new ArrayList<District>();
		regionalCenter = "";
	}

	public State(String regionalCenter, List<District> districs) {
		this.regionalCenter = regionalCenter;
		region = new ArrayList<District>();
		region.addAll(districs);
	}

	public State(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public List<District> getRegion() {
		return region;
	}

	public void setRegion(List<District> region) {
		this.region = region;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(region, regionalCenter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(region, other.region) && Objects.equals(regionalCenter, other.regionalCenter);
	}

	@Override
	public String toString() {
		return "Region [region=" + region + ", regionalCenter=" + regionalCenter + "]";
	}

}
