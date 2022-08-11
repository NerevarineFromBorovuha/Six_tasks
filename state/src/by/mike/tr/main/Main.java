package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	 * 6. Создать объект класса Государство, используя классы Область, Район, Город.
	 * Методы: вывести на консоль столицу, количество областей, площадь, областные
	 * центры.
	 */

	public static void main(String[] args) {
		List<City> WashingtonDistrict = new ArrayList<City>();
		WashingtonDistrict.add(new City("Washington"));
		WashingtonDistrict.add(new City("Alexandria"));
		WashingtonDistrict.add(new City("Chantilly"));
		List<City> BaltimoreDistrict = new ArrayList<City>();
		BaltimoreDistrict.add(new City("Halethorpe"));
		BaltimoreDistrict.add(new City("Yorktown"));
		List<City> SilverSpringDistrict = new ArrayList<City>();
		SilverSpringDistrict.add(new City("SilverSpring"));
		SilverSpringDistrict.add(new City("Rockville'"));
		District DistrictWashington = new District(WashingtonDistrict);
		District DistrictBaltimore = new District(BaltimoreDistrict);
		District DistrictSilverSpring = new District(SilverSpringDistrict);
		List<District> MarylandRegion = new ArrayList<District>();
		MarylandRegion.add(DistrictWashington);
		MarylandRegion.add(DistrictBaltimore);
		MarylandRegion.add(DistrictSilverSpring);
		State StateMaryland = new State("Washington", MarylandRegion);

		/////////////////////////////////////////////////////////////////////////////////////

		List<City> SanFranciscokDistrict = new ArrayList<City>();
		SanFranciscokDistrict.add(new City("San Francisco"));
		SanFranciscokDistrict.add(new City("Daly City"));
		SanFranciscokDistrict.add(new City("Oakland"));
		List<City> SakramentoDistrict = new ArrayList<City>();
		SakramentoDistrict.add(new City("Sakramento"));
		SakramentoDistrict.add(new City("Stockton"));
		SakramentoDistrict.add(new City("Modesto"));
		List<City> LosAngelesDistrict = new ArrayList<City>();
		LosAngelesDistrict.add(new City("Los Angeles"));
		LosAngelesDistrict.add(new City("Oxnard"));
		District DistrictSanFrancisco = new District(SanFranciscokDistrict);
		District DistrictSakramento = new District(SakramentoDistrict);
		District DistrictLosAngeles = new District(LosAngelesDistrict);
		List<District> CaliforniaRegion = new ArrayList<District>();
		CaliforniaRegion.add(DistrictSanFrancisco);
		CaliforniaRegion.add(DistrictSakramento);
		CaliforniaRegion.add(DistrictLosAngeles);
		State StateCalifornia = new State("Sakramento", CaliforniaRegion);

		////////////////////////////////////////////////////////////////////////////

		List<State> usaList = new ArrayList<State>();
		usaList.add(StateCalifornia);
		usaList.add(StateMaryland);
		Country usa = new Country("Washington", 9834000, usaList);

		////////////////////////////////////////////////////////////////////////////

		PrintUSA printer = new PrintUSA();
		printer.printCapitalUSA(usa);
		printer.printSumStates(usa);
		printer.printSquareUSA(usa);
		printer.printCapitalStates(usa);

	}

}
