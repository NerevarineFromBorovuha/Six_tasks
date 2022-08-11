package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
	private List<City> district;

	public District() {
		district = new ArrayList<City>();

	}

	public District(List<City> cities) {
		district = new ArrayList<City>();
		district.addAll(cities);
	}

	public List<City> getDistrict() {
		return district;
	}

	public void setDistrict(List<City> district) {
		this.district = district;
	}

	@Override
	public int hashCode() {
		return Objects.hash(district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(district, other.district);
	}

	@Override
	public String toString() {
		return "District [district=" + district + "]";
	}

}
