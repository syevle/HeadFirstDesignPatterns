package GangOfFour.myexample.behavioral.strategypattern_1;

public class BusTravelStrategy implements TravelStrategy {

	public void gotoAirport() {
		System.out
				.println("Traveler is going to Airport by bus and will be charged 200 Rs");
	}

}
